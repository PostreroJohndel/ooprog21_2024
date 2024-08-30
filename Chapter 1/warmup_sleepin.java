import java.util.Scanner;

public class warmup_sleepin {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Is it Weekday? 'false' or 'true': ");   
        boolean weekday = Boolean.parseBoolean(scan.nextLine());    // Ang user ari mag input

        System.out.print("Are you on vacation? 'false' or 'true': ");
        boolean vacation = Boolean.parseBoolean(scan.nextLine());      // Ang user ari mag input

        // Call the static method sleepIn with the user input and print the result
        boolean result = sleepIn(weekday, vacation);
        System.out.println("Can you sleep? (" + weekday + ", " + vacation + ") -> " + result);
        
        scan.close();
    }
    
    // It's a boolean because it has only two choices: true and false.
    // The 2 parameters are weekday and vacation.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation; // !weekday -> not weekday, || -> OR
    }
}
