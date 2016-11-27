package org.aritz.backend.exam01.dao.models;

public class Employee {

	private Long id;
	private String name;
	private String email;
	private Float salary;
	/**
	 * 
	 */
	public Employee() {
	}
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param salar
	 */
	public Employee(Long id, String name, String email, Float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the salary
	 */
	public Float getSalary() {
		return salary;
	}
	/**
	 * @param salar the salary to set
	 */
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	};
	
	
	
}
