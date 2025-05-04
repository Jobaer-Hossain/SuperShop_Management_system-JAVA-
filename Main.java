import java.util.Scanner;
import java.util.InputMismatchException;
import Product.*;
import Person.*;
import SuperShop.*;
public class Main
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int numb = 1;
		int choice1;
		int addProduct;
		int addCustomer;
		int addEmployee;
		String ID;
		int Pass;
		int num;
		System.out.println("					T3S SuperShop");
		System.out.println("			Zomoz Road,Zoar Sahara,Vatara ,Dhaka,Bangladesh\n");
		System.out.println("	1.Admin");
		System.out.println("	2.User");
		System.out.print("\n	Enter 1 for ADMIN & Enter 2 for USER = ");
		int ii = sc.nextInt();
		numb=ii;
		Scanner s1=new Scanner(System.in);
		if(numb==1)
		{
			do
			{
			
			System.out.print("	Enter Admin ID: ");
			Scanner ad = new Scanner(System.in);
			ID = ad.nextLine();
			System.out.print("	Enter Admin Password: ");
			Scanner ad1 = new Scanner(System.in);
			Pass = ad1.nextInt();
			
				if (ID.equals("Admin")&&Pass==1234)
				{
					//ReadUserInfo.UserInfo();
					System.out.println("\n==========Welcome Admin===========");
					System.out.println("\n        1. Product Management");
					System.out.println("        2. Customer Management");
					System.out.println("        3. Employee Management");
					System.out.println("        4. Account Management");
					System.out.print("	Enter Serial number for management: ");
					choice1 = sc.nextInt();
					Supershop s=new Supershop("T3S",50000,50,12300);
					Product p = new Product();
					
					if (choice1 ==1)
					{
						do
						{
							System.out.println("\n==========Add & Remove product===========");
							System.out.print(" 	Press 1 for add Product & Press 2 for remove Product: ");					
							addProduct = ad1.nextInt(); 
							if(addProduct==1)
							{
						
								System.out.println("\n===========Add a new product===========");
								System.out.print("	ID: ");
								p.setPID(ad1.nextInt());
								System.out.print("	Name of Product: ");  
								String pName = ad1.next();
								p.setName(pName); 
								System.out.print("	Price: ");  
								p.setPrice(ad1.nextDouble()) ; 	
								System.out.print("	Add Quantity: ");  
								p.setAvaiavleQuantity(ad1.nextDouble()) ; 	
								System.out.print("	Category: ");  
								p.setCategory(ad1.next()); 	
								s.showProduct();
								s.addProduct(p);
								p.show();
							}
							else if(addProduct==2)
							{
								System.out.print("	ID: ");
								p.setPID(ad1.nextInt());
								//if (setPID=p.pId)
								//{
								s.removeProduct(p);
								//}
							}
					
							System.out.print("\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt(); 
						}while(ii==1);	
					}
					
					
					if (choice1 ==2)
					{	do
						{
							System.out.println("	\n	Press 1 for add Customer & Press 2 for remove Customeer: ");					
							addCustomer = ad1.nextInt(); 
							Customer c = new Customer();
							if(addCustomer==1)
							{
								System.out.println("\n============Add new Customer==========");
								System.out.print("	\nName: ");
								c.setname(ad1.next());
								System.out.print("	\n	ContactNumber: ");
								c.setContactNumber(ad1.next());
								System.out.print("	\n	Age: ");  
								c.setage(ad1.nextInt());
								System.out.print("	\n	Address :"); 
								c.setAddress(ad1.next());
								s.addCustomer(c);
								c.show();
							}
			
							else if(addCustomer==2)
							{
								System.out.print("	ID: ");
								c.setCID(ad1.nextInt());
								s.removeCustomer(c);
							}
							System.out.print("\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt(); 
						}while(ii==1);	
					}
					
					
					if (choice1 ==3)
					{
						do
						{
							System.out.println("\n 	Press 1 for add Employee & Press 2 for remove Employee: ");				
							addEmployee = ad1.nextInt(); 
							Employee e = new Employee();
							if(addEmployee==1)
							{
								System.out.println("\n=========Add new Employee=========");
								System.out.print("	\n	Name: ");
								e.setname(ad1.next());
								System.out.print("	ContactNumber: ");
								e.setContactNumber(ad1.next());
								System.out.print("	Age: ");  
								e.setage(ad1.nextInt());
								System.out.print("	ID: ");
								e.setId(ad1.next());
								System.out.print("	Salary: ");
								e.setSalary(ad1.nextDouble());
								s.addEmployee(e);
								//e.show();
							}
							else if(addEmployee==2)
							{
								System.out.print("	ID: ");
								e.setId(ad1.nextLine());
								s.removeEmployee(e);
							}
							System.out.print("\n	Press 1 for continue 2 for Main menu: ");
		
							ii=s1.nextInt();  
						}while(ii==1);
					}
					if(choice1==4)
					{
						System.out.println("\n	Press 1 for Withdraw & Press 2 for Deposite");
						int account=ad1.nextInt();
						BankAccount b=new BankAccount("12345","T3S SuperShop",1000);
						if(account==1)
						{
							System.out.println("\n=========Deposite =========");
							System.out.print("	\n	Input Deposite Amount: ");
							b.deposite(ad1.nextInt());
							b.show();
						}
						if(account==2)
						{
							System.out.println("\n=========withdraw =========");
							System.out.print("	\n	Input withdraw Amount: ");
							b.withdraw(ad1.nextInt());
							b.show();
						}
					}
				}
				else
				{
					System.out.println("	Wrong ID or Password! Please Try Again");
				}
				System.out.print("	\n	Press 1 for continue  2 for logout: ");
				num=s1.nextInt();  
			}while(num==2);
		}
		else if(numb==2)
		{
			System.out.print("	Enter Your Name as User ID: ");
			
			Scanner ad = new Scanner(System.in);
			ID = ad.nextLine();
			ID.toLowerCase();
			
			System.out.print("	Enter User Last 4 digit of Your mobile Number as Password: ");
			Scanner ad1 = new Scanner(System.in);
			Pass = ad1.nextInt();
			Customer c1=new Customer("Jobaer","01796767714",20,"Vatara",110);
			Customer c2=new Customer("Hossain","01796767701",20,"Zoar Sahara",111);
			Customer c3=new Customer("Tuhin","01796767702",20,"Khilkhet",112);
			Customer c4=new Customer("Saymon","01796767703",20,"Uttara",113);
			Customer c5=new Customer("Asaduzzaman","01796767705",20,"Kuratoli",114);
			Customer c6=new Customer("Samin","01796767706",20,"Kuril",115);
			Customer c7=new Customer("Shayan","01796767707",20,"Banani",116);
			Customer c8=new Customer("Abrar","01796767708",20,"Badda",117);
			if (ID.equals("jobaer")&&Pass==7714 || ID.equals("hossain")&&Pass==7701 || ID.equals("tuhin")&&Pass==7702 || ID.equals("asaduzzaman")&&Pass==7705 || ID.equals("samin")&&Pass==7706 || ID.equals("shayan")&&Pass==7707 || ID.equals("abrar")&&Pass==7708)
			{
				System.out.println("	\n			Welcome To T3S SuperShop");
				
			
				Scanner sin=new Scanner (System.in);
				int no;
				int pNo;
				int cNo;
		
				while(ii>0)
				{
					System.out.println("\n==========Products Category============");
					System.out.println("	1.Grocery\n	2.Food\n	3.Fashion\n	4.Health\n	5.Pet Care Zone\n	6.Cosmetics \n");
					System.out.print("	Press the serial number for your desired Category: ");
					cNo=sin.nextInt();
					do
					{
						if(cNo==1)
						{
							System.out.println("\n=======Grocery Item========");
							System.out.println("	1.Grains & bread \n	2.condiments \n	3. herbs & spices \n	4.dairy& eggs \n	5.oil & fat\n");
							System.out.print("	Press the serial number for your desired products");
							no=sin.nextInt();
							Product p=new Product();
							Petcare p1=new Petcare();
		
							if(no==1)
							{
								System.out.println("\n=======Grains & Bread=======");
								System.out.println("	1.Pasta \n	2.Rice \n	3.Bread\n ");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									p.product("Pasta",20,200,"Grains",107);
									p.show();
									p.buy();
								}
								else if(pNo==2)
								{
									p.product("RICE",80,300,"Grains",108);
									p.show();
									p.buy();
								}
								else if(pNo==3)
								{
									p.product("Bread",90,300,"Bread",109);
									p.show();
									p.buy();
								}
							}
			
							else if (no==2)
							{
								System.out.println("\n=======Condiments=======");
								System.out.println("	1.Salt \n	2.Pepper \n	3.Stock cubes \n	4.Honey \n	5.Vinegar \n	6.Sugar\n");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									p1.pet("Salt",15,300,"Condiments",110,1);
									p1.show();
									p1.buy();
								}
								else if(pNo==2)
								{
									p.product("pepper",30,10,"Condiments",111);
									p.show();
									p.buy();
								}
								else if(pNo==3)
								{
									p.product("Stock cubes",50,20,"Condiments",112);
									p.show();
									p.buy();
								}
								else if(pNo==4)
								{
									p1.pet("Honey",160,10,"Condiments",113,0.8);
									p1.show();
									p1.buy();
								}
								else if(pNo==5)
								{
									p.product("Vinegar",60,10,"Condiments",114);
									p.lShow();
									p.buy();
								}
								else if(pNo==6)
								{
									p.product("Sugar",30,100,"Condiments",115);
									p.show();
									p.buy();
								}
							}
							else if(no==3)
							{
								System.out.println("\n=======herbs & spices=======");
								System.out.println("	1.Basil \n	2.	Oregano \n	3.Coriander \n	4.Cumin\n ");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									p.product("Basil",120,10,"Herbs",116);
									p.show();
									p.buy();
								}
								else if(pNo==2)
								{
									p.product("Oregano",90,15,"Spices",117);
									p.show();
									p.buy();
								}
								else if(pNo==3)
								{
									p.product("Coriander",150,20,"Spices",118);
									p.show();
									p.buy();
								}
								else if(pNo==4)
								{
									p.product("Cumin",100,15,"Spices",119);
									p.show();
									p.buy();
								}
							}
							else if(no==4)
							{
								System.out.println("\n=======dairy& eggs=======");
								System.out.println("	1.Milk \n	2.	Egges \n	3.Cheese \n	4.Yogurt\n ");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									p.product("Milk",80,1000,"Dairy",120);
									p.lShow();
									p.buy();
								}
								else if(pNo==2)
								{
									p.product("Egg",50,3000,"Eggs",121);
									p.pShow();
									p.buy();
								}
								else if(pNo==3)
								{
									p.product("Cheese",150,200,"Dairy",122);
									p.show();
									p.buy();
								}
								else if(pNo==4)
								{
									p.product("Yogurt",110,100,"Dairy",123);
									p.show();
									p.buy();
								}
							}
							else if(no==5)
							{
								System.out.println("\n=======Oil & Fat=======");
								System.out.println("	1.Mustard oil \n	2.Butter\n  3.Soyabean Oil\n	4.Ricebrun Oil\n");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									p.product("Mustard oil",300,100,"Oil",124);
									p.lShow();
									p.buy();
								}
								else if(pNo==2)
								{
									p.product("Butter",350,100,"Oil",125);
									p.show();
									p.buy();
								}
								else if(pNo==3)
								{
									p.product("Soyabean Oil",190,100,"Oil",126);
									p.lShow();
									p.buy();
								}
								else if(pNo==4)
								{
									p.product("Ricebran Oil",250,100,"Oil",127);
									p.lShow();
									p.buy();
								}
							}
							System.out.print("	\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt();  
							}
					}while(ii==1);
					do
					{
						if(cNo==2)
						{
							System.out.println("\n==========Foood Item========");
							System.out.println("	1.Fresh Vegetables & Fruits \n	2.Snacks & Soft Drinks \n	3.Meat & Fish\n");
							System.out.print("	Press the serial number for your desired products: ");
							no=sin.nextInt();
							Food f=new Food();
							Product p=new Product();
		
							if(no==1)
							{
								System.out.println("\n=======Vegetables & Fruits=======");
								System.out.println("	1.Potato \n	2.Tomato \n	3.Green Chilli \n	4.Cucumber \n	5.Capsicum \n	6.Onion \n	7.Radish \n	8.Carrot \n	9.Mushroom \n	10.Corn \n	11.Apple \n	12.Orange \n	13.Guava \n	14.Banana\n 	15.Dragon Fruits\n");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									f.food("Potato",20,200,"Vegetable",1,"Bogra");
									f.show();
									f.buy();
								}
								else if(pNo==2)
								{
									f.food("Tomato",80,300,"Vegetable & Fruir",2,"Mymensing");
									f.show();
									f.buy();
								}
								else if(pNo==3)
								{
									f.food("Green Chilli",120,10,"Vegetable",3,"Gaibandha");
									f.show();
									f.buy();
								}
								else if(pNo==4)
								{
									f.food("Cucumber",70,40,"Vegetable",4,"Dhaka");
									f.show();
									f.buy();
								}
								else if(pNo==5)
								{
									f.food("Capsicum",150,5,"Vegetable",5,"Jhalokathi");
									f.show();
									f.buy();
								}
								else if(pNo==6)
								{
									f.food("Onion",60,20,"Vegetable",6,"Pabna");
									f.show();
									f.buy();
								}
								else if(pNo==7)
								{
									f.food("Radish",60,30,"Vegetable",7,"Rangpur");
									f.show();
									f.buy();
								}
								else if(pNo==8)
								{
									f.food("Carrot",40,40,"Vegetable",8,"Rajbari");
									f.show();
									f.buy();
								}
								else if(pNo==9)
								{
									f.food("Mushroom",200,10,"Vegetable",9,"Ashulia");
									f.show();
									f.buy();
								}
								else if(pNo==10)
								{
									f.food("Corn",80,10,"Fruit",10,"Dinajpur");
									f.show();
									f.buy();
								}
								else if(pNo==11)
								{
									f.food("Apple",200,30,"Fruit",11,"Kashmir,India");
									f.show();
									f.buy();
								}
								else if(pNo==12)
								{
									f.food("Orange",150,20,"Fruit",12,"Kashmir,Pakistan");
									f.show();
									f.buy();
								}
								else if(pNo==13)
								{
									f.food("Guava",65,40,"Fruit",13,"Barishal");
									f.show();
									f.buy();
								}
								else if(pNo==14)
								{
									f.food("Banana",40,20,"Fruit",14,"Noakhali");
									f.show();
									f.buy();
								}
								else if(pNo==15)
								{
									f.food("Dragon Fruit",300,20,"Fruit",15,"Gazipur");
									f.show();
									f.buy();
								}
							}
							else if (no==2)
							{
								System.out.println("\n==========Snacks & Soft Drinks========");
								System.out.println("	1.Potato Chips \n	2.Tomato Masala Chips \n	3.Chilli Chanachur \n	4.Flattened Rice \n	5.Puffed Rice \n	6.Bbq Chanachur\n	7.Sweets Chanachur \n	8.Dal vaja \n	9.Lexus Vegetable Biscuit \n	10.Chocolate Cream Buiscuit \n	11.Potato Spicy Biscuit \n	12.Orange Flavour Biscuit \n	13.Toast Biscuit \n	14.Vanilla Biscuit\n");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									f.food("Potato Chips",15,300,"Snacks",16,"Bangladeshi");
									f.show();
									f.buy();
								}
								else if(pNo==2)
								{
									f.food("Tomato Masala Chips",15,300,"Snacks",17,"Bangladeshi");
									f.show();
									f.buy();
								}
								else if(pNo==3)
								{
									f.food("Chilli Chanachur",45,400,"Snacks",18,"Indian");
									f.show();
									f.buy();
								}
								else if(pNo==4)
								{
									f.food("Flattened Rice",355,300,"Snacks",19,"Bangladeshi");
									f.show();
									f.buy();
								}
								else if(pNo==5)
								{
									f.food("Puffed Rice",20,300,"Snacks",20,"Thai");
									f.show();
									f.buy();
								}
								else if(pNo==6)
								{
									f.food("BBQ Chanachur",60,300,"Chanachur",21,"Srilankan");
									f.show();
									f.buy();
								}
								else if(pNo==7)
								{
									f.food("Sweet Chanachur",15,300,"Chanachur",22,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==8)
								{
									f.food("Dal vaja",15,300,"Snacks",23,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==9)
								{
									f.food("Lexus Vegetable Biscuit",15,300,"Biscuit",24,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==10)
								{
									f.food("Chocolate Cream Buiscuit",15,300,"Biscuit",25,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==11)
								{
									f.food("Potato Spicy Biscuit",15,300,"Biscuit",26,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==12)
								{
									f.food("Orange Flavour Biscuit",15,300,"Biscuit",27,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==13)
								{
									f.food("Potato Chips",15,300,"Biscuit",28,"Bangladesh");
									f.show();
									f.buy();
								}
								else if(pNo==14)
								{
									f.food("Vanilla Biscuit",15,300,"Biscuit",29,"Bangladesh");
									f.show();
									f.buy();
								}
							}
							else if (no==3)
							{
								System.out.println("\n==========Meat & Fish========");
								System.out.println("	1.Chicken \n	2.Beef \n	3.Mutton \n	4.Hilsha(Padma) \n	5.Hilsha(Bay Of Bengal) \n	6.Tuna Fish\n	7.Tilapia \n	8.Shrimp(Golda) \n	9.Shrimp(Desi) \n	10.Rui \n	11.Katla \n");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									f.meat("Chicken",600,300,"Meat",30,2);
									f.showMeat();
									f.buy();
								}
								else if(pNo==2)
								{
									f.meat("Beaef",1000,300,"Meat",31,1.5);
									f.showMeat();
									f.buy();
								}
								else if(pNo==3)
								{
									f.meat("Mutton",800,300,"Meat",32,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==4)
								{
									f.meat("Hilsha(Padma)",1500,300,"Fish",33,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==5)
								{
									f.meat("Hilsha(Bay Of Bengal)",1200,300,"Sea Fish",34,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==6)
								{
									f.meat("Tuna Fish",500,300,"Sea Fish",35,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==7)
								{
									f.meat("Tilapia",150,300,"Fish",36,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==8)
								{
									f.meat("Shrimp(Golda)",800,300,"Fish",37,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==9)
								{
									f.meat("Shrimp(Desi)",1.5,300,"Fish",38,600);
									f.showMeat();
									f.buy();
								}
								else if(pNo==10)
								{
									f.meat("Rui",300,300,"Fish",39,1);
									f.showMeat();
									f.buy();
								}
								else if(pNo==11)
								{
									f.meat("Katla",500,300,"fish",40,1.5);
									f.showMeat();
									f.buy();
								}
							}
				
							System.out.print("	\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt();  
						}
					}while(ii==1);
					do
					{
						if(cNo==4)
						{
							System.out.println("\n=========Health Supplies========");
	
							System.out.println("	1.Medicines \n2.First Aids");
							System.out.print("	Press the serial number for your desired products : ");
							no=sin.nextInt();
							Product p=new Product();
							Health h=new Health();
		
							if(no==1)
							{
								System.out.println("\n=======Medicines=======");
								System.out.println("	1.Paracetamol \n2.Omeprazol \n3.Calcium+ \n4.Napa 500 \n5.Napa Extend \n6.Multivitamins");
								System.out.print("	Enter your Product Number : ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									h.medicine("Paracetamol",20,200,"Medicine",101,10);
									h.show();
									h.buy();
								}
								else if(pNo==2)
								{
									h.medicine("Omeprazol",10,300,"Medicine",102,8);
									h.show();
									h.buy();
								}
								else if (pNo == 3)
								{
									h.medicine("Calcium+", 30,200,"Medicine",103,4);
									h.show();
									h.buy();
								}
								else if (pNo == 4)
								{
									h.medicine("Napa 500", 20,200,"Medicine",104,10);
									h.show();
									h.buy();
								}
								else if (pNo == 5)
								{
									h.medicine("Napa Extend", 30,200,"Medicine",105,12);
									h.show();
									h.buy();
								}
								else if (pNo == 6)
								{
									h.medicine("Multivitamins", 30,200,"Medicine",106,14);
									h.show();
									h.buy();
								}
								else  
								{
									System.out.println("	InValid Input");
								}
							}
		
							else if (no==2)
							{
								System.out.println("\n=======First Aid=======");
								System.out.println("	1.Bandage \n2.Viodin \n3.Haxisol");
								System.out.print("	Enter your Product Number : ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									p.product("Bandage",5, 200,"First Aid",106);
									p.show();
									p.buy();
								}
								if(pNo==2)
								{
									p.product("Viodin",150, 200,"First Aid",107);
									p.show();
									p.buy();
								}
								if(pNo==3)
								{
									p.product("Haxisol",150, 200,"First Aid",108);
									p.show();
									p.buy();
								}
								else  
								{
									System.out.println("InValid Input");
								}
							}	
							System.out.print("	\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt();  
						}
					}while(ii==1);
					do
					{
						if(cNo==5)
						{
							System.out.println("\n===========Pet Care Zone==========");
							System.out.println("	1.Kitten Chicken	\n2.Lamb	\n3.Chicken & Fish	\n4.Kitten & Mother Care Lamb	\n5.Digest Care chicken		\n6.Friskies Seafood	\n7.Meaty Grills	\n8.Kitten Discoveries");
							System.out.print("	Enter your Product Number: ");
							pNo=sin.nextInt();
							Petcare p=new Petcare();
							Product p1=new Product();
							if(pNo==1)
							{
								p.pet("Kitten Chicken",280,500,"Pet Food",41,1.5);
								p.show();
								p.buy();
							}
							else if(pNo==2)
							{
								p.pet("Lamb",420,100,"Pet Food",42,1);
								p.show();
								p.buy();
							}
							else if(pNo==3)
							{
								p.pet("Chicken & Fish",360,400,"Pet Food",43,0.5);
								p.show();
								p.buy();
							}
							else if(pNo==4)
							{
								p.pet("Kitten & Mother Care Lamb",1250,200,"Pet Food",44,2);
								p.show();
								p.buy();
							}
							else if(pNo==5)
							{
								p.pet("Digest Care chicken",1300,500,"Pet Food",45,1.5);
								p.show();
								p.buy();
							}
							else if(pNo==6)
							{
								p.pet("Friskies Seafood",280,500,"Oet Food",46,0.45);
								p.show();
								p.buy();
							}
							else if(pNo==7)
							{
								p.pet("Meaty Grills",220,500,"Pet Food",47,0.45);
								p.show();
								p.buy();
							}
							else if(pNo==8)
							{
								p.pet("Kitten Discoveries",620,500,"Pet Food",48,1.1);
								p.show();
								p.buy();
							}
		
							System.out.print("	\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt();  
						}
					}while(ii==1);
					
					do
					{
						if(cNo==6)
						{
							System.out.println("\n================Cosmetics Item=============");
							System.out.println("	1.Lipstick   \n	2.Eye shadow   \n	3.Blusher   \n	4.Eye liner   \n	5.Concealer    \n	6.Foundation   \n	7.Nail polish   \n	8.Primer   \n	9.Kajal   \n	10.Face powder");
							System.out.print("	Enter your Product Number: ");
							pNo=sin.nextInt();
							Cosmetics c=new Cosmetics();
							Product p=new Product();
							if(pNo==1)
							{
								c.makeup("Lipstick",499,300,"Cosmetics",128,"CoverGirl");
								c.pShow();
								c.buy();
							}
							else if(pNo==2)
							{
								c.makeup("Eye Shadow",399,300,"Cosmetics",129,"Olay");
								c.pShow();
								c.buy();
							}
							else if(pNo==3)
							{
								c.makeup("Blusher",450,300,"Cosmetics",130,"Bobbi Brown");
								c.pShow();
								c.buy();
							}
							else if(pNo==4)
							{
								c.makeup("Eye Liner",499,300,"Cosmetics",131,"Lakme");
								c.pShow();
								c.buy();
							}
							else if(pNo==5)
							{
								c.makeup("Concealer",299,200,"Cosmetics",132,"Loreal");
								c.pShow();
								c.buy();
							}
							else if(pNo==6)
							{
								c.makeup("Foundation",199,100,"Cosmetics",133,"CoverGirl");
								c.pShow();
								c.buy();
							}
							else if(pNo==7)
							{
								c.makeup("Nail Polish",150,200,"Cosmetics",134,"Avon");
								c.pShow();
								c.buy();
							}
							else if(pNo==8)
							{
								c.makeup("Primeer",239,200,"Cosmetics",135,"Chanel");
								c.pShow();
								c.buy();
							}
							else if(pNo==9)
							{
								c.makeup("Kajal",699,300,"Cosmetics",136,"Revlon");
								c.pShow();
								c.buy();
							}
							else if(pNo==10)
							{
								c.makeup("Fac Powder",1499,120,"Cosmetics",137,"Coty");
								c.pShow();
								c.buy();
							}
							System.out.print("\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt();  
						}
					}while(ii==1);
					
					do
					{
						if(cNo==3)
						{
							System.out.println("\n==========Fashion Item===========");
							System.out.println("	1.Male Fashion \n	2.Female Fashion \n	3.Kids Fashion");
							System.out.print("	Press the serial number for your desired products: ");
							no=sin.nextInt();
							Fashion f=new Fashion();
							Product p=new Product();
		
							if(no==1)
							{
								System.out.println("\n=======Male Fashion=======");
								System.out.println("	1.Sweater \n	2.Shirt \n	3.Jeans \n	4.Gloves \n	5.Cap \n	6.Suit \n	7.Hawaiian shirt \n	8.Singlet \n	9.Business shoes \n	10.Flip flops \n	11.Shorts \n	12.Cardigan \n	13.Jacket \n	14.Sport shoes \n	15.Bow tie \n	16.Sleeveless shirt \n	17.Vest \n	18.Long-sleeve top \n	19.Jumper \n	20.Trench coat \n	21.Bathrobe \n	22.Cargo pants \n	25.Swimsuit \n	26.Blazer \n	27.T-shirt ");
								System.out.println("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									f.fashion("Sweater",2000,"Male Fashion",20,49,"L");
									f.show();
									f.buy();
								}
								else if(pNo==2)
								{
									f.fashion("Shirt",1200,"Male Fashion",20,50,"L");
									f.show();
									f.buy();
								}
								else if(pNo==3)
								{
									f.fashion("Jeans",800,"Male Fashion",20,51,"L");
									f.show();
									f.buy();
								}
								else if(pNo==4)
								{
									f.fashion("Gloves",150,"Male Fashion",20,52,"L");
									f.show();
									f.buy();
								}
								else if(pNo==5)
								{
									f.fashion("Cap",500,"Male Fashion",20,53,"L");
									f.show();
									f.buy();
								}
								else if(pNo==6)
								{
									f.fashion("Suit",6000,"Male Fashion",20,54,"L");
									f.show();
									f.buy();
								}
								else if(pNo==7)
								{
									f.fashion("Hawaiian shirt",600,"Male Fashion",20,55,"L");
									f.show();
									f.buy();
								}
								else if(pNo==8)
								{
									f.fashion("Singlet",400,"Male Fashion",20,56,"L");
									f.show();
									f.buy();
								}
								else if(pNo==9)
								{
									f.fashion("Business shoes",3000,"Male Fashion",20,57,"L");
									f.show();
									f.buy();
								}
								else if(pNo==10)
								{
									f.fashion("Flip flops",800,"Male Fashion",20,58,"L");
									f.show();
									f.buy();
								}
									else if(pNo==11)
								{
									f.fashion("Shorts",1000,"Male Fashion",20,59,"L");
									f.show();
									f.buy();
								}
									else if(pNo==12)
								{
									f.fashion("Cardigan",1500,"Male Fashion",20,60,"L");
									f.show();
									f.buy();
								}
									else if(pNo==13)
								{
									f.fashion("Jacket",6500,"Male Fashion",20,61,"L");
									f.show();
									f.buy();
								}
									else if(pNo==14)
								{
									f.fashion("Sport shoes",1500,"Male Fashion",20,62,"L");
									f.show();
									f.buy();
								}
								else if(pNo==15)
								{
									f.fashion("Bow tie",200,"Male Fashion",20,63,"L");
									f.show();
									f.buy();
								}
								else if(pNo==16)
								{
									f.fashion("Sleeveless shirt",600,"Male Fashion",20,64,"L");
									f.show();
									f.buy();
								}
								else if(pNo==17)
								{
									f.fashion("Vest",500,"Male Fashion",20,65,"L");
									f.show();
									f.buy();
								}
								else if(pNo==18)
								{
									f.fashion("Long-sleeve top",400,"Male Fashion",20,66,"L");
									f.show();
									f.buy();
								}
								else if(pNo==19)
								{
									f.fashion("Jumper",1200,"Male Fashion",20,67,"L");
									f.show();
									f.buy();
								}
								else if(pNo==20)
								{
									f.fashion("Trench coat",4000,"Male Fashion",20,68,"L");
									f.show();
									f.buy();
								}
								else if(pNo==21)
								{
									f.fashion("Bathrobe",400,"Male Fashion",20,69,"L");
									f.show();
									f.buy();
								}
								else if(pNo==22)
								{
									f.fashion("Cargo pants",800,"Male Fashion",20,70,"L");
									f.show();
									f.buy();
								}
								else if(pNo==23)
								{
									f.fashion("Swimsuit",4000,"Male Fashion",20,71,"L");
									f.show();
									f.buy();
								}
								else if(pNo==24)
								{
									f.fashion("Blazer",7000,"Male Fashion",20,72,"L");
									f.show();
									f.buy();
								}
								else if(pNo==25)
								{
									f.fashion("T-shirt",1200,"Male Fashion",20,73,"L");
									f.show();
									f.buy();
								}
							}
							else if (no==2)
							{
								System.out.println("\n=======Female Fashion=======");
								System.out.println("	1.T-shirt \n	2.Sheath dress \n	3.Long-sleeve top \n	4.Skirt \n	5.Thong \n	6.Hat \n	7.High-heeled shoes \n	8.Necklace \n	9.Ring \n	10.Earrings \n	11.Handbag \n	12.Bracelet \n	13.Purse \n	14.Scarf");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									f.fashion("T-shirt",2000,"Female Fashion",20,74,"L");
									f.show();
									f.buy();
								}
								else if(pNo==2)
								{
									f.fashion("Sheath dress",1200,"Female Fashion",20,75,"L");
									f.show();
									f.buy();
								}
								else if(pNo==3)
								{
									f.fashion("Long-sleeve top",1200,"Female Fashion",20,76,"L");
									f.show();
									f.buy();
								}
								else if(pNo==4)
								{
									f.fashion("Skirt",1200,"Female Fashion",20,77,"L");
									f.show();
									f.buy();
								}
								else if(pNo==5)
								{
									f.fashion("Thong",1200,"Female Fashion",20,78,"L");
									f.show();
									f.buy();
								}
								else if(pNo==6)
								{
									f.fashion("Hat",1200,"Female Fashion",20,79,"L");
									f.show();
									f.buy();
								}
								else if(pNo==7)
								{
									f.fashion("High-heeled shoes",1200,"Female Fashion",20,80,"L");
									f.show();
									f.buy();
								}
								else if(pNo==8)
								{
									f.fashion("Necklace",1200,"Female Fashion",20,81,"L");
									f.show();
									f.buy();
								}
								else if(pNo==9)
								{
									f.fashion("Ring",1200,"Female Fashion",20,82,"L");
									f.show();
									f.buy();
								}
								else if(pNo==10)
								{
									f.fashion("Earrings",1200,"Female Fashion",20,83,"L");
									f.show();
									f.buy();
								}
								else if(pNo==11)
								{
									f.fashion("Handbag",1200,"Female Fashion",20,84,"L");
									f.show();
									f.buy();
								}
								else if(pNo==12)
								{
									f.fashion("Bracelet",1200,"Female Fashion",20,85,"L");
									f.show();
									f.buy();
								}
								else if(pNo==13)
								{
									f.fashion("Purse",1200,"Female Fashion",20,86,"L");
									f.show();
									f.buy();
								}
								else if(pNo==14)
								{
									f.fashion("Scarf",1200,"Female Fashion",20,87,"L");
									f.show();
									f.buy();
								}
							}	
							else if (no==3)
							{
								System.out.println("=======Kids Fashion=======");
								System.out.println("	1.Peewee Tots \n	2.Baby Sweet \n	3.Ankle Biters Lot \n	4.The Charming Baby \n	5.Silly Baby \n	6.Hat \n	7.Mini Tikes \n	8.Baby Time \n	9.Balls n Dolls \n	10.Sunshine Cuties \n	11.Bib and Zib Kids Clothing \n	12.Spotlight on Style \n	13.Beau and Bella \n	14.Assie Style");
								System.out.print("	Enter your Product Number: ");
								pNo=sin.nextInt();
								if(pNo==1)
								{
									f.fashion("Peewee Tots",2000,"Kids Fashion",20,88,"L");
									f.show();
									f.buy();
								}
								else if(pNo==2)
								{
									f.fashion("Baby Sweet",1200,"Kids Fashion",20,89,"L");
									f.show();
									f.buy();
								}
								else if(pNo==3)
								{
									f.fashion("Ankle Biters Lot",1200,"Kids Fashion",20,90,"L");
									f.show();
									f.buy();
								}
								else if(pNo==4)
								{
									f.fashion("The Charming Baby",1200,"Kids Fashion",20,91,"L");
									f.show();
									f.buy();
								}
								else if(pNo==5)
								{
									f.fashion("Silly Baby",1200,"Kids Fashion",20,92,"L");
									f.show();
									f.buy();
								}
								else if(pNo==6)
								{
									f.fashion("Hat",1200,"Kids Fashion",20,93,"L");
									f.show();
									f.buy();
								}
								else if(pNo==7)
								{
									f.fashion("Mini Tikes",1200,"Kids Fashion",20,94,"L");
									f.show();
									f.buy();
								}
								else if(pNo==8)
								{
									f.fashion("Baby Time",1200,"Kids Fashion",20,95,"L");
									f.show();
									f.buy();
								}
								else if(pNo==9)
								{
									f.fashion("Balls n Dolls",1200,"Kids Fashion",20,96,"L");
									f.show();
									f.buy();
								}
								else if(pNo==10)
								{
									f.fashion("Sunshine Cuties",1200,"Kids Fashion",20,97,"L");
									f.show();
									f.buy();
								}
								else if(pNo==11)
								{
									f.fashion("Bib and Zib Kids Clothing",1200,"Kids Fashion",20,98,"L");
									f.show();
									f.buy();
								}
								else if(pNo==12)
								{
									f.fashion("Beau and Bella",1200,"Kids Fashion",20,99,"L");
									f.show();
									f.buy();
								}
								else if(pNo==13)
								{
									f.fashion("Assie Style",1200,"Kids Fashion",20,100,"L");
									f.show();
									f.buy();
								}
							}
							System.out.print("	\n	Press 1 for continue 2 for Main menu: ");
							ii=s1.nextInt();  
						
						}
					
					}while(ii==1);
				
				}
		
			}
		
		}
		
		else 
		{
			System.out.println("	Wrong ID or Password! Please Input Correct User Name and Password");
		}
	
	}

}	
