import java.util.Scanner;

public class Phone{

   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      PhoneDirectory[] directory = new PhoneDirectory[30];
      int count = 0;
      
      directory[0] new = PhoneDirectory("Jd","09560363615");
      directory[1] new = PhoneDirectory("Johnny","09560565637");
      directory[2] new = PhoneDirectory("Cj","09760454536");
      directory[3] new = PhoneDirectory("Raffy","09560373715");
      directory[4] new = PhoneDirectory("Dabi","09560363689");
      directory[5] new = PhoneDirectory("Fredo","09790363615");
      directory[6] new = PhoneDirectory("Gxruss","09980363615");
      directory[7] new = PhoneDirectory("Kingkoy","09570963615");
      directory[8] new = PhoneDirectory("Buchok","09561123615");
      directory[9] new = PhoneDirectory("Muslo","09560679815");
      
      count = 10;
      
      do{
         System.out.print("Input your name (or type 'quit' to exit): ");
         String name = scan.nextLine();
            
      
      }

   }
}