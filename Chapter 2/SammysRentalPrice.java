import java.util.Scanner;

public class SammysRentalPrice {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double cpHour = 40.00;
      double cpMinute = 1.00;

      System.out.println("\n\n\t\t\t\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("\t\t\t\tS Sammy's makes it fun in the sun. S");
      System.out.println("\t\t\t\tSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

      System.out.printf("\n\n\tEnter the number of minutes rented: ");
      int totalMinutes = scan.nextInt();
                
      int hours = totalMinutes / 60;
      int minutes = totalMinutes % 60;
      double totalPrice = (hours * cpHour) + (minutes * cpMinute); //pwede ra + minutes ditso wa nay (minutes * cpMinute), kay 1 naman daan ang cpMinute

      System.out.printf("\n\tHours rented: %d\n", hours);
      System.out.printf("\tMinutes rented: %d\n", minutes);
      System.out.printf("\tTotal price: $%.2f\n", totalPrice);
   }
}
