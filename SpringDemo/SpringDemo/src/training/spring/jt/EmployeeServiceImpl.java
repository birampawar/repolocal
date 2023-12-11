package training.spring.jt;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO;

	public EmployeeServiceImpl() {
	}

	public void setEmployeeDao(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public List getAllEmployees() {
		List emps = employeeDAO.getAllEmployees();
		return emps;
	}// getAllEmployees()

	public long getSalarySum() {
		return employeeDAO.getSalarySum();
	}// getSalarySum
}