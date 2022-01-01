package classes;
import java.lang.*;
import interfaces.*;
public class Employee
{
	private String name;
	private String empid;
	private double salary;

	public void setName(String name)
	{
		this.name=name;
	}

	public void setEmpId(String empid)
	{
		this.empid=empid;
	}

	public void setSalary(double salary)
	{
		this.salary=salary;
	}

	public String getName()
	{
		return name;
	}
	public String getEmpId()
	{
		return empid;
	}

	public double getSalary()
	{
		return salary;
	}
}