package guessGame;
import java.util.Scanner;

public class Guessgme2 {

	public static void main(String[] args) {
		
		
		int correctnumber = (int) (Math.random() * 51);  //0 : 50
		
		System.out.println("Hello, Welcome to the Guessgame.");
		System.out.println("You can only choose between 0 to 50");
		
		for(int i = 10 - 1; i > -1; i--) {
		
		System.out.println("Guess the number: ");
		
		Scanner guess = new Scanner(System.in);
		int input = guess.nextInt();
		
		if(input >= 51 ||input <= -1 ) {
			System.out.println("Out of Range.");
			break;
		}
		
		if(input == correctnumber) {
		
		System.out.println("correct, good guess.");
		System.out.println("You Win.");
		break;
		
		}
		else if(input > correctnumber) {
			System.out.println("Wrong, your guess is larger.");
		}
		else {
			System.out.println("Your guess is smaller.");
		}
		
		
		System.out.println("****************");
	
		
		System.out.println("Remember, You have " + i + " trials left, So choose wisely.");
		
		System.out.println("\n");
		
		if(input != correctnumber && i == 0) {
		System.out.println("Game Over");
		System.out.println("The correct number was " + correctnumber);
		
		  }
		}
		
	}

}
