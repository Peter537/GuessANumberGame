public class Main {

    public static void main(String[] args) {
        GameControl gameControl = new GameControl(1, 100);
        gameControl.runGame(new HumanThinker(), new HumanGuesser());
    }
}