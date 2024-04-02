package racingcar.view;

import dto.CarResponse;
import java.util.List;
import static java.util.stream.Collectors.joining;

public class OutputView {
    public static void displayResult() {
        System.out.println("실행 결과");
    }

    public static void displayMoveResult(List<CarResponse> carResponses) {
        for (CarResponse carResponse: carResponses) {
            System.out.print(carResponse.getName() + " : " );
            displayMoveDistance(carResponse.getPosition());
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMoveDistance (int position){
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
    }

    public static void displayWinners(List<String> winners) {
        String result = winners.stream()
                .collect(joining(", ", "", "가 최종 우승했습니다."));

        System.out.println(result);
    }
}
