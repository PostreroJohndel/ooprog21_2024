import java.util.Scanner;
public class PalindromeActivity {

   public static void checkPalindrome(String str) {
      String word = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      int length = word.length();
      int matchCount = 0;

      for (int i = 0; i < length / 2; i++) {
         if (word.charAt(i) == word.charAt(length - i - 1)) {
            matchCount++;
         }
      }

      if (matchCount == length / 2) {
         System.out.println("\n\tThis is a palindrome.");
      } else {
         System.out.println("\n\tThis is not a palindrome.");
      }
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String continueInput;
      do {
         System.out.print("\n\n\tInput a String: ");
         String input = scanner.nextLine();
            
         checkPalindrome(input);
            
         System.out.print("\n\tWould you like to INPUT another string? (Y/N): ");
         continueInput = scanner.nextLine().toLowerCase();
      } while (continueInput.equals("y"));
        
      System.out.println("\n\tBYE BYE!!!");
      scanner.close();
   }
}
