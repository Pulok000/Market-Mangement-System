package classes;
import java.lang.*;
import interfaces.*;

public class ImportedProduct extends Product
{
	private String countryName;

	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}

	public  void showInfo()
	{
		System.out.println("Imported Product:");
		System.out.println("----------------");
		System.out.println("Product ID: "+getPid());
		System.out.println("Product Name: "+getName());
		System.out.println("Available Quantity: "+getAvailableQuantity());
		System.out.println("Price: "+getPrice());
		System.out.println("Product's Country Name: "+countryName);
		System.out.println();
	}
}