public class warmup_sleepin {

    public static void main(String[] args) {
        // Call the static method sleepIn with parameters and print the results
        System.out.println("sleepIn(false, false)-> " + sleepIn(false, false)); 
        System.out.println("sleepIn(true, false)-> " + sleepIn(true, false));  
        System.out.println("sleepIn(false, true)-> " + sleepIn(false, true));  
    }
    
    // It's a boolean because it has only two choices: true and false.
    // The 2 parameters are weekday and vacation.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation; // !weekday -> not weekday, || -> OR
    }
}
