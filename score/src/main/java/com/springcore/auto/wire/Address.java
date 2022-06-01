package com.springcore.auto.wire;

public class Address {
   private String line;

	public String getLine() {
		return line;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setLine(String line) {
		this.line = line;
	}

	public Address(String line) {
		super();
		this.line = line;
	}

	@Override
	public String toString() {
		return "Address [line=" + line + "]";
	}
    
}
