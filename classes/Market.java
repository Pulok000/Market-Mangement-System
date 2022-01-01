package classes;
import java.lang.*;
import interfaces.*;
public class Market implements EmployeeOperations,ShopOperations
{
	private Shop shops[] = new Shop[50];
	private Employee employees[]=new Employee[200];

	public void insertEmployee(Employee e)
	{
		boolean flag=false;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i]==null)
			{
				employees[i]=e;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee Inserted");
		}
		else
		{
			System.out.println("Employee can Not be Inserted");
		}
	}
	public void removeEmployee(Employee e)
	{
		boolean flag=false;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i]==e)
			{
				employees[i]=null;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee Removed");
		}
		else
		{
			System.out.println("Employee can Not be Removed");
		}

	}
	public Employee getEmployee(String empId)
	{
		Employee e=null;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i]!=null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e=employees[i];
					break;
				}
			}
		}
		return e;
	}





	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
		System.out.println();
		for(Employee e:employees)
		{
			if(e!=null)
			{
				
				System.out.println("Employee Name: "+e.getName());
				System.out.println("Employee ID: "+e.getEmpId());
				System.out.println("Employee Salary: "+e.getSalary());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}


	public void insertShop(Shop s)
	{
		boolean flag=false;
		for(int i=0;i<shops.length;i++)
		{
			if(shops[i]==null)
			{
				shops[i]=s;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Shop Inserted");
		}
		else
		{
			System.out.println("Shop can Not be Inserted");
		}
	}
	public void removeShop(Shop s)
	{
		boolean flag=false;
		for(int i=0;i<shops.length;i++)
		{
			if(shops[i]==s)
			{
				shops[i]=null;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Shop Removed");
		}
		else
		{
			System.out.println("Shop can Not be Removed");
		}
	}
	public Shop getShop(String sid)
	{
		Shop s=null;

		for(int i=0;i<shops.length;i++)
		{
			if(shops[i]!=null)
			{
				if(shops[i].getSid().equals(sid))
				{
					s=shops[i];
					break;
				}
			}
		}

		return s;
	}
	public void showAllShops()
	{
		for(Shop s: shops)
		{
			if(s!=null)
			{
				System.out.println("**********************************");
				System.out.println("Shop ID: "+s.getSid());
				System.out.println("Shop name: "+s.getName());
				System.out.println("----------------------------------");
				s.showAllProducts();
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}




}