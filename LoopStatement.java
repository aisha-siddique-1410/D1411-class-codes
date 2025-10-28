// loop : to execute a block of a code repeatedly as long as a specified condition is true
import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        // For loop : when you know the number of repetition

        // print number from 1 to 10
        

        // for(int i =1; i<=10; i++){  
        //     System.out.println(i);

        // }

        // print even number from 1 to 10

        //  for(int i =1; i<10; i++){  
        //   if(i%2!=0){
        //     System.out.println(i);
        //   }
         
        // }

        // for(int i=1; i<10; i=i+2){
        //     System.out.println(i);
        // }


        // while loop : when you don't know the number of iteration in advance 
        // print number from 1 to 5

        // int i=1;

        // while( i<=5){
        //     System.out.println(i);
        //     i++;

        // }

        // Scanner sc = new Scanner(System.in);
        // int luckyNum = 7;
        // System.out.println("Guess the lucky num between 1 to 10");
        // int guess = 0;
        
        // while(guess != luckyNum){
        //     System.out.println("Enter the number");
        //     guess = sc.nextInt();

        // if(guess == luckyNum){
        //     System.out.println("You wonnnnnnnnnnnn");
        // }else {
        //     System.out.println("Guess Again");
        // }

        // }

        // do - while loop : exit loop
        Scanner sc = new Scanner(System.in);
       String passsword;

        do {
            System.out.println("enter password");
            passsword = sc.nextLine();
        }while(!passsword.equals("abc123"));  
       

        System.out.println("Access");

        // class assignment
        /* 1. Find the sum of first 10 natuarl numbers
         * 2. Keep asking a user to enter a number until they enter 0, then print the sum of
         * entered numbers.
         */



    }
}
