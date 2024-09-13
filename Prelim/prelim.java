public class prelim{
   public static void main(String[] args){
      for(int i = 0; i <= 10; i++){
         System.out.println("\n\tfibonacci("+i+") --> " +fibonacci(i));
      }
   }
   
   public static int fibonacci(int number){
      if(number == 0){ // kung equals to 0 ang number kay e return false niya                                int kay 0                                                            return to fibonacci (0) --> 0    
         return 0;                                                                                        // int kay 1                                                            return to fibonacci (1) --> 1
      } else if(number == 1){ // kung equals sa 1 ang number kay e return true ////// int kay 2 pasa sa ari fibonacci(2 - 1) + fibonacci(2 - 2) = 1+0 = 1                         return to fibonacci (2) --> 1        
         return 1;                                                                                        // and so on
      } else {                                                                                            //
         return fibonacci(number - 1) + fibonacci(number - 2); // e return ang answer ari padung sa main          
      }
   }
}