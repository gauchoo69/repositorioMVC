import java.util.List;

public class CarView {
    public void showCarList(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

