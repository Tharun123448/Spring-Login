package com.sphib.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.sphib.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public String insertEmployee(Employee emp) {
		Integer in = (Integer)hibernateTemplate.save(emp);
		if(in==emp.getEmpId()) {
			return "Employee data saved suceessfully";
		}else {
		return "failed to save data";
		}
		
	}

	@Override
	@Transactional
	public Employee searchEmployee(int empId) {
		Employee emp = hibernateTemplate.get(Employee.class, empId);
		return emp;
	}

	@Override
	@Transactional
	public String updateEmployee(Employee emp) {
		
			hibernateTemplate.update(emp);
		
		return "SuccessFully Updated Employee Id :"+emp.getEmpId();
	}

	@Override
	@Transactional
	public String deleteEmployee(int empId) {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		hibernateTemplate.delete(emp);
		return "employee got removed "+empId ;
	}
	
	
}
