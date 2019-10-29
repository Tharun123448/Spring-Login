package com.sphib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.sphib.beans.Employee;
import com.sphib.dao.EmployeeDao;

public class Test {
	public static void main(String[] args) {
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao empDao = (EmployeeDao)context.getBean("employeeDaoImpl");
		Employee emp = new Employee();
		emp.setEmpId(453);
		emp.setEmpName("Satish");
		emp.setEmpSal(1172000.25f);
		emp.setEmpAddress("kadapa");
		String status = empDao.insertEmployee(emp);
		System.out.println("Staus : "+status);
		emp = empDao.searchEmployee(448);
		System.out.println("Searched employee details are :");
		System.out.println("Employee id : "+emp.getEmpId()+" Name : "+emp.getEmpName()+" Salary : "+emp.getEmpSal()+" Address : "+emp.getEmpAddress());
		emp.setEmpId(448);
		emp.setEmpName("Tharun Masarp");
		emp.setEmpSal(1521563);
		emp.setEmpAddress("Kadapa");
		status = empDao.updateEmployee(emp);
		System.out.println("Status : "+status);
		status = empDao.deleteEmployee(442);
		System.out.println("Status : "+status);
		
	}
}
