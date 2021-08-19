import java.util.Scanner;
public class Management {
static int a,b,c; 
static Scanner scan5 = new Scanner (System.in);
	public static void managing() {
 int end=0;
 do {
	System.out.println("1:view the details of Manager and Assistant \n2:Edit deatails of manager and assistant ");
	a = scan5.nextInt();
	System.out.println("----------------------------------------");
	switch (a) {
	case 1 :
		System.out.println("1:Manager  \n2:Assistant Manager");
		c=scan5.nextInt();
		System.out.println("----------------------------------------");
		if (c==1) 
			Manager();
		else 
			AssitManager();
		
		
		break;
	case 2 :
		System.out.println("1:Manager \n2:Assitmanager");
		b=scan5.nextInt();
		System.out.println("----------------------------------------");
		if (b==1) 
			EditManager();
			
		else 
			EditAssitManager();	
		break ;}
	System.out.println("Enter 0 to continue & to exit any number");
	end=scan5.nextInt();
 }while(end==0);
 }
	
			

	private static void EditAssitManager() {
		AssitManager AssitManager = new AssitManager();
		System.out.println("Enter name of manager ");
		AssitManager.name = scan5.nextLine();
		System.out.println("Enter the Id of Manager");
		AssitManager.ID =scan5.nextLine();
		System.out.println("ENter Date OF Hiring");
		AssitManager.DateOfHiring=scan5.nextLine();
		System.out.println("Enter the salary of manager");
		AssitManager.salary=scan5.nextInt();
		System.out.println("Updated succesfully");
		System.out.println("----------------------------------------");
		}
	
	private static void EditManager() {
		Manager Manager = new Manager();
		System.out.println("Enter name of manager ");
		Manager.naam = scan5.nextLine();
		System.out.println("Enter the Id of Manager");
		Manager.ID =scan5.nextLine();
		System.out.println("ENter Date OF Hiring");
		Manager.DateOfHiring=scan5.nextLine();
		System.out.println("Enter the salary of manager");
		Manager.salary=scan5.nextInt();
		System.out.println("Updated succesfully");
		System.out.println("----------------------------------------");
		}
	
	private static void AssitManager() {
		System.out.println("Name of Assitmanager : Ramya");
		System.out.println("ID : AMENU4ABC10010");
		System.out.println("Date Of Hiring : 21DEC2010");
		System.out.println("Salary : 1,25,000 Rs");	
		System.out.println("----------------------------------------");
	}
	
	private static void Manager() {	
			System.out.println("Name of manager : Ramesh");
			System.out.println("ID : AMENU4ABC10000");
			System.out.println("Date Of Hiring : 11DEC2007");
			System.out.println("Salary : 2,50,000 Rs");	
			System.out.println("----------------------------------------");
		}	
	}


 class Manager{
	String naam ,ID,DateOfHiring;
	int salary;
}
class AssitManager{
	String name ,ID,DateOfHiring;
	int salary;
}