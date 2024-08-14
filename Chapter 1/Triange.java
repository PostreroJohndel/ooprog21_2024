public class Triangle {

    public static void main(String[] args) {
        int height = 7;
        int base = 13;

        for (int i = 1; i <= height; i++) {          // each row
            int Count = (base * i) / height;         // calculate the number of T to print for the current row
            int spaces = (base - Count) / 2;         // centering the T by adding spaces before them

            for (int s = 0; s < spaces; s++) {       // print spaces
                System.out.print(" ");
            }
            
            for (int s = 0; s < Count; s++) {        // print T's
                System.out.print("T");
            }
            
            System.out.println();
        }
    }
}
