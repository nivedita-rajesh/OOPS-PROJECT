import java.util.Scanner;
public class Service {
	public static void Servicing() {
		double price=0;
		System.out.println("SERVICES AVAILABLE");
		System.out.println("1.PACKAGE-1(VACUUM  CLEANING + WASHING)");
		System.out.println("2.PACKAGE-2(PARTS REPAIR + TYRES");
		System.out.println("3.VACUUM CLEANING");
		System.out.println("4.WASHING");
		System.out.println("5.PARTS REAPIR");
		System.out.println("6.TYRES REPAIR AND NEW TYRES");
		System.out.println("7.ENGINE SERVICE");
		  Scanner scan3 = new Scanner(System.in);  
		    System.out.println("PLEASE ENTER RESPECTIVE SERVICE NUMBER ");
		    int n = scan3.nextInt();  
		    while(n!=1 && n!=2 && n!=3 && n!=3 && n!=4 && n!=5 && n!=6 && n!=7) {
		    	System.out.println("WRONG CHOICE!!!PLEASE RE-ENTER SERVICE NUMBER ");
		    	n = scan3.nextInt();}
		    System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------");
		    switch (n) {
		    case 1:
		      System.out.println("YOU HAVE CHOSEN PACKAGE 1");price=5000;
		      break;
		    case 2:
		      System.out.println("YOU HAVE CHOSEN PACKAGE 2");price=10000;
		      break;
		    case 3:
		      System.out.println("YOU HAVE CHOSEN VACUUM CLEANING ");price=500;
		      break;
		    case 4:
		      System.out.println("YOU HAVE CHOSEN WASHING");price=700;
		      break;
		    case 5:
		      System.out.println("YOU HAVE CHOSEN PARTS REPAIR ");price=3000;
		      break;
		    case 6:
		      System.out.println("YOU HAVE CHOSEN TYRES REPAIR AND NEW TYRES");price=6000;
		      break;
		    case 7:
		      System.out.println("YOU HAVE CHOSEN ENGINE SERVICE");price=9000;
		      break;
		    }
		   
		    System.out.println("Amount To Be Paid : "+price);
		    System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------");
		    Feedback.feedback();
		    scan3.close();
	}

}