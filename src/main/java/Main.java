public class Main {
    public static void main(String[] args) {
        int carsCount = 5;

        Thread[] threads = new Thread[carsCount];
        for (int i = 0; i < carsCount; i++) {
            threads[i] = new Thread(new Car(
                    (Math.random() < 0.5) ? "right" : "left"
                )
            );
        }

        for (int i = 0; i < carsCount; i++) {
            threads[i].start();
        }
    }
}
