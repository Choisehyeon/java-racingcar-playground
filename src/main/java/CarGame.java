

import java.util.ArrayList;
import java.util.Arrays;

public class CarGame {

    public Car[] splitCarName(String str) {
        int startLocation = 1;
        String[] carName  = str.split(",");
        Car[] cars = new Car[carName.length];
        for(int i = 0; i < carName.length; i++) {
            cars[i] = new Car(carName[i],startLocation);
        }
        return cars;
    }

    public String RacingCar(Car[] cars, int runNum)
    {
        ViewCarRace(cars);
        System.out.println();

        for(int i = 0; i < runNum; i++) {
            int num = (int)(Math.random() * 3);
            cars[num].locationNum++;
            ViewCarRace(cars);
            System.out.println();
        }

        String str = String.join(",", compareWinner(cars));

        return str + "가 최종 우승했습니다.";
    }

    public void ViewCarRace(Car[] cars) {
        for(int i = 0; i < cars.length; i++) {
            String result = String.format("%0" + cars[i].locationNum + "d", 0).replace("0", "_");
            System.out.println(cars[i].carName + " : " + result);
        }
    }

    public ArrayList<String> compareWinner(Car[] cars) {
        ArrayList<String> winnerList = new ArrayList<>();
        Arrays.sort(cars);
        int num = cars[cars.length-1].locationNum;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i].locationNum == num) {
                winnerList.add(cars[i].carName);
            }
        }
        return winnerList;

    }
}
