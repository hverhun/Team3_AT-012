package com.lits012.sorting;

import java.util.List;

import com.lits012.JavaTeamProject.dto.Employee;

public class Sorting{
	
	public static List<Employee> sort(List<Employee> employees){
		Employee temp = new Employee();
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < employees.size() - 1; i++) {
				if (employees.get(i).getLastName().toString().compareTo(employees.get(i + 1).getLastName().toString()) >= 0) {

					if (employees.get(i).getLastName().toString().compareTo(employees.get(i + 1).getLastName().toString()) > 0) {
						temp = employees.get(i);
						employees.set(i, employees.get(i + 1));
						employees.set(i + 1, temp);
						swapped = true;
					}

					else if (employees.get(i).getPosition().toString()
							.compareTo(employees.get(i + 1).getPosition().toString()) >= 0) {

						if (employees.get(i).getPosition().toString()
								.compareTo(employees.get(i + 1).getPosition().toString()) > 0) {
							temp = employees.get(i);
							employees.set(i, employees.get(i + 1));
							employees.set(i + 1, temp);
							swapped = true;
						}

						else if (employees.get(i).getSalary().toString()
								.compareTo(employees.get(i + 1).getSalary().toString()) >= 0) {

							if (employees.get(i).getSalary().toString()
									.compareTo(employees.get(i + 1).getSalary().toString()) > 0) {
								temp = employees.get(i);
								employees.set(i, employees.get(i + 1));
								employees.set(i + 1, temp);
								swapped = true;
							}

						}
					}
				}

			}

		}
		
		return employees;
		
	}
	
	
}
