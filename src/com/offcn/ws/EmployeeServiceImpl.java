package com.offcn.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.offcn.ws.IEmployeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public void fun() {

	}

	@Override
	public void fun2() {

	}

	@Override
	public Employee findEmployeeById(Integer eid) {
		Employee employee = new Employee();
		employee.setEid(eid);
		employee.setName("李晓红");
		return employee;
	}

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("保存成功");
	}

}
