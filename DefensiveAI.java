public class DefensiveAI extends AI{



    @Override
    public void makeMove(GameFrame gameFrame) {
        if (gameFrame.buttonClickedByPlayer.get(4) == 0){
            gameFrame.buttonClickedByPlayer.set(4, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(1) == 1 && gameFrame.buttonClickedByPlayer.get(2) == 1)||
                (gameFrame.buttonClickedByPlayer.get(3) == 1 && gameFrame.buttonClickedByPlayer.get(6) == 1)||
                (gameFrame.buttonClickedByPlayer.get(4) == 1 && gameFrame.buttonClickedByPlayer.get(8) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(0) == 0){

            gameFrame.buttonClickedByPlayer.set(0, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(0) == 1 && gameFrame.buttonClickedByPlayer.get(2) == 1)||
                (gameFrame.buttonClickedByPlayer.get(4) == 1 && gameFrame.buttonClickedByPlayer.get(7) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(1) == 0){

            gameFrame.buttonClickedByPlayer.set(1, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(0) == 1 && gameFrame.buttonClickedByPlayer.get(1) == 1)||
                (gameFrame.buttonClickedByPlayer.get(5) == 1 && gameFrame.buttonClickedByPlayer.get(8) == 1)||
                (gameFrame.buttonClickedByPlayer.get(4) == 1 && gameFrame.buttonClickedByPlayer.get(6) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(2) == 0){

            gameFrame.buttonClickedByPlayer.set(2, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(0) == 1 && gameFrame.buttonClickedByPlayer.get(6) == 1)||
                (gameFrame.buttonClickedByPlayer.get(4) == 1 && gameFrame.buttonClickedByPlayer.get(5) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(3) == 0){

            gameFrame.buttonClickedByPlayer.set(3, 2);
            gameFrame.buttonPressedCount++;
        }

        else if (((gameFrame.buttonClickedByPlayer.get(2) == 1 && gameFrame.buttonClickedByPlayer.get(8) == 1)||
                (gameFrame.buttonClickedByPlayer.get(3) == 1 && gameFrame.buttonClickedByPlayer.get(4) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(5) == 0){

            gameFrame.buttonClickedByPlayer.set(5, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(0) == 1 && gameFrame.buttonClickedByPlayer.get(3) == 1)||
                (gameFrame.buttonClickedByPlayer.get(7) == 1 && gameFrame.buttonClickedByPlayer.get(8) == 1)||
                (gameFrame.buttonClickedByPlayer.get(2) == 1 && gameFrame.buttonClickedByPlayer.get(4) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(6) == 0){

            gameFrame.buttonClickedByPlayer.set(6, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(1) == 1 && gameFrame.buttonClickedByPlayer.get(4) == 1)||
                (gameFrame.buttonClickedByPlayer.get(6) == 1 && gameFrame.buttonClickedByPlayer.get(8) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(7) == 0){

            gameFrame.buttonClickedByPlayer.set(7, 2);
            gameFrame.buttonPressedCount++;
        }
        else if (((gameFrame.buttonClickedByPlayer.get(2) == 1 && gameFrame.buttonClickedByPlayer.get(5) == 1)||
                (gameFrame.buttonClickedByPlayer.get(6) == 1 && gameFrame.buttonClickedByPlayer.get(7) == 1)||
                (gameFrame.buttonClickedByPlayer.get(0) == 1 && gameFrame.buttonClickedByPlayer.get(4) == 1)) &&
                gameFrame.buttonClickedByPlayer.get(8) == 0){

            gameFrame.buttonClickedByPlayer.set(8, 2);
            gameFrame.buttonPressedCount++;
        }

        else{
            super.makeMove(gameFrame);
        }


    }
}
