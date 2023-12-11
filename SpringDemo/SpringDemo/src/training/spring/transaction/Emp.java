package training.spring.transaction;

import java.util.Date;

public class Emp {
	int empno;
	String FirstName;
	String JobTitle;
	int Salary;
	

	public Emp() {
	}
	
	

	public Emp(int empno, String firstName, String jobTitle, int i) {
		super();
		this.empno = empno;
		FirstName = firstName;
		JobTitle = jobTitle;
		Salary = i;
	}



	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String JobTitle) {
		this.JobTitle = JobTitle;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}


}