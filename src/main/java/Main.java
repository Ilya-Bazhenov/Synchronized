public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("right");
        Car car2 = new Car("left");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        thread1.start();
        thread2.start();
    }
}
