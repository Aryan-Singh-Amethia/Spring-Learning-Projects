package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Emp {
    private String empName;
    private Properties props;
    private List<String> friends;
    private Map<String,Integer> salStructure; 
    
	public Map<String, Integer> getSalStructure() {
		return salStructure;
	}
	public void setSalStructure(Map<String, Integer> salStructure) {
		this.salStructure = salStructure;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Emp(String empName, Properties props) {
		super();
		this.empName = empName;
		this.props = props;
	}


	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", props=" + props + ", friends=" + friends + ", salStructure="
				+ salStructure + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Emp() {
		super();
	}

}
