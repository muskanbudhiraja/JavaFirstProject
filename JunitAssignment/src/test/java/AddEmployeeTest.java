import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddEmployeeTest {

	private Employee emp;
		
	@Before
	public void setup()
	{
		emp = new Employee();
		emp.setId(1);
		emp.setName("John");
		emp.setCity("Bangalore");
	}
	
	@Test
	public void addEmployeeShouldAddEmployee()
	{
		boolean actual=AddEmployee.addEmployee(emp);
		assertEquals(true, actual);
	}

	@Test
	public void getEmployeeShouldReturnEmployee()
	{		
		assertNotNull(AddEmployee.getEmployee(1));
		//assertEquals(emp, AddEmployee.getEmployee(1));
	}
	
	@Test
	public void getEmployeeShouldReturnNull()
	{		
		assertNull(AddEmployee.getEmployee(2));
	}
}
