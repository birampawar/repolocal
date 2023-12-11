package training.spring.transaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;



public class EmployeeJdbcDAO extends JdbcDaoSupport implements EmployeeDAO {

	public long getSalarySum() {
		JdbcTemplate jt = getJdbcTemplate();
		//return jt.queryForLong("select sum(salary) from Employee");
		return jt.queryForObject("Select sum(salary) from Employee",Long.class);
		
	}// getSalarySum

	@SuppressWarnings("unchecked")
	public List getAllEmployees() {
		JdbcTemplate jt = getJdbcTemplate();
		return jt.query("select name,desig from Employee", new EmployeeRowMapper());
	}// getAllEmployees

	// this inner class is invoked for each Row om the ResultSet. It implements
	// the Spring RowMapper interface, that is used to convert ResultSet records
	// to Domain Objects.
	class EmployeeRowMapper implements RowMapper {
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			Emp emp = new Emp();
			emp.setFirstName(rs.getString(1));
			emp.setJobTitle(rs.getString(2));
			return emp;
		}
	}// class EmployeeRowMapper

	@Override
	public int insertEmp(Emp e) {
		JdbcTemplate jt=getJdbcTemplate();
		String sql="insert into employee values(?,?,?,?)";
		Object[] params=new Object[]{e.getEmpno(),e.getFirstName(),e.getJobTitle(),e.getSalary()};
		int[] types=new int[] {Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.INTEGER};
		return jt.update(sql,params,types);
	}
}// EmployeeJdbcDao

