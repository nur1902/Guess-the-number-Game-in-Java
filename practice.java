import java.util.Random;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int t=1;
        
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(100);
        
        int i=1;
        while (i<2) {
            System.out.print("Guess the number: ");
            int userInput=input.nextInt();
            if(userInput==num){
                System.out.print("Wow! you guess the correct Number "+userInput+"\nYou geuss in "+t+"th time");
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