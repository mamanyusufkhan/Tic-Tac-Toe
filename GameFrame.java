import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameFrame extends JFrame {
    ImageIcon icon;
    Theme currentTheme;
    Container gameBackground;
    JLabel turnPanel;
    JLabel buttonPanel;
    JButton classicThemeButton, forestThemeButton, highContrastThemeButton, randomAIButton, defensiveAIButton;
    JButton[] buttons =  new JButton[9];
    String currentTurn = "User";
    ArrayList <Integer> buttonClickedByPlayer = new ArrayList<>(9);
    int buttonPressedCount = 0;

    public GameFrame(){
        getBackgroundOfFrame();
        makeButtonPanel();
        currentTheme = new ClassicTheme(this);
        setTheIconImage();
        initializeTheButtonsClickedToNone();
        makeGameBoard();
        addTurnPanel();
        addClassicThemeButton();
        addForestThemeButton();
        addHighContrastThemeButton();
        addRandomAIButton();
        addDefensiveAIButton();



    }

    public void setTheIconImage(){
        icon = new ImageIcon(getClass().getResource("tic.png"));
        this.setIconImage(icon.getImage());
    }



    public void makeButtonPanel(){
        getBackgroundOfFrame();
        buttonPanel = new JLabel();
        buttonPanel.setBounds(40, 100, 340, 340);
        gameBackground.add(buttonPanel);
    }

   public void makeGameBoard() {
            int y = 100;
            for (int i = 0; i < 3; i++){
                int x = 40;
                for (int j = 0; j < 3; j++){
                    buttons[i*3 + j] = new JButton();
                    if (buttonClickedByPlayer.get(i*3 + j) == 1){
                        currentTheme.getPlayerButton(buttons[i*3 + j]);
                    }
                    else if(buttonClickedByPlayer.get(i*3 + j) == 2){
                        currentTheme.getAIButton(buttons[i*3 + j]);
                    }
                    else{
                        currentTheme.getEmptyButton(buttons[i*3 + j]);
                    }
                    buttons[i*3 + j].setBounds(x, y, 100, 100);
                    buttons[i*3 + j].setFont(new Font("ARIAL", Font.BOLD, 70));
                    gameBackground.add(buttons[i*3 + j]);
                    x += 120;
                }
                y += 120;
            }

        }


    public void addTurnPanel(){
        Font turnPanelFont = new Font("Arial", Font.BOLD, 30);
        getBackgroundOfFrame();
        turnPanel = new JLabel();
        turnPanel.setText("Player's Turn");
        turnPanel.setFont(turnPanelFont);
        turnPanel.setBounds(120, 440, 700, 100);
        gameBackground.add(turnPanel);
    }

    public void addClassicThemeButton(){

        getBackgroundOfFrame();
        classicThemeButton = new JButton();
        classicThemeButton.setBounds(450, 40, 200, 100);
        classicThemeButton.setBackground(Color.WHITE);
        classicThemeButton.setText("CLASSIC THEME");
        classicThemeButton.setFont(getThemeButtonFont());
        gameBackground.add(classicThemeButton);
        classicThemeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeEverythingFromJbutton();
                setCurrentThemeToClassic();
                adjustButton();
            }
        });
    }

    public void addForestThemeButton(){
        getBackgroundOfFrame();
        forestThemeButton = new JButton();
        forestThemeButton.setBounds(450, 160, 200, 100);
        forestThemeButton.setBackground(Color.green);
        forestThemeButton.setForeground(new Color(0, 102, 0));
        forestThemeButton.setText("FOREST THEME");
        forestThemeButton.setFont(getThemeButtonFont());
        gameBackground.add(forestThemeButton);
        forestThemeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeEverythingFromJbutton();
                setCurrentThemeToForest();
                adjustButton();
            }
        });
    }

    public void addHighContrastThemeButton(){
        getBackgroundOfFrame();
        highContrastThemeButton = new JButton();
        highContrastThemeButton.setBounds(450, 280, 200, 100);
        highContrastThemeButton.setBackground(Color.darkGray);
        highContrastThemeButton.setForeground(Color.lightGray);
        highContrastThemeButton.setText("HIGH CONTRAST THEME");
        highContrastThemeButton.setFont(getThemeButtonFont());
        gameBackground.add(highContrastThemeButton);
        highContrastThemeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeEverythingFromJbutton();
                setCurrentThemeToHighContrast();
                adjustButton();
            }
        });
    }

    public void addRandomAIButton(){
        randomAIButton = new JButton();
        randomAIButton.setBounds(450, 420, 200, 50);
        randomAIButton.setBackground(Color.BLACK);
        randomAIButton.setForeground(Color.white);
        randomAIButton.setText("Random AI");
        gameBackground.add(randomAIButton);

    }

    public void addDefensiveAIButton(){
        defensiveAIButton = new JButton();
        defensiveAIButton.setBounds(450, 500, 200, 50);
        defensiveAIButton.setBackground(Color.BLACK);
        defensiveAIButton.setForeground(Color.white);
        defensiveAIButton.setText("Defensive AI");
        gameBackground.add(defensiveAIButton);
    }



    public void EmptyTheGameBoard(GameFrame gameFrame){
        for (int i = 0; i < 9; i++){
            gameFrame.buttonClickedByPlayer.set(i, 0);
        }
        gameFrame.buttonPressedCount = 0;
    }

    public void initializeTheButtonsClickedToNone(){
        for (int i = 0; i < 9; i++){
            buttonClickedByPlayer.add(0);
        }
    }


    public void getBackgroundOfFrame() {
        gameBackground = this.getContentPane();
        gameBackground.setLayout(null);
    }



    public Font getThemeButtonFont(){
        return new Font("Arial", Font.BOLD, 13);
    }

    public void setCurrentThemeToClassic(){
        currentTheme = new ClassicTheme(this);
    }

    public void setCurrentThemeToForest(){
        currentTheme = new ForestTheme(this);
    }

    public void setCurrentThemeToHighContrast(){
        currentTheme = new HighContrastTheme(this);
    }

    public void adjustButton(){
        for (int i = 0; i < 9; i++){
            if (buttonClickedByPlayer.get(i) == 1){
                currentTheme.getPlayerButton(buttons[i]);
            }
            else if(buttonClickedByPlayer.get(i) == 2){
                currentTheme.getAIButton(buttons[i]);
            }
            else{
                currentTheme.getEmptyButton(buttons[i]);
            }
        }
    }

    public void removeEverythingFromJbutton(){
        for (int i = 0; i < 9; i++) {
            buttons[i].setIcon(null);
            buttons[i].setBackground(null);
            buttons[i].setText(null);
            buttons[i].setFont(null);
            buttons[i].setForeground(null);
        }
    }


}







