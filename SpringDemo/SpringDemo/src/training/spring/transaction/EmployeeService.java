package training.spring.transaction;

import java.util.List;

public interface EmployeeService {

	//public void setEmployeeDao(EmployeeDAO employeeDAO);

	public List getAllEmployees();
	public long getSalarySum();
	public int insertEmp(Emp e);

}