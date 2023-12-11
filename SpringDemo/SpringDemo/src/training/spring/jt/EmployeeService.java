package training.spring.jt;

import java.util.List;

public interface EmployeeService {

	public void setEmployeeDao(EmployeeDAO employeeDAO);

	public List getAllEmployees();

	public long getSalarySum();

}