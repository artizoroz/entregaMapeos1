package org.aritz.backend.exam01;

import java.util.List;

import org.aritz.backend.exam01.dao.EmployeeDAO;
import org.aritz.backend.exam01.dao.EmployeeDAOInterface;
import org.aritz.backend.exam01.dao.models.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee employee1 = new Employee(null, "Aritz", "aritz@gmail.com", 1500F);
    	Employee employee2 = new Employee(null, "Oroz", "oroz@gmail.com", 1600F);
    	
    	EmployeeDAOInterface employeeDAO = new EmployeeDAO();
    	employeeDAO.insert(employee1);
    	employeeDAO.insert(employee2);
    	
    	List<Employee> employees = employeeDAO.selectAll();
    	
    	for(Employee employee:employees){
    		System.out.println(employee.toString());
    	}
    }
}
