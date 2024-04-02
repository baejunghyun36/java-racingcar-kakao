package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readTryCount (){
        System.out.print("시도할 회수는 몇회인가요?");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String readCarName (){
        System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }
}
