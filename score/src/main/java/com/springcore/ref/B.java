package com.springcore.ref;

public class B {
   private int num;

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public B() {
	super();
	// TODO Auto-generated constructor stub
}

public B(int num) {
	super();
	this.num = num;
}

@Override
public String toString() {
	return "B [num=" + num + "]";
}
   
}
