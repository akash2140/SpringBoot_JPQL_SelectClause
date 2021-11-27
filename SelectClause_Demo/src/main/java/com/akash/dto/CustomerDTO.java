package com.akash.dto;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerDTO 
{
	private Integer customerId;
	private String city;
	private LocalDate dateOfBirth;
	private String emailId;
	private String name;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, customerId, dateOfBirth, emailId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		return Objects.equals(city, other.city) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", city=" + city + ", dateOfBirth=" + dateOfBirth
				+ ", emailId=" + emailId + ", name=" + name + "]";
	}
	
}
