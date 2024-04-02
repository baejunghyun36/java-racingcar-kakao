package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.InputValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    private RacingGame racingGame;
    private final InputValidator inputValidator;

    public RacingController() {
        inputValidator = new InputValidator();
    }

    public void run() {
        gameSetting();
        gameStart();
    }

    public void gameSetting(){
        String carNames = InputView.readCarName();
        String[] names = inputValidator.createCarsFromUserInput(carNames);
        int round = InputView.readTryCount();
        racingGame = new RacingGame(names, round);
    }

    private void gameStart(){
        OutputView.displayResult();
        int round = racingGame.getRound();
        while (round-- > 0) {
            racingGame.move();
            OutputView.displayMoveResult(racingGame.extractCarInfos());
        }
        OutputView.displayWinners(racingGame.selectWinners());
    }
}
