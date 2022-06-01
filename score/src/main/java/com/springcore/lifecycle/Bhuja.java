package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bhuja {
   private double price;

public Bhuja(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Bhuja [price=" + price + "]";
}

@PostConstruct
public void start() {
	System.out.println("starting method");
}

@PreDestroy
public void end() {
	System.out.println("ending method");
}
}
