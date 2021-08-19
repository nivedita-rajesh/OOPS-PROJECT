import java.io.File; 
import java.io.IOException;  
import java.io.FileWriter;   
import java.util.Scanner;
import java.io.FileNotFoundException; 
public class Feedback {

	public static void feedback() {
		System.out.println("Please enter your Valuable Feedback ");
		
		Scanner in1 = new Scanner(System.in);
		try {
		      File myObj = new File("feedback.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 try {
		      FileWriter myWriter = new FileWriter("feedback.txt");
		      System.out.println("Enter Your Name");
		      String s = in1.nextLine();
		      System.out.println("PLEASE RATE ON SCALE OF 5");
		      Scanner obj = new Scanner(System.in);
		      int RATING = obj.nextInt();
		      System.out.println("Enter Your Feedback");
		      String r =in1.nextLine();
		      myWriter.write("Name : " + s+"\n"+"RATING : "+ RATING +"\n"+"Review : "+ r);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		   
		 try {
			 System.out.println("----------------------------------------");
			 System.out.println("----------------------------------------");
		      File myObj = new File("C:\\Users\\nived\\OneDrive\\Desktop\\WORK SPACE\\PROJECT-CAR DEALERSHIP\\Audi\\src\\Feedback.java");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 in1.close();
		 
	}

}