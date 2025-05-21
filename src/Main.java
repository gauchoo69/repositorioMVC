import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarController controller = new CarController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Crear coche");
            System.out.println("2. Aumentar velocidad");
            System.out.println("3. Disminuir velocidad");
            System.out.println("4. Mostrar coches");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Introduce marca: ");
                    scanner.nextLine(); // Consume newline
                    String brand = scanner.nextLine();
                    controller.createCar(brand);
                    break;
                case 2:
                    System.out.print("Índice del coche: ");
                    int idxUp = scanner.nextInt();
                    System.out.print("Cantidad a aumentar: ");
                    int inc = scanner.nextInt();
                    controller.increaseSpeed(idxUp, inc);
                    break;
                case 3:
                    System.out.print("Índice del coche: ");
                    int idxDown = scanner.nextInt();
                    System.out.print("Cantidad a disminuir: ");
                    int dec = scanner.nextInt();
                    controller.decreaseSpeed(idxDown, dec);
                    break;
                case 4:
                    controller.showCars();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
