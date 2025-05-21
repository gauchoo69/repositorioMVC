public class Car {
    private String brand;
    private int speed;

    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int amount) {
        speed += amount;
    }

    public void decreaseSpeed(int amount) {
        speed = Math.max(0, speed - amount);
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", speed=" + speed + "}";
    }
}

