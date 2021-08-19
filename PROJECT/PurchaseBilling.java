import java.util.ArrayList;
public class PurchaseBilling extends car{
	static double bprice,tax,Vprice;
	static ArrayList<String> Model =new ArrayList<String>();
	public static void Bill() {
		System.out.println("The Breakdown of Bill : ");
		switch(c1) {
		case 1: bprice=450000; 
                Model=Sedan;
                break;
		case 2: bprice=680000;
		        Model=SUV;
		        break;
		case 3: bprice=780000;
		        Model=HyperSports;
		        break;
		}
		Vprice=0.01*c3*bprice;
		Tax();
		Print();
		
	}
	    public static void Tax() {
		   double cgst,sgst,tax;
		   cgst=bprice*0.14;
		   sgst=bprice*0.06;
		   tax=cgst+sgst;
		   PurchaseBilling.tax = tax;
	   }
	    public static void Print() {
		   System.out.println("The Base Price Of your car "+Model.get(c2-1)+"          : "+bprice);
		   System.out.println("The Price Of Engine Variant "+Variant.get(c3-1)+" : "+Vprice);
		   System.out.println("The Total Tax Apllicable (GST) "+"        : "+tax);
		   System.out.println("The Total Cost Of your car             : "+(bprice+Vprice+tax));
		   System.out.println();
		   System.out.println("Your Order of Car Audi "+Model.get(c2-1)+" with choice of Engine Variant "+Variant.get(c3-1)+" has been SUCCESSFULLY placed!");
	   }
}
