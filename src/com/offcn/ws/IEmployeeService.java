package com.offcn.ws;

import javax.jws.WebService;

@WebService
public interface IEmployeeService {

	public void fun();
	
	public void fun2();
	
	public Employee findEmployeeById(Integer eid);
	
	public void saveEmployee(Employee employee);
}
