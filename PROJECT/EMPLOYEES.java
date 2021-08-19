import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EMPLOYEES 
{
	static Scanner in= new Scanner(System.in); 
	static ArrayList<String> SP=new ArrayList<String>();//SP-Sales Person
    static ArrayList<String> SrvP=new ArrayList<String>();//SrvP-Service Person
    static int a,n;
    
   
    public static void Display()
	 {
		 
		 System.out.print("\n1.View sales(person) ");
		 System.out.print("\n2.View service(person) ");
		 System.out.print("\nEnter your choice please : ");
		 n=in.nextInt();
		 System.out.print("------------------------------------\n");
		 System.out.print("------------------------------------\n");
		
		 if(n==1)
		 
		 {
			 System.out.println("\n(Number between 1 &"+SP.size()+")");
			 System.out.print("Enter index no of person whose details need to be viewed : ");
		     a=in.nextInt();
		     System.out.println("\nDetails of the person is : \n"+SP.get(a-1));
		     TotalSalarySP();
		     
		 }
		 else 
	     if(n==2)
	     {
	    	 System.out.println("\n(Number between 1 &"+SrvP.size()+")");
	    	 System.out.print("Enter index no of person whose details need to be viewed : ");
	    	 a=in.nextInt();
		     System.out.println("Details of the person is : \n"+SrvP.get(a-1));
		     TotalSalarySrvP();
	     }
	     else
	     if(n!=1||n!=2)
	     {
	    	 System.out.println("Sorry!Wrong Choice!!");
	     }
	 
		}
	 
	 
	 public static void Add()
	 {
		
		 System.out.print("\n1.Add to sales(person) ");
		 System.out.print("\n2.Add to service(person) ");
		 System.out.print("\nEnter your choice please : "); 
		 n=in.nextInt();
		 System.out.print("------------------------------------\n");
		 System.out.print("------------------------------------\n");
		
		 System.out.println("\nEnter details of the person ");
		 System.out.print("Enter name of the person : ");
		 String fn=in.next();
		 System.out.print("Enter last name of the person : ");
		 String ln=in.next();
		 System.out.print("Enter ID of the person(ie EMP.SP.102xx/EMP.SVP.103xx) : ");
		 String id=in.next();
		 System.out.print("Enter Date of Joining of person(DD/MM/YYYY) : ");
		 String dj=in.next();
		 System.out.print("Enter Phone Number of the person : ");
		 String ph=in.next();
		 
		 
		 if(n==1)
		 {
			 SP.add("\nName  : "+fn+" "+ln+"\nID    : "+id+"\nDoJ   : "+dj+"\nPh No : "+ph);
			 int d=SP.size();
			 System.out.println("Details Added ");
			 System.out.print(SP.get(d-1));
			 System.out.println("\n");
			

		 }
		 
		 else
		 if(n==2)
		 {
			 SrvP.add("\nName  : "+fn+" "+ln+"\nID    : "+id+"\nDoJ   : "+dj+"\nPh No : "+ph);
			 int d=SrvP.size();
			 System.out.println("Details added ");
			 System.out.print(SrvP.get(d-1));
			 System.out.println("\n");
		 }
		
		 else
		 if(n!=1||n!=2)
		 {
		     System.out.println("Sorry!Wrong Choice!!");
		 }
		 System.out.print("------------------------------------\n");
		 
	 }
	 
	
	static double FAsP=50000;
	static double FAsrvP=12000;
	static double B;
	static double TS;
	static double Amt;
	
	public static void BonusSP()
	{
		int x;
		
			System.out.print("Enter the number of cars sold this month :");
			x=in.nextInt();
			if(x>=20)
			{
				B=0.25*FAsP;
				System.out.println(" \n Bonus : "+B);
			}
			else
			if(x<20 && x>=12)
			{
				B=0.12*FAsP;
				System.out.println(" \n Bonus : "+B);
				
			}
			else
			if(x<12)
			{
				B=0;
				System.out.println("\nPoor Performance");
				SP.remove(a-1);
				
			}
	}
		
	
	 
	public static void BonusSvP()
	{
	
		System.out.print("Enter number of hours(avg) worked in a day : ");
		float h=in.nextFloat();
		if(h>=4)
		{
		Amt=h*1500*6;
		}
		else
		if(h<4)
		{
			System.out.println("Poor Performance");
			SrvP.remove(a-1);
		}
    }
	
	 public static void TotalSalarySP()
	 {
		
		 BonusSP();
	     TS=FAsP+B;
		 System.out.println(" Total Salary : "+TS);
		 
		 
	 }
	 
	 public static void TotalSalarySrvP()
	 {
		 BonusSvP();
		 TS=FAsrvP+Amt;
		 System.out.println(" Total Salary : "+TS);
		
		 
	 }
	
	public static void main(String[] args)
	{   
		SP.add("\n1.Name : George "+"Hansly "+"\n  ID   : EMP.SP.10246 "+"\n  DoJ  : 12/07/2016 "+"\n  Ph No: 8906751245\n");
		SP.add("\n2.Name : Santhosh "+"Kurup "+"\n  ID   : EMP.SP.10268 "+"\n  DoJ  : 21/03/2018 "+"\n  Ph No: 9970657453\n");
		SP.add("\n3.Name : Amaya "+"S R "+"\n  ID   : EMP.SP.10224 "+"\n  DoJ  : 03/11/2014 "+"\n  Ph No: 8967554543\n");
	    System.out.print("\n");
		SrvP.add("\n1.Name: Mathew "+"Paul "+"\n  ID   : EMP.SVP.10343"+"\n  DoJ  : 24/05/2018 "+"\n  Ph No: 9097867645\n");
		SrvP.add("\n2.Name: Remya "+"Nair "+"\n  ID   : EMP.SVP.10356"+"\n  DoJ  : 16/12/2016 "+"\n  Ph No: 9981245476\n");
		SrvP.add("\n3.Name: Dinesh "+"Pillai "+"\n  ID   : EMP.SVP.10343"+"\n  DoJ  : 30/06/2017 "+"\n  Ph No: 8078564654\n");
	    
		
		int n;
		char c;
		do
		{
		  System.out.println("1.View details of a Sales Person");
		  System.out.println("2.Add details of a new Sales Person");
		  System.out.print("Enter your choice please : ");
		  n=in.nextInt();
		  System.out.print("------------------------------------\n");
		  System.out.print("------------------------------------\n");
		 
		if(n==1)
		{
			Display();
		}
		else
		if(n==2)
		{
		   Add();	
		}

		else
		if(n!=1||n!=2)
		{
			System.out.println("Sorry!Wrong entry"); 
		}
		
			
		System.out.print("------------------------------------\n");
		System.out.print("Do you wish to continue Y/N? : ");
		c = in.next().charAt(0); 
		System.out.print("------------------------------------\n\n");
		
		
	    	
		}while(c=='Y'||c=='y');
		System.out.print("\n");
		
		System.out.print("------------------------------------\n");
		System.out.print("------------------------------------\n");
		
		File Emp=new File("C:\\Users\\nived\\OneDrive\\Desktop\\WORK SPACE\\PROJECT-CAR DEALERSHIP\\src\\WREMP.txt");
		 try
		 {
			 
			 System.out.println("Data Written into File! ");
			 PrintWriter out = new PrintWriter(Emp);
			 out.println(SP);
			 out.println(SrvP);
			 
			   out.close();
			 
			
			 
		 }
		 catch(IOException e)
		 {
			 System.out.println("File cannot be found!!!");
		 }
		 
		
   }

}
