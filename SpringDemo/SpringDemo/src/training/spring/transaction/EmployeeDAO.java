package training.spring.transaction;
import java.util.List;

public interface EmployeeDAO {

    public long getSalarySum();
    public List getAllEmployees ();
    public int insertEmp(Emp e);
}
