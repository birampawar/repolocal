
package training.spring.annotation;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateDemo {

	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("empanno.xml");
		JdbcTemplateDemo demo = (JdbcTemplateDemo) ctx.getBean("jdbcTemplateDemo");
		demo.run();

	}

	@SuppressWarnings("unchecked")
	private void run() {
		this.jdbcTemplate.execute(new ConnectionCallback() {
			public Object doInConnection(Connection conn) throws SQLException, DataAccessException {
				PreparedStatement pstmt = conn.prepareStatement("create table demo1(id integer)");
				pstmt.execute();
				return null;
			}
		});

		this.jdbcTemplate.execute(new StatementCallback() {
			public Object doInStatement(Statement stmt) throws SQLException, DataAccessException {
				return stmt.execute("insert into demo1 values(100)");
			}
		});

		this.jdbcTemplate.execute("insert into demo1 values(200)");

		List ids;
		ids = this.jdbcTemplate.queryForList("select id from demo1");
		Iterator it = ids.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
