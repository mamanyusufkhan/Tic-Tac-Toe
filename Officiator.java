public class Officiator {

    public void checkResult(GameFrame gameFrame, int isClickedByPlayer){
        if (checkingTheExistenceOfThreeInARow(gameFrame, isClickedByPlayer)){
            determiningTheWinnerOfTheGame(gameFrame, isClickedByPlayer);
            endingTheGameToStopFurtherMoves(gameFrame);

        }
    }


    public boolean checkVertically(GameFrame gameFrame, Integer isClickedByPlayer){
        return checkFirstColumn(gameFrame, isClickedByPlayer) || checkSecondColumn(gameFrame, isClickedByPlayer) || checkThirdColumn(gameFrame, isClickedByPlayer);
    }

    public boolean checkFirstColumn(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(0) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(3) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(6) == isClickedByPlayer;
    }

    public boolean checkSecondColumn(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(1) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(4) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(7) == isClickedByPlayer;
    }

    public boolean checkThirdColumn(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(2) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(5) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(8) == isClickedByPlayer;
    }

    public boolean checkHorizontally(GameFrame gameFrame, Integer isClickedByPlayer){
        return checkFirstRow(gameFrame, isClickedByPlayer) || checkSecondRow(gameFrame, isClickedByPlayer) || checkThirdRow(gameFrame, isClickedByPlayer);
    }

    public boolean checkFirstRow(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(0) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(1) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(2) == isClickedByPlayer;

    }

    public boolean checkSecondRow(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(3) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(4) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(5) == isClickedByPlayer;

    }

    public boolean checkThirdRow(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(6) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(7) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(8) == isClickedByPlayer;

    }

    public boolean checkDiagonally(GameFrame gameFrame, Integer isClickedByPlayer){
        return checkDescending(gameFrame, isClickedByPlayer) || checkAscending(gameFrame, isClickedByPlayer);
    }

    public boolean checkAscending(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(6) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(4) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(2) == isClickedByPlayer;

    }

    public boolean checkDescending(GameFrame gameFrame, Integer isClickedByPlayer){
        return gameFrame.buttonClickedByPlayer.get(0) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(4) == isClickedByPlayer && gameFrame.buttonClickedByPlayer.get(8) == isClickedByPlayer;

    }

    public void endingTheGameToStopFurtherMoves(GameFrame gameFrame){
        gameFrame.buttonPressedCount = 10;
    }

    public void determiningTheWinnerOfTheGame(GameFrame gameFrame, Integer isClickedByPlayer){
        if (isClickedByPlayer == 1){
            gameFrame.turnPanel.setText("Player Wins");
        }
        else{
            gameFrame.turnPanel.setText("AI Wins");
        }
    }

    public boolean checkingTheExistenceOfThreeInARow(GameFrame gameFrame, Integer isClickedByPlayer){
        return checkVertically(gameFrame, isClickedByPlayer) || checkHorizontally(gameFrame, isClickedByPlayer) || checkDiagonally(gameFrame, isClickedByPlayer);
    }
}
