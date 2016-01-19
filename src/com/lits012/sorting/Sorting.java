package com.lits012.sorting;

import java.util.List;

import com.lits012.JavaTeamProject.dto.Employee;

public class Sorting {

	public static List<Employee> sort(List<Employee> employees) {
		Employee temp = new Employee();
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < employees.size() - 1; i++) {
				if (employees.get(i).getLastName().toString().toLowerCase()
						.compareTo(employees.get(i + 1).getLastName().toString().toLowerCase()) >= 0) {

					if (employees.get(i).getLastName().toString().toLowerCase()
							.compareTo(employees.get(i + 1).getLastName().toString().toLowerCase()) > 0) {
						temp = employees.get(i);
						employees.set(i, employees.get(i + 1));
						employees.set(i + 1, temp);
						swapped = true;
					}

					else if (employees.get(i).getPosition().toString().toLowerCase()
							.compareTo(employees.get(i + 1).getPosition().toString().toLowerCase()) >= 0) {

						if (employees.get(i).getPosition().toString().toLowerCase()
								.compareTo(employees.get(i + 1).getPosition().toString().toLowerCase()) > 0) {
							temp = employees.get(i);
							employees.set(i, employees.get(i + 1));
							employees.set(i + 1, temp);
							swapped = true;
						}

						else if (employees.get(i).getSalary() > employees.get(i + 1).getSalary()) {

							temp = employees.get(i);
							employees.set(i, employees.get(i + 1));
							employees.set(i + 1, temp);
							swapped = true;

						}
					}
				}

			}

		}

		return employees;

	}

}
