import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "Which sea creature has three hearts?";
        String choiceOne = "Shark";
        String choiceTwo = "Octopus";
        String choiceThree = "Blue Whale";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
				System.out.println(question);
        // Write a print statement giving the answer choices
				System.out.println("a. " + choiceOne);
				System.out.println("b. " + choiceTwo);
				System.out.println("c. " + choiceThree);


        // Have the user input an answer
        // Retrieve the user's input
				Scanner userInput = new Scanner(System.in);
				String userAnswer = userInput.next().toLowerCase();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
				if(correctAnswer.equals(userAnswer)) {
					System.out.println("Yay! the answer is correct.");
				} else {
					System.out.println("Oops! wrong answer, better luck next time.");
				}
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
    }

}
