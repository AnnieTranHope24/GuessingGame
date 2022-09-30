import java.util.Random;
import java.util.Scanner;

public class Guesser {

	private int ranNumb;
	private int numGuesses;
	private int yourGuess;
	private boolean isRightAns;
	public static int MAX_GUESSES = 3;
	public Guesser() {
		Random ran = new Random();
		setRanNumb(ran.nextInt(16));	
		
		setRightAns(false);
		setNumGuesses(0);
		
	}

	public void guess() {
		setNumGuesses(getNumGuesses() + 1);
		System.out.println("Enter your integer: ");
		Scanner scan = new Scanner(System.in);
		setYourGuess(scan.nextInt());
		if(getYourGuess() == getRanNumb()) {
			setRightAns(true);	
			setNumGuesses(0);
		}else if(getYourGuess() > getRanNumb()){
			System.out.println("Your guess is too high!");
		}else {
			System.out.println("Your guess is too low!");
		}
		
	}

	public int getNumGuesses() {
		return numGuesses;
	}

	public void setNumGuesses(int numGuesses) {
		this.numGuesses = numGuesses;
	}

	public boolean isRightAns() {
		return isRightAns;
	}

	public void setRightAns(boolean isRightAns) {
		this.isRightAns = isRightAns;
	}



	public int getYourGuess() {
		return yourGuess;
	}



	public void setYourGuess(int yourGuess) {
		this.yourGuess = yourGuess;
	}



	public int getRanNumb() {
		return ranNumb;
	}



	public void setRanNumb(int ranNumb) {
		this.ranNumb = ranNumb;
	}
	
}
