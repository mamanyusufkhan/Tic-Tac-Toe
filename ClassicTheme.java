import javax.swing.*;
import java.awt.*;

public class ClassicTheme implements Theme{

    public ClassicTheme(GameFrame gameFrame){
        changeBackgroundColor(gameFrame);
        changeLineColor(gameFrame);
        changeTurnPanelColor(gameFrame);

    }

    public void changeBackgroundColor(GameFrame gameFrame){
        gameFrame.gameBackground.setBackground(Color.WHITE);
    }
    public void changeLineColor(GameFrame gameFrame){
        gameFrame.buttonPanel.setOpaque(true);
        gameFrame.buttonPanel.setBackground(Color.BLACK);
    }

    public void changeTurnPanelColor(GameFrame gameFrame){
        gameFrame.setForeground(Color.BLACK);
    }


    public void getEmptyButton(JButton button){

        button.setBackground(Color.WHITE);
        button.setText("");

    }

    public void getPlayerButton(JButton button){

        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("ARIAL", Font.BOLD, 70));
        button.setText("X");

    }

    public void getAIButton(JButton button){

        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("ARIAL", Font.BOLD, 70));
        button.setText("O");

    }




}
