import java.util.Scanner;

public class TestBloodData {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in); 
      BloodData bd = new BloodData();
        
      String bloodType;
      do {
         System.out.printf("\tEnter blood type (A, B, AB, O): ");
         bloodType = scan.next().toUpperCase();
         bd.setBloodType(bloodType);
      } while (!(bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")));
  
      String rhFactor;
      do {
            System.out.printf("\tEnter Rh factor (+ or -): ");
            rhFactor = scan.next();
            bd.setRhFactor(rhFactor);
        } while (!(rhFactor.equals("+") || rhFactor.equals("-")));
        
        bd.displayBloodInfo();
    }
}
