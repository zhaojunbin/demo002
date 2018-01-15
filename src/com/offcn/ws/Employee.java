package com.offcn.ws;

public class Employee {

	private String name;
	private int eid;
	private String sex;

	public Employee() {
		super();
	}

	public Employee(String name, int eid, String sex) {
		super();
		this.name = name;
		this.eid = eid;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
