package java_niit;
import java.util.*;

public class RPS {

    public void welcomeGame() {
        // I'm attempting to make rock, paper scissors with Java Random class
        // rules of rock paper scissors is: rock kills scissors, scissors kills paper, paper kills rock
        // So from this we would be using the comparison operator == and if construct

        System.out.println("Welcome to Rock, Paper and Scissors game!");
        // System.out.println("You have only 5 tries");
        gameStart();

    }

    public void gameStart() {

        String[] randomStrings = {"Rock", "Paper", "Scissors"};
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int randomNum = rand.nextInt(randomStrings.length); // a variable "randomNum" to hold the random array index
        String selectedString = randomStrings[randomNum]; // This is the computer guess in a string format
        // int chances = 5;
        
        System.out.println("Enter either Rock, Paper or Scissors");
        String playerGuess = input.next();

       
            if (playerGuess.equalsIgnoreCase("Rock")) { // if user input is Rock
                System.out.println("My guess is " + selectedString);
                switch (selectedString) {
                    case "Rock":
                        System.out.println("We have a tie!");
                        gameStart(); // if the computer guess and mine are the same, start game again
                    break;
                    case "Paper":
                        System.out.println("You lost!");
                        break;
                    case "Scissors":
                        System.out.println("Congratulations! You won.");
                    break;
                    default:
                        break;
                }
            } 
            else if (playerGuess.equalsIgnoreCase("Paper")) { // if user input is Paper
                System.out.println("My guess is " + selectedString);
                switch (selectedString) {
                    case "Rock":
                    System.out.println("Congratulations! You won.");
                    break;
                    case "Paper":
                    System.out.println("We have a tie!");
                    gameStart(); // if the computer guess and mine are the same, start game again
                        break;
                    case "Scissors":
                        System.out.println("Oops, You lost!");
                    break;
                    default:
                        break;
                }
            }
            else if (playerGuess.equalsIgnoreCase("Scissors")) { // if user input is Scisssors
                System.out.println("My guess is " + selectedString);
                switch (selectedString) {
                    case "Rock":
                    System.out.println("Oops, You lost!");
                    break;
                    case "Paper":
                    System.out.println("Congratulations! You won.");
                        break;
                    case "Scissors":
                    System.out.println("We have a tie!");
                    gameStart(); // if the computer guess and mine are the same, start game again
                    break;
                    default:
                        break;
                }
            }
            else {
                System.out.println("Invalid input! Try again\n");
                gameStart(); // if the user enters any input other than Rock, rock, Paper, paper, Scissors & scissors
            }
    }
    public static void main(String[] args) {
        RPS game = new RPS();
        game.welcomeGame();

    }
}
