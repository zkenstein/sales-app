package com.victommasi.dto;

import com.victommasi.model.Customer;
import com.victommasi.model.Sale;

public class CustomObjectDTO {
	
	private Sale sale;
	private Customer customer;
	
	public CustomObjectDTO(){}
	
	public CustomObjectDTO(Customer customer, Sale sale){
		this.customer = customer;
		this.sale = sale;
	} 
	
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
