package com.sphib.dao;

import com.sphib.beans.Employee;

public interface EmployeeDao {
	public String insertEmployee(Employee emp);
	public Employee searchEmployee(int empId);
	public String updateEmployee(Employee emp);
	public String deleteEmployee(int empId);
}
