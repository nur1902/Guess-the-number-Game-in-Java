

import java.util.Random;
import java.util.Scanner;

public class GuessTheGame {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int t=1;
        
        Scanner input=new Scanner(System.in);
        Random random=new Random();

        System.out.println("......Guess The Number......");
        System.out.println("Select Mode.........");
        System.out.println("1.Easy(1-100)");
        System.out.println("2.Medium(1-250)");
        System.out.println("3.Difficult(1-500)");
        System.out.println("4.Hard(1-1000)");
        System.out.print("Enter mode number: ");
        int z=input.nextInt();
        int num=0;
        if (z==1) {
             num=random.nextInt(100);
        }
        else if(z==2){
            num=random.nextInt(250);
        }
        else if(z==3){
            num=random.nextInt(500);
        }
        else if (z==4) 
        {
            num=random.nextInt(1000);

        }
        else {
            System.out.println("you entered wrong number");
        }
        
        


       
        
        int i=1;
        while (i<2) {
            
            System.out.print("Guess the number: ");
            int userInput=input.nextInt();
            if(userInput==num){
                System.out.println("Wow! you guess the correct Number "+userInput+"\nYou geuss in "+t+"th time");

                System.out.println("Developer of this game is Nur Mohammed. Email: mohammed2305101902@diu.edu.bd");
                i=3;
                
            }
            else if (userInput<num) {
                System.out.println("You geuss small number than actual number");
                t=t+1;
                i=1;
                
            }
            else if (userInput>num) {
                System.out.println("You guess high number than actual number");
                t=t+1;
                i=1;
                
            }

            
        }
        
        
    }
}
