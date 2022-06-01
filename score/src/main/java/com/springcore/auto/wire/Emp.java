package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address") // use when multiple beans of sane type
    private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Being used");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
   
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Comstructor being used");
	}
    
}
