import java.util.Scanner;
public class AudiShowroom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c;
		
		
		System.out.println("      Welcome To Audi Showroom");
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("1.Buy A New Sparkling Car");
		System.out.println("2.Service your Audi");
		System.out.println("3.Rent a Car");
		System.out.println("4.Employee Section");
		System.out.println("Enter Your choice");
		c=scan.nextInt();
		while(c!=1 && c!=2 && c!=3 && c!=4) {
			System.out.println("Error!! Re-Enter Your choice");
			c=scan.nextInt();}
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
		
		switch (c) {
		case 1 : Buy.buy();
		         break;
		case 2 : Service.Servicing();
		         break;
		case 3 : Rental.rent();
		         break;
		case 4 : System.out.println("ENTER \"1\" for Manager \n      \"2\" for Workers");
		         int emp=scan.nextInt();
		         while(emp!=1 && emp!=2) {
		 			System.out.println("Error!! Re-Enter Your choice");
		 			emp = scan.nextInt();}
		         System.out.println("----------------------------------------");
		         System.out.println("----------------------------------------");
		 			if (emp==1)
		 				Management.managing();
		 			else
		 				Crew.crew(); 
		 			break;       
		}
		
	
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------\n");
		System.out.println("Thank You! Visit Again!!!\n");
		System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--*--");
        scan.close();
	
	}
	
}
