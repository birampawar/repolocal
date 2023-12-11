package training.spring.transaction;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO;
	TransactionTemplate txtemplate;

	public EmployeeServiceImpl() {
	}

	public void setEmployeeDao(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public TransactionTemplate getTxtemplate() {
		return txtemplate;
	}

	public void setTxtemplate(TransactionTemplate txtemplate) {
		this.txtemplate = txtemplate;
	}

	public List getAllEmployees() {
		List emps = employeeDAO.getAllEmployees();
		return emps;
	}// getAllEmployees()

	public long getSalarySum() {
		return employeeDAO.getSalarySum();
	}// getSalarySum

	@Override
	public int insertEmp(Emp e) {
		txtemplate.execute(new TransactionCallback<Void>() {			
			@Override
			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					System.out.println("In transaction");
					int i=employeeDAO.insertEmp(e);
				}catch (RuntimeException ex) {
					txStatus.setRollbackOnly();
					throw ex;
				}
				return null;
			}
			});
		return 0;
	
}
}