package classes;
import java.lang.*;
import interfaces.*;

public class Shop implements ProductOperations
{
	private String sid;
	private String name;
	private Product products[]=new Product[800];

	public void setSid(String sid)
	{
		this.sid=sid;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getSid()
	{
		return sid;
	}

	public String getName()
	{
		return name;
	}



	public void insertProduct(Product p)
	{
		boolean flag=false;
		for(int i=0;i<products.length;i++)
		{
			if(products[i]==null)
			{
				products[i]=p;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Products Inserted");
		}
		else
		{
			System.out.println("Can not insert");
		}

	}
	public void removeProduct(Product p)
	{
		boolean flag=false;
		for(int i=0;i<products.length;i++)
		{
			if(products[i]==p)
			{
				products[i]=null;
				flag=true;
				break;
			}
			if(flag)
			{
				System.out.println("Product Removed");
			}
			else
			{
				System.out.println("Can Not Remove");
			}
		}
	}
	public Product getProduct(String pid)
	{
		Product p=null;
		for(int i=0;i<products.length;i++)
		{
			if(products[i]!=null)
			{
				if(products[i].getPid().equals(pid))
				{
					p=products[i];
					break;
				}
			}
		}

		return p;
	}
	public void showAllProducts()
	{
		System.out.println("Products Info:");
		for(Product p: products)
		{
			if(p!=null)
			{
				p.showInfo();
			}
		}
	}
}