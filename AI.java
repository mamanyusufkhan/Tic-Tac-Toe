import java.awt.*;
import java.util.Random;

public class AI {
    public void makeMove(GameFrame gameFrame) {

            Random r = new Random();
            int randomNumber = r.nextInt(9);
            while (gameFrame.buttonClickedByPlayer.get(randomNumber) != 0) {
                randomNumber = r.nextInt(9);
            }
            gameFrame.buttonClickedByPlayer.set(randomNumber, 2);
            gameFrame.buttonPressedCount++;

    }
}

