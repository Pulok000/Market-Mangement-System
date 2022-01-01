import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;
public class Start
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		Market m=new Market();

		boolean choice=true;
		

		while(choice)
		{
			System.out.println("Choose From  the following options?");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");

			System.out.print("Your Option: ");
			int option=sc.nextInt();


			switch(option)
			{
				case 1:
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Employee Management");
					System.out.println("-----------------------------------------");

					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");

					System.out.print("Your Option: ");
					int c1 = sc.nextInt();

					switch(c1)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Employee");

							Employee e = new Employee();

							System.out.print("Enter Employee Name: ");
							String name1;

							try
							{
								name1=bfr.readLine();
							}
							catch(IOException ioe)
							{
								name1="defaultName";
							}
							e.setName(name1);

							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							e.setEmpId(empId1);


							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							e.setSalary(salary1);

							m.insertEmployee(e);

							System.out.println("-----------------------------------------");
							break;

						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Employee");

							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							if(m.getEmployee(empId2)==null)
							{
								System.out.println("Employee Not Found");
							}
							else
							{
								m.removeEmployee(m.getEmployee(empId2));
							}

							System.out.println("-----------------------------------------");
							break;

						case 3:
							System.out.println("-----------------------------------------");
							System.out.println("Show All Employees");

							m.showAllEmployees();

							System.out.println("-----------------------------------------");
							break;
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Search an Employee");
							System.out.println();
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();

							Employee e3 = m.getEmployee(empId3);

							if(e3 !=null)
							{
								System.out.println("Employee Name is: "+e3.getName());
								System.out.println("Employee ID is: "+e3.getEmpId());
								System.out.println("Employee Salary is: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does NOT Exists");
							}

							System.out.println("-----------------------------------------");
							break;

						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;

						default:

							System.out.println("-----------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-----------------------------------------");
							break;

					}

					break;

				case 2:

					System.out.println("-----------------------------------------");
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Shop Management");
					System.out.println("-----------------------------------------");
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove Existing Shop");
					System.out.println("3. Show All Shops");
					System.out.println("4. Search a Shop");
					System.out.println("5. Go Back");

					System.out.print("Your Option: ");
					int c2 = sc.nextInt();

					switch(c2)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Shop");

							Shop shop1 = new Shop();
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							shop1.setSid(sid1);
							String name1;
							System.out.print("Enter Shop Name: ");
							try
							{
								name1 = bfr.readLine();
							}
							catch(IOException ioe)
							{
								name1 = "defaultName";
							}

							shop1.setName(name1);

							m.insertShop(shop1);

							System.out.println("-----------------------------------------");
							break;

						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("2. Remove Existing Shop");

							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();

							Shop shop2=m.getShop(sid2);

							if(shop2==null)
							{
								System.out.println("Shop Not Found");
							}
							else
							{
								m.removeShop(shop2);
							}

							System.out.println("-----------------------------------------");
							break;

						case 3:

							System.out.println("-----------------------------------------");
							System.out.println("Show All Shops");

							m.showAllShops();

							System.out.println("-----------------------------------------");
							break;

						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Search a Shop");
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();

							Shop shops3=m.getShop(sid3);

							if(shops3 !=null)
							{
								System.out.println("Shop ID: "+shops3.getSid());
								System.out.println("Shop Name: "+shops3.getName());
								shops3.showAllProducts();
							}
							else
							{
								System.out.println("Shop Does NOT Exists");
							}
							System.out.println("-----------------------------------------");
							break;

						case 5:	
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;

						default:

							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}



					break;
				case 3:

					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Shop Product Management");
					System.out.println("-----------------------------------------");
					System.out.println("What do you want to do?");
					System.out.println("1. Insert New Product");
					System.out.println("2. Remove Existing Product");
					System.out.println("3. Show All Product");
					System.out.println("4. Search a Product");
					System.out.println("5. Go Back");

					System.out.print("Your Option: ");
					int c3 = sc.nextInt();


					switch(c3)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Product for a Shop\n");
							System.out.println("What kind of Product do you want to insert?");
							System.out.println("1. Local Product");
							System.out.println("2. Imported Product");
							System.out.println("3. Go Back");

							System.out.print("Your choice: ");
							int type = sc.nextInt();

							Product p=null;

							if(type==1)
							{
								System.out.print("Enter Product ID: ");
								String proId1 = sc.next();
								System.out.print("Enter Product Name: ");
								String proName1;

								try
								{
									proName1=bfr.readLine();
								}
								catch(IOException ioe)
								{
									proName1="defaultName";
								}

								System.out.print("Enter Product's Available Quantity: ");
								int proAvailableQuantity1=sc.nextInt();
								System.out.print("Enter Product Price: ");
								double proPrice1=sc.nextDouble();
								System.out.print("Enter Discount Rate: ");
								double prodiscount1 = sc.nextDouble();


								LocalProduct lp=new	LocalProduct();
								lp.setPid(proId1);
								lp.setName(proName1);
								lp.setAvailableQuantity(proAvailableQuantity1);
								lp.setPrice(proPrice1);
								lp.setDiscountRate(prodiscount1);

								p=lp;

							}
							else if(type == 2)
							{
								System.out.print("Enter Product ID: ");
								String proId2 = sc.next();
								System.out.print("Enter Product Name: ");
								String proName2;
								try
								{
									proName2=bfr.readLine();
								}
								catch(IOException ioe)
								{
									proName2="defaultName";
								}

								System.out.print("Enter Product's Available Quantity: ");
								int proAvailableQuantity2=sc.nextInt();
								System.out.print("Enter Product Price: ");
								double proPrice2=sc.nextDouble();
								System.out.print("Enter Country Name: ");
								String proCountryName1;

								try
								{
									proCountryName1=bfr.readLine();
								}
								catch(IOException ioe)
								{
									proCountryName1="Country Name";
								}

								ImportedProduct ip =new ImportedProduct();
								ip.setPid(proId2);
								ip.setName(proName2);
								ip.setAvailableQuantity(proAvailableQuantity2);
								ip.setPrice(proPrice2);
								ip.setCountryName(proCountryName1);
								p=ip;
							}
							else if(type == 3)
							{
								System.out.println("Going Back ...");
							}
							else
							{
								System.out.println("Invalid Type");
							}

							if(p!=null)
							{
								System.out.print("Enter Shop ID: ");

								String proId3;
								proId3=sc.next();
								try
								{

								m.getShop(proId3).insertProduct(p);
								}
								catch(NullPointerException npe)
								{
									System.out.println("NullPointerException Occured");
								}
							}

							System.out.println("-----------------------------------------");
							break;

						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Shop");

							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							System.out.print("Enter Product Id: ");
							String proId4 = sc.next();
							try
							{

							Shop ss=m.getShop(sid4);
							Product pp=ss.getProduct(proId4);
							ss.removeProduct(pp);

							}
							catch(NullPointerException npe)
							{
							System.out.println("NullPointerException Occured");
							}

							System.out.println("-----------------------------------------");
							break;


						case 3:

							System.out.println("-----------------------------------------");
							System.out.println("Show All Product");

							System.out.print("Enter Shop ID: ");
							String sid5 = sc.next();
							try
							{
							m.getShop(sid5).showAllProducts();
							}
							catch(NullPointerException npe)
							{
							System.out.println("NullPointerException Occured");
							}

							System.out.println("-----------------------------------------");
							break;
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Search a Product");
							System.out.println();

							System.out.print("Enter Shop ID: ");
							String sid6 = sc.next();

							System.out.print("Enter Product ID: ");
							String proId5 = sc.next();
							try
							{
							Product p3=m.getShop(sid6).getProduct(proId5);
							

							if(p3!=null)
							{
								p3.showInfo();

							}
							else
							{
								System.out.println("Product Not Found");
							}
							}
							catch(NullPointerException npe)
							{
							System.out.println("NullPointerException Occured");
							}							
							System.out.println("-----------------------------------------");
							break;

						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");

							break;

						default:

							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;

					}

					break;

				case 4:


					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Product Quantity Add-Sell");
					System.out.println("-----------------------------------------");
					System.out.println("What do you want to do?\n");
					System.out.println("1. Add Product");
					System.out.println("2. Sell Product");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");

					System.out.print("Your Option: ");
					int c4 = sc.nextInt();

					switch(c4)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Add Product");
							System.out.print("Enter Shop ID: ");
							String sid7 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid6 = sc.next();
							System.out.print("Enter Amount of Quantity You Want to Add: ");
							int amount1 = sc.nextInt();

							try
							{
							if(amount1>0)
							{
								Shop ss1=m.getShop(sid7);
								Product pp1=ss1.getProduct(pid6);

								pp1.addQuantity(amount1);

								frwd.writeInFile(""+amount1 +" quantity added to product ID: "+pid6);

							}
							}
							catch(NullPointerException npe)
							{
							System.out.println("NullPointerException Occured");
							}							

							System.out.println("-----------------------------------------");
							break;

						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Sell Product");

							System.out.print("Enter Shop ID: ");
							String sid8 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid7 = sc.next();

							System.out.print("Enter Amount of Quantity You Want to Sell: ");
							int amount2 = sc.nextInt();

							try
							{
							if(amount2>0 && amount2<m.getShop(sid8).getProduct(pid7).getAvailableQuantity())
							{
								Shop ss2=m.getShop(sid8);
								Product pp2=ss2.getProduct(pid7);
								pp2.sellQuantity(amount2);

								frwd.writeInFile(""+ amount2 +" quantity sold form product ID: "+pid7);

							}
							}
							catch(NullPointerException npe)
							{
							System.out.println("NullPointerException Occured");
							}
							System.out.println("-----------------------------------------");
							break;
						case 3:
							
							System.out.println("-----------------------------------------");
							System.out.println("Show Add Sell History");
							try
							{
							frwd.readFromFile();
							}
							catch(NullPointerException npe)
							{
							System.out.println("NullPointerException Occured");
							}
							System.out.println("-----------------------------------------");
							break;	

						case 4:
						
							System.out.println("-----------------------------------------");
							System.out.println("Going back....");
							System.out.println("-----------------------------------------");
							break;

						default:

							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}

					break;


				case 5:
					
					System.out.println("You have choosen to exit");
					choice = false;
					break;

				default:
				
					System.out.println("Invalid Option");
					break;


			}
		}
	}
}