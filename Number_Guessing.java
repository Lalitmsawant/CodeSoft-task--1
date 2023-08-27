
package number_guessing;

import java.util.*;


public class Number_Guessing {

   
    public static void main(String[] args) {
        String reapet="yes";
        Scanner sc=new Scanner(System.in);
        while(reapet.equals("yes"))
        {
            Random ran=new Random();
            int ran_num =ran.nextInt(100);
            int round,i;
            {
            System.out.println("Wel-come in Number Guessing Game");
            System.out.println("Please GUESS a Number between 1 to 100 ");
            System.out.println("Enter the round You Want");
            round=sc.nextInt();
            System.out.println("Enter your GUESS Number : ");
            for(  i=0;i<round;i++)
            {
                int guess=sc.nextInt();
                if(guess==ran_num)
                {
                    System.out.println("YOY WIN THE GAME!!..");
                    System.out.println("The Number was : "+ran_num);
                    System.out.println("Your Scores Is : "+((i)*10));
                    System.out.println("Would you like play Again!!.. Type 'yes'||'no'");
                    reapet=sc.next().toLowerCase();
                    
                break;
                }
                else if(guess > ran_num && i != round-1){
                    System.out.println("Guess Number is Higher!!..");
                }
                else if(guess < ran_num && i != round-1){
                    System.out.println("Guess Number is Lowest!!..");
                }
            }
                if(i == round)
                {
                    System.out.println("");
                    System.out.println("You Loss!!.. The Right Number is : "+ran_num);
                    System.out.println("Would you like play Again!!.. Type 'yes'||'no'");
                    reapet=sc.next().toLowerCase();
                }
            }
        }
          
    }
    
}
