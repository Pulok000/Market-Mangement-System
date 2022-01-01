package classes;
import java.lang.*;
import interfaces.*;

public class LocalProduct extends Product
{
	private double discountRate;

	public void setDiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}

	public double getDiscountRate()
	{
		return discountRate;
	}
	public  void showInfo()
	{
		System.out.println("Local Product:");
		System.out.println("--------------");
		System.out.println("Product ID: "+getPid());
		System.out.println("Product Name: "+getName());
		System.out.println("Available Quantity: "+getAvailableQuantity());
		System.out.println("Price: "+getPrice());
		System.out.println("Discount Rate: "+discountRate);
		System.out.println();
	}

}