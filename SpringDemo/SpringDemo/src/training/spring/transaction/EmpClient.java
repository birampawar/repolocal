package training.spring.transaction;

import java.util.Iterator;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.transaction.EmployeeServiceImpl;

class EmpClient {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("trans-template.xml");
		EmployeeService empService=(EmployeeService)ctx.getBean("employeeService");
		//DataSource ds = (DataSource) ctx.getBean("myDataSource");
		//EmployeeJdbcDAO empDao = new EmployeeJdbcDAO();
		// invoke the setDataSource() method on the superclass
		//EmployeeJdbcDAO empDao=(EmployeeJdbcDAO)ctx.getBean("employeeDAO");
		//empDao.setDataSource(ds);
		
		 Emp eobj=new Emp(101, "Neel", "Analyst", 50000);
		 empService.insertEmp(eobj);
		 Emp eobj1=new Emp(102, "Tejas", "Manage", 80000);
		 empService.insertEmp(eobj1);
		 
		Iterator empIter = empService.getAllEmployees().iterator();
		while (empIter.hasNext()) {
			Emp emp = (Emp) empIter.next();
			System.out.println(emp.getFirstName() + " (" + emp.getJobTitle()
					+ ")");
		}// while
		System.out.println("The Salary Sum = " + empService.getSalarySum());
	}// main
}// EmployeeClient