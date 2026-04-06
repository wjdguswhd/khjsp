package employee.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employee.model.vo.Employee;

public class EmployeeDAO {

	public Employee login(Connection conn, Employee e) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Employee login = null;
		
		String query = "select * from v_selectemp where empno=? and pwd=? and status='Y'";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, e.getEmpNo());
			pstmt.setString(2, e.getPwd());
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				login = new Employee(rset.getInt("empno"),
									 rset.getString("pwd"),
									 rset.getString("ename"),
									 rset.getString("job"),
									 rset.getInt("mgr_no"),
									 rset.getString("mgr"),
									 rset.getDate("hireDate"),
									 rset.getInt("sal"),
									 rset.getInt("comm"),
									 rset.getInt("deptno"),
									 rset.getString("dname"),
									 rset.getString("is_admin"),
									 rset.getString("status"));
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return login;
	}

}
