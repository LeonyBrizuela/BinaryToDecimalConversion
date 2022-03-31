package ComProg2;
import java.util.Scanner;
public class BinarytoDecimal {

  public static void main(String [] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a 6bit Binary Number:");
     String BinaryNumber=input.nextLine();
     
    int
   DecimalNumber=Integer.parseInt(BinaryNumber,2);
     System.out.println("Decimal number is:"+DecimalNumber);
   
  }
}
