import java.util.ArrayList;
import java.util.List;

public class CarController {
    private List<Car> cars = new ArrayList<>();
    private CarView view = new CarView();

    public void createCar(String brand) {
        Car car = new Car(brand);
        cars.add(car);
        view.showMessage("Car created: " + brand);
    }

    public void increaseSpeed(int index, int amount) {
        if (isValidIndex(index)) {
            cars.get(index).increaseSpeed(amount);
            view.showMessage("Speed increased.");
        }
    }

    public void decreaseSpeed(int index, int amount) {
        if (isValidIndex(index)) {
            cars.get(index).decreaseSpeed(amount);
            view.showMessage("Speed decreased.");
        }
    }

    public void showCars() {
        view.showCarList(cars);
    }

    private boolean isValidIndex(int index) {
        if (index < 0 || index >= cars.size()) {
            view.showMessage("Invalid index.");
            return false;
        }
        return true;
    }
}

