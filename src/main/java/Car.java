public class Car implements Comparable<Car> {

    public String carName;
    public int locationNum;

    public Car(String carName, int locationNum){
        this.carName = carName;
        this.locationNum = locationNum;
    }


    @Override
    public int compareTo(Car car) {
        return (this.locationNum - car.locationNum);
    }
}
