package com.springcore.ref;

public class A {
    public A(String name, B obj) {
		super();
		this.name = name;
		this.obj = obj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", obj=" + obj + "]";
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	private String name;
    private B obj;
	public A() {
		// TODO Auto-generated constructor stub
	}

}
