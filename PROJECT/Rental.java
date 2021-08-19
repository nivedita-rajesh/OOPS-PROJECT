import java.util.Scanner;
class Rental {
    
    static int CarType, days;
    static double DailyFee, Total;


    public static void rent(){
    	
        Scanner scan4 = new Scanner(System.in);

        System.out.print("What vehical would you like to rent?\n");
        System.out.println("Enter 1 for an Sedan\n");
        System.out.println("Enter 2 for a SUV\n");
        System.out.println("Enter 3 for an Hyper Sports");
        CarType = scan4.nextInt();
        if (CarType == 1)
              DailyFee=20000;
            else if(CarType == 2)
              DailyFee=25000;
            else if(CarType == 3)
              DailyFee=30200;

        System.out.print("Please enter the number of days rented. (Example; 3) : ");
        days = scan4.nextInt();
       

       double amount = (DailyFee * days );
       Total= amount+amount*6/100;//tax

        System.out.println("The total amount due is Rs " + Total);
        scan4.close();

    }

}
