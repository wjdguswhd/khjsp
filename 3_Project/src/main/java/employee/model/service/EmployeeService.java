package employee.model.service;

import static common.JDBCTemplate.getConnection;

import java.sql.Connection;

import employee.model.dao.EmployeeDAO;
import employee.model.vo.Employee;

public class EmployeeService {
	
	private EmployeeDAO empDAO = new EmployeeDAO();

	public Employee login(Employee e) {
		Connection conn = getConnection();
		Employee login = empDAO.login(conn,e);
		return login;
		
	}

}
