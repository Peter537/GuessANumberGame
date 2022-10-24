import java.util.Scanner;

public class HumanGuesser {

    public HumanGuesser() {

    }

    public int guess() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}