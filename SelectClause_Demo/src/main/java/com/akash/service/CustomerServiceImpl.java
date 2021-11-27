package com.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.dto.CustomerDTO;
import com.akash.exception.CustomerException;
import com.akash.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements customerService
{
	
	@Autowired
	CustomerRepository repo;

	@Override
	public List<CustomerDTO> getAllCustomer() throws CustomerException 
	{
		// TODO Auto-generated method stub
		List<CustomerDTO> customerList=repo.getAllCustomers();
		if(customerList.size()!=0)
		{
			return customerList;
		}
		else
			throw new CustomerException("NO_CUSTOMER_EXISTS");
	}

	@Override
	public List<String> getCustomerName() throws CustomerException
	{
		// TODO Auto-generated method stub
		return repo.getCustomerName();
	}

	@Override
	public List<Object[]> getCustomerNameAndDob() throws CustomerException {
		// TODO Auto-generated method stub
		return repo.getCustomerNameAndDob();
	}

}
