import java.util.Scanner;
public class SortingThreeNumbers {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("\n\tNumber Sorter (Ascending and Descending): ");
        System.out.printf("\n\n\tInput the first number: ");
        int num1 = scan.nextInt();
        System.out.printf("\tInput the second number: ");
        int num2 = scan.nextInt();
        System.out.printf("\tInput the third number: ");
        int num3 = scan.nextInt();
        
        int min, mid, max;
        
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
            if (num2 <= num3) {
                mid = num2;
                max = num3;
            } else {
                mid = num3;
                max = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
            if (num1 <= num3) {
                mid = num1;
                max = num3;
            } else {
                mid = num3;
                max = num1;
            }
        } else {
            min = num3;
            if (num1 <= num2) {
                mid = num1;
                max = num2;
            } else {
                mid = num2;
                max = num1;
            }
        }
        
        System.out.println("\n\tAscending order: " + min + ", " + mid + ", " + max);
        System.out.println("\tDescending order: " + max + ", " + mid + ", " + min);  
        scan.close();
    }
}
