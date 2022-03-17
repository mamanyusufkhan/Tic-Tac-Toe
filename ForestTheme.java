import javax.swing.*;
import java.awt.*;

public class ForestTheme implements Theme{

    ImageIcon aiMove = new ImageIcon(getClass().getResource("fruit.png"));
    ImageIcon playerMove = new ImageIcon(getClass().getResource("flower.jpg"));



    public ForestTheme(GameFrame gameFrame){
        changeBackgroundColor(gameFrame);
        changeLineColor(gameFrame);
        changeTurnPanelColor(gameFrame);


    }

    public void changeBackgroundColor(GameFrame gameFrame){
        gameFrame.gameBackground.setBackground(Color.GREEN);
    }
    public void changeLineColor(GameFrame gameFrame){
        gameFrame.buttonPanel.setOpaque(true);
        gameFrame.buttonPanel.setBackground(new Color(0, 102, 0));

    }
    public void changeTurnPanelColor(GameFrame gameFrame){
        gameFrame.setForeground(new Color(0, 102, 0));
    }

    public void getEmptyButton(JButton button){

        button.setBackground(Color.green);
        button.setIcon(null);

    }

    public void getPlayerButton(JButton button){

        button.setIcon(playerMove);

    }

    public void getAIButton(JButton button){


        button.setIcon(aiMove);

    }
}
