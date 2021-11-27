package com.akash.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.akash.dto.CustomerDTO;
import com.akash.entity.Customer;
import com.akash.exception.CustomerException;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository
{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<CustomerDTO> getAllCustomers() throws CustomerException 
	{
		// TODO Auto-generated method stub
		Query customerFetch=em.createQuery("select c from Customer c");
		List<Customer> customerList=customerFetch.getResultList();
		List<CustomerDTO> CustomerDto=new ArrayList<CustomerDTO>();
		
		customerList.forEach((customer)->{
			CustomerDTO dto=new CustomerDTO();
			dto.setCity(customer.getCity());
			dto.setCustomerId(customer.getCustomerId());
			dto.setDateOfBirth(customer.getDateOfBirth());
			dto.setEmailId(customer.getEmailId());
			dto.setName(customer.getName());
			CustomerDto.add(dto);
		});
		
		return CustomerDto;
	}

	@Override
	public List<String> getCustomerName() throws CustomerException 
	{
		// TODO Auto-generated method stub
		Query query = em.createQuery("select c.name from Customer c");
		List<String> customerNames=query.getResultList();
		return customerNames;
	}

	@Override
	public List<Object[]> getCustomerNameAndDob() throws CustomerException 
	{
		// TODO Auto-generated method stub
		Query query = em.createQuery("select c.name,c.dateOfBirth from Customer c");
		List<Object[]> nameAndDateOfBirthList=query.getResultList();
		return nameAndDateOfBirthList;
	}
	
}
