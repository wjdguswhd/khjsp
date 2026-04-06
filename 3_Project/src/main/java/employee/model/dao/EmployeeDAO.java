package employee.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import employee.model.vo.Employee;

public class EmployeeDAO {

	public Employee login(Connection conn, Employee e) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Employee login = null;
		
		String query = "select * from v_selectemp where empno=? and pwd=? and status='Y'";
		return null;
	}

}
