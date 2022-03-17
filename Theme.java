import javax.swing.*;

public interface Theme {
    void changeBackgroundColor(GameFrame gameFrame);
    void changeLineColor(GameFrame gameFrame);
    void changeTurnPanelColor(GameFrame gameFrame);
    void getEmptyButton(JButton button);
    void getPlayerButton(JButton button);
    void getAIButton(JButton button);

}
