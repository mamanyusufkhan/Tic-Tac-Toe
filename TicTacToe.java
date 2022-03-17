import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class TicTacToe {
    GameFrame gameFrame = new GameFrame();
    Officiator officiator = new Officiator();
    AI ai = new RandomAI();




    public TicTacToe() {
        setTheFrameResolutionsAndAttributes();
        onClickingRandomAIButton();
        onClickingDefensiveAIButton();
        onClickingButtonsFromTheGame();
    }


    private void onClickingRandomAIButton(){
        gameFrame.randomAIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.EmptyTheGameBoard(gameFrame);
                gameFrame.adjustButton();
                gameFrame.turnPanel.setText("Player's Turn");
                ai = new RandomAI();
            }
        });
    }

    private void setTheFrameResolutionsAndAttributes(){
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setBounds(400, 100, 700, 600);
        gameFrame.setTitle("Tic-Tac-Toe");
        gameFrame.setResizable(false);
    }

    private void onClickingDefensiveAIButton(){
        gameFrame.defensiveAIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.EmptyTheGameBoard(gameFrame);
                gameFrame.adjustButton();
                gameFrame.turnPanel.setText("Player's Turn");
                ai = new DefensiveAI();
            }
        });
    }

    private void onClickingButtonsFromTheGame(){
        for (int boardButtonNumber = 0; boardButtonNumber < 9; boardButtonNumber++) {
            gameFrame.buttons[boardButtonNumber].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int boardButtonNumber = 0; boardButtonNumber < 9; boardButtonNumber++) {
                        if (isClickedByPlayer(e,gameFrame.buttons[boardButtonNumber])) {
                            if (isEligibleToBeClickedByPlayer(gameFrame.buttonClickedByPlayer.get(boardButtonNumber), gameFrame.buttonPressedCount)) {
                                ClickTheButtonForThePlayer(boardButtonNumber, gameFrame);
                                increaseTheButtonPressedCount(gameFrame);
                                checkIfPlayersMoveDeterminesTheResult();
                                if (areAllButtonsNotClicked()){
                                    clickTheButtonForTheAI();
                                    checkIfTheAIsMoveDeterminesTheResult();
                                }
                                if (areAllButtonsClicked()) {
                                    endTheMatchInDraw();
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    private boolean isClickedByPlayer(ActionEvent e, JButton button){
        return e.getSource() == button;
    }

    private boolean isEligibleToBeClickedByPlayer(Integer valueOfTheButton, int buttonPressedCount){
        return valueOfTheButton == 0 && areAllButtonsNotClicked();
    }

    private void ClickTheButtonForThePlayer(Integer buttonNumber, GameFrame gameFrame){
        gameFrame.buttonClickedByPlayer.set(buttonNumber, 1);
        gameFrame.adjustButton();
    }


    private void increaseTheButtonPressedCount(GameFrame gameFrame){
        gameFrame.buttonPressedCount++;
    }

    private void checkIfPlayersMoveDeterminesTheResult(){
        officiator.checkResult(gameFrame, 1);
    }

    private void clickTheButtonForTheAI(){
        ai.makeMove(gameFrame);
        gameFrame.adjustButton();
    }

    private void checkIfTheAIsMoveDeterminesTheResult(){
        officiator.checkResult(gameFrame, 2);
    }

    private boolean areAllButtonsNotClicked(){
        return gameFrame.buttonPressedCount < 9;
    }

    private boolean areAllButtonsClicked(){
        return gameFrame.buttonPressedCount == 9;
    }

    private void endTheMatchInDraw(){
        gameFrame.turnPanel.setText("Match Drawn");
        gameFrame.buttonPressedCount++;
    }






}









