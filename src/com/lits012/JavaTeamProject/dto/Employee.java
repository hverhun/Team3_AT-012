package com.lits012.JavaTeamProject.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	private String lastName;
	private String position;
	private int salary;

	@JsonCreator
	public Employee(@JsonProperty("lastName") String lastName, @JsonProperty("position") String position,
                       @JsonProperty("salary") int salary) {
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getLastName() {
		return lastName;
	}

	public String getPosition() {
		return position;
	}

	public int getSalary() {
		return salary;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee that = (Employee) o;

        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (salary != 0 ? !(salary == that.salary) : that.salary != 0) return false;

        return true;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "Last Name='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

}