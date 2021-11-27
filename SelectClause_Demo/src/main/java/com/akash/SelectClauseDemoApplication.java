package com.akash;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.akash.controller.CustomerController;
import com.akash.dto.CustomerDTO;
import com.akash.exception.CustomerException;


@SpringBootApplication
public class SelectClauseDemoApplication implements CommandLineRunner {

	@Autowired
	private CustomerController controller;
	
	@Autowired
	Environment env;
	
	private static final Log logger=LogFactory.getLog(SelectClauseDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SelectClauseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//getAllCustomers();
		//getCustomerNames();
		getCustomerNameAndDob();
	}

	private void getCustomerNameAndDob() {
		// TODO Auto-generated method stub
		try {
			List<Object[]> objects=controller.getCustomerNameAndDob();
			
			for (Object[] object : objects) {
				logger.info(object[0]+"\t\t"+object[1]);
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void getCustomerNames() {
		// TODO Auto-generated method stub
		
		try {
			List<String> customerNames=controller.getCustomerName();
			
			customerNames.forEach((name)->{
				logger.info(name);
			});
		}
		catch(Exception e)
		{
			logger.info(e.getMessage());
		}
		
	}

	private void getAllCustomers()throws Exception
	{
		// TODO Auto-generated method stub

		try {
			List<CustomerDTO> customerList=controller.getAllCustomers();
			customerList.forEach((customer)->{
				logger.info(customer.toString());
			});
		}
		catch(Exception e)
		{
			logger.info(env.getProperty(e.getMessage()));
		}
	}
	
	

}
