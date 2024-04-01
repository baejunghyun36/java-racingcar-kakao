package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.InputValidator;
import racingcar.view.View;

public class RacingController {
    private RacingGame racingGame;
    private final InputValidator inputValidator;

    public RacingController() {
        inputValidator = new InputValidator();
    }

    public void run() {
        gameSetting();
        gameStart();
        View.displayWinners(racingGame.selectWinners());
    }

    public void gameSetting(){
        String carNames = View.displayInputCarName();
        String[] names = inputValidator.createCarsFromUserInput(carNames);
        int round = View.displayTryCount();
        racingGame = new RacingGame(names, round);
    }

    private void gameStart(){
        View.displayResult();
        int round = racingGame.getRound();
        while (round-- > 0) {
            racingGame.move();
            View.displayMoveResult(racingGame.getCars());
        }
    }
}
