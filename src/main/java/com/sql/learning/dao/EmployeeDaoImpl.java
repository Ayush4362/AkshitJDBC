package com.sql.learning.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.sql.learning.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static Statement stmt = null;
	static final String INSERT_QUERY = "INSERT INTO EMPLOYEE(ID, NAME , GENDER , SALARY) VALUES(%d,'%s','%s',%d)";
	static final String UPDATE_QUERY = "UPDATE EMPLOYEE SET NAME = '%s', GENDER = '%s' , SALARY = %d WHERE ID = %d";
	static final String DELETE_QUERY = "DELETE FROM EMPLOYEE WHERE ID = %d";

	static {
		try {
			stmt = DriverManager.getConnection("jdbc:mysql://localhost:3306/sameer", "root", "root").createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveEmployee(Employee e) throws SQLException {
		stmt.executeUpdate(String.format(INSERT_QUERY, e.getId(), e.getName(), e.getGender(), e.getSalary()));
		System.out.println(String.format(INSERT_QUERY, e.getId(), e.getName(), e.getGender(), e.getSalary()));
	}

	@Override
	public void updateEmployee(Employee e) throws SQLException {
		stmt.executeUpdate(String.format(UPDATE_QUERY, e.getName(), e.getGender(), e.getSalary(), e.getId()));

		System.out.println(String.format(UPDATE_QUERY, e.getName(), e.getGender(), e.getSalary(), e.getId()));
	}

	@Override
	public void deleteEmployeeById(int id) throws SQLException {
		stmt.executeUpdate(String.format(DELETE_QUERY, id));
		System.out.println((String.format(DELETE_QUERY, id)));
	}

	@Override
	public void getAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getEmployeeById(int id) {
		// TODO Auto-generated method stub

	}
	
}
