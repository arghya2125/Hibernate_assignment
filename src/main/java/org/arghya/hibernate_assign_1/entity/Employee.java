package org.arghya.hibernate_assign_1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;
	@Column(name="name",length=30,nullable=false)
	private String name;
	@Column(name="salary",length=30,nullable=false)
	private int salary;
	@ManyToOne
	@JoinColumn(name="department_id") //foreign key
	private Department department;
	public Employee() {
		super();
		this.employeeId=0;
		this.name=null;
		this.salary=0;
		this.department=null;
	}
	public Employee(String name,  int salary, Department department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	//getters and setters
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ",  salary=" + salary
				+ "]";
	}
	
	
}
