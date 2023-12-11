package training.spring.jt;

import java.util.Iterator;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class EmpClient {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp2.xml");
		DataSource ds = (DataSource) ctx.getBean("myDataSource");
		//EmployeeJdbcDAO empDao = new EmployeeJdbcDAO();
		// invoke the setDataSource() method on the superclass
		EmployeeJdbcDAO empDao=(EmployeeJdbcDAO)ctx.getBean("employeeDAO");
		empDao.setDataSource(ds);

		Iterator empIter = empDao.getAllEmployees().iterator();
		while (empIter.hasNext()) {
			Emp emp = (Emp) empIter.next();
			System.out.println(emp.getLastName() + " (" + emp.getJobTitle()
					+ ")");
		}// while
		System.out.println("The Salary Sum = " + empDao.getSalarySum());
	}// main
}// EmployeeClient