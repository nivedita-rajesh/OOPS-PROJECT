import java.util.Scanner;
class Buy extends car{
	    static int 	c1;
	    public static void buy() {
		Scanner scan=new Scanner(System.in);
		System.out.println("BUY FROM OUR PREMIUM RANGE OF CARS");
		System.out.println("ENTER \"1\" for Sedan \n      \"2\" for SUV \n      \"3\" for Hyper Sports");
		c1=scan.nextInt();
        while(c1!=1 && c1!=2 && c1!=3) {
        	System.out.println("Wrong Choice! Please Re-enter.");
        	c1=scan.nextInt();
           }
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        Choice(c1);
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        PurchaseBilling.Bill();
        scan.close();
        }
}

