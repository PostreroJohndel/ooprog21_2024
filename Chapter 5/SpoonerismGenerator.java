import java.util.Scanner;
public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    public static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word1 = getWord("\n\t\tInput your First word: ");
            String word2 = getWord("\t\tInput your Second word: ");

            int vowelIndex1 = vowelIndex(word1);
            int vowelIndex2 = vowelIndex(word2);

            if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
                System.out.println("\t\t\n" + word1 + " and " + word2 + " are not good words to spoonerize!");
            } else {
                String prefix1 = word1.substring(0, vowelIndex1);
                String suffix1 = word1.substring(vowelIndex1);

                String prefix2 = word2.substring(0, vowelIndex2);
                String suffix2 = word2.substring(vowelIndex2);

                String spoonerizedWord1 = prefix2 + suffix1;
                String spoonerizedWord2 = prefix1 + suffix2;

                System.out.println("\n\t\t" + word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
            }

            System.out.print("\n\t\tWould you like to try another pair? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("\t\tGoodbye!");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        run();
    }
