import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        randomNum();
        Player playerCurrent = player2;
        do {
            playerCurrent = switchPlayer(playerCurrent);
            System.out.print(playerCurrent.getName() + ", введите число от 1 до 100: ");
            playerCurrent.setNumber(scanner.nextInt());
            
            if (secretNum < playerCurrent.getNumber()) {
                System.out.println("Это число больше загаданного");
            } else if(secretNum > playerCurrent.getNumber()) {
                System.out.println("Это число меньше загаданного");
            }
        } while (secretNum != playerCurrent.getNumber());

        System.out.print("Игрок " + playerCurrent.getName() + " угадал число!!!");
        secretNum = 0;
    }

    private Player switchPlayer(Player player) {
        if (player == player1) {
            return player2;
        } 
        return player1;
    }

    private void randomNum() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
        System.out.println("secretNum = " + secretNum);
    }
}