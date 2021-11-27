package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.akash.dto.CustomerDTO;
import com.akash.exception.CustomerException;
import com.akash.service.customerService;


@Controller
public class CustomerController 
{
	@Autowired
	private customerService serv;
	
	public List<CustomerDTO> getAllCustomers()throws CustomerException
	{
		return serv.getAllCustomer();
	}
	
	public List<String> getCustomerName()throws CustomerException{
		return serv.getCustomerName();
	}
	
	public List<Object[]> getCustomerNameAndDob() throws CustomerException{
		return serv.getCustomerNameAndDob();
	}
}
