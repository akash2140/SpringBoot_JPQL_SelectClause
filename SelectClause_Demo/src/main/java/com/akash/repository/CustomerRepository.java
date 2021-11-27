package com.akash.repository;
import java.util.List;

import com.akash.dto.CustomerDTO;
import com.akash.exception.CustomerException;

public interface CustomerRepository 
{
	public List<CustomerDTO> getAllCustomers() throws CustomerException;
	public List<String> getCustomerName()throws CustomerException;
	public List<Object[]> getCustomerNameAndDob() throws CustomerException;
	
}
