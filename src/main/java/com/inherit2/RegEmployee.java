package com.inherit2;
import jakarta.persistence.*;
@Entity
@Table(name="EMP1")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
    @AttributeOverride(name="name",column=@Column(name="name"))	
})

public class RegEmployee extends Employee{
  private float salary;
  private String dept;
  public RegEmployee(float salary,String dept,String name) {
		super(name);
		this.salary=salary;
		this.dept=dept;
		}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
  
	
	
}
