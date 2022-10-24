public class GameControl {

    public GameControl() {

    }

    public void start() {
        HumanThinker player1 = new HumanThinker();
        HumanGuesser player2 = new HumanGuesser();
        int tries = 0;
        player1.setNumber(1, 100);
        boolean isCorrect = false;
        while (!isCorrect) {
            tries++;
            System.out.print("Make a guess: ");
            int guess = player2.guess();
            System.out.print("Guessers answer was: ");
            String answer = player1.parseGuess(guess);
            if (answer.equalsIgnoreCase("Correct")) {
                isCorrect = true;
            }
            System.out.println(answer);
        }
        System.out.println("It took you " + tries + (tries > 1 ? " tries" : " try") + " to guess the number.");
    }
}