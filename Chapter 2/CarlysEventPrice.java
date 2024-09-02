import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numGuest = 0;
        double price = 35.00;
        double totalPrice;

        
        System.out.println("\n\n\t\t\t\t***************************************");
        System.out.println("\t\t\t\t*  Carly's makes the food that makes  *");
        System.out.println("\t\t\t\t*            it a party.              *");
        System.out.println("\t\t\t\t***************************************");

        
        System.out.printf("\n\n\tInput the number of guests attending the event: ");
        while (true) {
            if (scan.hasNextInt()) {
                numGuest = scan.nextInt();
                if (numGuest >= 0) {
                    break;
                } else {
                    System.out.println("\tPlease enter a positive number.");
                }
            } else {
                System.out.println("\tInvalid input! Please enter a valid number.");
                scan.next();  
            }
            System.out.printf("\n\tInput the number of guests attending the event: ");
        }

        totalPrice = price * numGuest;

        
        System.out.printf("\n\tNumber of guests: %d\n", numGuest);
        System.out.printf("\tPrice per guest: $%.2f\n", price);
        System.out.printf("\tTotal price: $%.2f\n", totalPrice);

        
        if (numGuest >= 50) {
            System.out.println("\n\tThe job is classified as a large event!");
        } else {
            System.out.println("\n\tThe job is not classified as a large event!");
        }
    }
}
