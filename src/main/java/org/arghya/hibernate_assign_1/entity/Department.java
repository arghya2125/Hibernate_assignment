package org.arghya.hibernate_assign_1.entity;
import java.util.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="department_id")
private int departmentId;
@Column(name="department_name",length=30,nullable=false,unique=true)
private String departmentName;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
private List<Employee> employees;
public Department() {
	super();
	this.departmentId=0;
	this.departmentName=null;
	this.employees=null;

}
public Department(String departmentName, List<Employee> employees) {
	super();
	this.departmentName = departmentName;
	this.employees = employees;
}
public Department(String departmentName) {
	super();
	this.departmentName = departmentName;
}

public int getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
			+ employees + "]";
}

}