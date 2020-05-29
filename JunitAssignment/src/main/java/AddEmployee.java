import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	private static List<Employee> list= new ArrayList<Employee>();
	
	static boolean addEmployee(Employee emp)
	{
		boolean i=list.add(emp);
		return i;
	}
	
	static Employee getEmployee(int id)
	{
		for(Employee e: list)
		{
			if(e.getId()==id)
				return e;
		}
		return null;
	}
}
