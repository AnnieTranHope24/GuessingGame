

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guesser guesser = new Guesser();
	
		int ranNumb = guesser.getRanNumb();
		//System.out.println(ranNumb);
		while(!guesser.isRightAns() && guesser.getNumGuesses() < guesser.MAX_GUESSES) {
			guesser.guess();
		}
		
		if(guesser.getNumGuesses() == guesser.MAX_GUESSES) {

			System.out.println("You run out of guesses. Game over!");
			System.out.println("The answer is " + ranNumb);
		}else {
			
				System.out.println("You win!");
				
		}


	}

}
