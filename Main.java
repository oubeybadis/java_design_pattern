import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter type");
        String type = scan.nextLine();

        Vec vec = VecFactory.create(type);
        vec.start();
        scan.close();
    }
}

class VecFactory {
    // private LinkedList<String> categoryies ;
    public static Vec create(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            case "truck":
                return new Truck();

            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
    // singletone
}