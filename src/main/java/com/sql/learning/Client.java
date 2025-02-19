package com.sql.learning;

import java.sql.SQLException;

import com.sql.learning.dao.EmployeeDao;
import com.sql.learning.dao.EmployeeDaoImpl;
import com.sql.learning.entity.Employee;

public class Client {
	

	public static void main(String[] args) throws SQLException {
		EmployeeDao edao = new EmployeeDaoImpl();

		Employee shiv = new Employee(9,"Shiv","male",45789);
		Employee vinay = new Employee(10,"vinay","male",45789);
		Employee dhurv = new Employee(11,"dhurv","male",45789);
		Employee vipin = new Employee(12,"Sukoon kumar","male",45789);
		
		
		edao.deleteEmployeeById(13);
		
		System.out.println("Transaction successfully submitted..............");
		
		
	}

}
