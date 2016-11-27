package org.aritz.backend.exam01.dao;

import java.util.List;

import org.aritz.backend.exam01.dao.models.Employee;


public interface EmployeeDAOInterface {

	public Employee selectById(Long id);
	public List<Employee> selectAll ();
	public void insert (Employee employee);
	public void update (Employee employee);
	public void delete (Employee employee);
	
}
