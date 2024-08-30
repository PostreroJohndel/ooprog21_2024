import java.util.Scanner;

public class warmup_sleepin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Is it Weekday? 'false' or 'true': ");
        String weekdayInput = scan.nextLine();    // ari mag input
        boolean weekday = Boolean.parseBoolean(weekdayInput);    // Convert string input to boolean

        System.out.print("Are you on vacation? 'false' or 'true': ");
        String vacationInput = scan.nextLine();      // ari mag input
        boolean vacation = Boolean.parseBoolean(vacationInput);      // Convert string input to boolean

        // Call the static method sleepIn
        boolean result = sleepIn(weekday, vacation);
        System.out.println("Can you sleep? (" + weekday + ", " + vacation + ") -> " + result);
        
        scan.close();
    }
    
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation; // !weekday -> not weekday, || -> OR
    }
}
