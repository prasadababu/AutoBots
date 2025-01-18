
// Interface with a default method
interface Vehicle {
    default void start() {
        System.out.println("Vehicle started.");
    }
}

// Class implementing the Vehicle interface
class Car implements Vehicle {
    // No need to implement start() since it's a default method
}

// Usages
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Vehicle started.
    }
}
