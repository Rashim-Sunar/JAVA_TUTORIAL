import java.util.Random;
import java.util.Scanner;

public class RS_8_SCISSOR_PAPER_ROCK {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        try{
            int computerChoice =  random.nextInt(3); //range from 0 to 2.... 3 is excluded
            System.out.println("Enter 0 for scissor, 1 for Paper, 2 for Rock");
            int userInput = sc.nextInt();
            if(userInput<0 || userInput >2){
                System.out.println("Invalid choice!");
                return;
            }
            String computer = computerChoice == 0 ? "Scissor" : (computerChoice == 1 ? "Paper" : "Rock");
            if(userInput == computerChoice){
                System.out.println("Draw");
                System.out.println("Computer choice is also "+computer);
                return;
            }

            if((userInput == 0 && computerChoice == 1) || (userInput == 1 && computerChoice == 2) || (userInput == 2 && computerChoice == 0)){
                System.out.println("Congratulations! You won");
            }else{
                System.out.println("You lose. Better luck next time.");
            }
            System.out.println("Computer choice is "+computer);

        }finally{
            sc.close();
        }


    }
}
