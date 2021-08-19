import java.util.ArrayList;
import java.util.Scanner;
class car {
	static ArrayList<String> Sedan =new ArrayList<String>();
	static ArrayList<String> SUV =new ArrayList<String>();
    static ArrayList<String> HyperSports =new ArrayList<String>();
    static ArrayList<String> Variant =new ArrayList<String>();
    static int c1,c2,c3;
    static {
	Sedan.add("A4");Sedan.add("A6");Sedan.add("A7");Sedan.add("A8");
	SUV.add("Q3");SUV.add("Q5");SUV.add("Q7");SUV.add("Q8");
	HyperSports.add("RS3");HyperSports.add("RS4 AVANT");HyperSports.add("RS7");HyperSports.add("R8");
	Variant.add("Diesel TSI");Variant.add("Petrol TFT");Variant.add("e-Hybrid");
    } 
   protected static void Choice(int c1) {
    	Scanner scan1 = new Scanner(System.in);
    	car.c1=c1;int i=1;
    	switch (c1){
        case 1: System.out.println("Displaying Sedans");
                for(String el : Sedan) {
                	System.out.print(i+". ");i++;
                	System.out.println(el);}
                do {
                System.out.println("Enter your choice");
                c2=scan1.nextInt();}while(c2<1||c2>4);
                Variant();
                break;
               
        case 2: System.out.println("Displaying SUVs");
                for(String el : SUV) {
                System.out.print(i+". ");i++;
        	    System.out.println(el);}
                do {
                System.out.println("Enter your choice");
                c2=scan1.nextInt();}while(c2<1||c2>4);
                Variant();
                break;
 
        case 3: System.out.println("Displaying HyperSports");
                for(String el : HyperSports) {
                System.out.print(i+". ");i++;
	            System.out.println(el);}
                do {
                System.out.println("Enter your choice");
                c2=scan1.nextInt();}while(c2<1||c2>4);
                Variant();
                break;
    	}
    	scan1.close();
   }
     protected static void Variant() {
    	 Scanner scan2 = new Scanner(System.in);int i=1;
    	 System.out.println("Displaying Engine Variants");
    	 for(String el : Variant) {
    	 System.out.print(i+". ");i++;
     	 System.out.println(el);}
    	 do {
         System.out.println("Enter your choice");
         c3=scan2.nextInt();}while(c3<1 || c3>3);
         scan2.close();
    }
    }