import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {

        CarGame carGame = new CarGame();

        System.out.println("경주할 자동차 이름을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        Car[] cars = carGame.splitCarName(str);

        System.out.println("시도할 횟수는 몇회인가요?");
        sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(carGame.RacingCar(cars, num));

    }
}
