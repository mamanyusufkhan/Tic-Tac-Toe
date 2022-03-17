import javax.swing.*;
import java.awt.*;

public class HighContrastTheme implements Theme{

    public HighContrastTheme(GameFrame gameFrame){
        changeBackgroundColor(gameFrame);
        changeLineColor(gameFrame);
        changeTurnPanelColor(gameFrame);
    }

    public void changeBackgroundColor(GameFrame gameFrame){
        gameFrame.gameBackground.setBackground(Color.darkGray);
    }
    public void changeLineColor(GameFrame gameFrame){
        gameFrame.buttonPanel.setOpaque(true);
        gameFrame.buttonPanel.setBackground(Color.lightGray);

    }
    public void changeTurnPanelColor(GameFrame gameFrame){
        gameFrame.setForeground(Color.lightGray);
    }

    public void getEmptyButton(JButton button){

        button.setBackground(Color.darkGray);

    }

    public void getPlayerButton(JButton button){

        button.setBackground(Color.black);


    }

    public void getAIButton(JButton button){

        button.setBackground(Color.WHITE);


    }
}
