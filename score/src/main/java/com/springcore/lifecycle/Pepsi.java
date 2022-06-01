package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
   private double price;

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public Pepsi(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public void afterPropertiesSet() throws Exception {
	System.out.println("Thinking to buy a pepsi.");
}

public void destroy() throws Exception {
	System.out.println("Throwing pepsi bottle away.");
}
   
}
