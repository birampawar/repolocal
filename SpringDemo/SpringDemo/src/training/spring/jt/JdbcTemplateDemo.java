package training.spring.jt;

import java.sql.*;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;

public class JdbcTemplateDemo {

	private static JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp1.xml");
		JdbcTemplateDemo demo = (JdbcTemplateDemo) ctx
				.getBean("jdbcTemplateDemo");
		
		demo.run();

	}

	@SuppressWarnings("unchecked")
	private void run() {

		this.jdbcTemplate.execute(new ConnectionCallback() {
			public Object doInConnection(Connection conn) throws SQLException,
					DataAccessException {
				PreparedStatement pstmt = conn
						.prepareStatement("create table demo(id varchar(3))");
				pstmt.execute();
				return null;
			}
		});
		
		//jdbcTemplate.execute("create table demo(id number(3))");

		this.jdbcTemplate.execute(new StatementCallback() {
			public Object doInStatement(Statement stmt) throws SQLException,
					DataAccessException {
				return stmt.execute("insert into demo values('100')");
			}
		});
		this.jdbcTemplate.execute("insert into demo values('200')");
		List ids;
		
		ids = this.jdbcTemplate.queryForList("select id from demo");
		Iterator it = ids.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
