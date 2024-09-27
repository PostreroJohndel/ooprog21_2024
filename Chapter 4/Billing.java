import java.util.Scanner;
public class Billing{

   final static double TAX = 0.08;
   public static double computeBill(double price){
      double totalBill = price + (price * TAX);
      System.out.printf("\nThe total price for the bill is: $%.2f \n", totalBill);
      return totalBill;
   }
   
   public static double computeBill(double price, int quantity){
      double totalBill = (price * quantity) + ((price * quantity) * TAX);
      System.out.printf("The total price for the bill is: $%.2f \n", totalBill);
      return totalBill;
   }
   
   public static double computeBill(double price, int quantity, int couponDiscount){
      double discount = ((price * quantity)-couponDiscount);
      double  totalBill = (discount * TAX) + discount;
      System.out.printf("The total price for the bill is: $%.2f \n", totalBill);
      return totalBill;
   }
   
   public static void main(String[] a){
      double price;
      int quantity, couponDiscount;
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Input the price of the item: $");
      price = scan.nextDouble();
      System.out.printf("Input the quantity of the item: ");
      quantity = scan.nextInt();
      System.out.printf("Input the coupon discount of the item: ");
      couponDiscount = scan.nextInt();
   
      computeBill(price);
      computeBill(price, quantity);
      computeBill(price, quantity, couponDiscount);
   }
}
