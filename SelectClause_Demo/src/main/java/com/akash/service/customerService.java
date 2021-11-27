package com.akash.service;

import java.util.List;

import com.akash.dto.CustomerDTO;
import com.akash.exception.CustomerException;

public interface customerService 
{
	public List<CustomerDTO> getAllCustomer() throws CustomerException;
	public List<String> getCustomerName()throws CustomerException;
	public List<Object[]> getCustomerNameAndDob() throws CustomerException;
}
