public class Car implements Runnable {
    private static int id = 0;

    private int curId;
    private String position;

    public Car(String position) {
        curId = id++;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    private void changePosition() {
        position = (position.equals("right")) ? "left" : "right";
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            Bridge.moveToTheBridge(this);

            Bridge.moveOnTheBridge(this);
            Bridge.moveOverTheBridge(this);
            Bridge.moveFromTheBridge(this);

            Bridge.moveOffTheBridge(this);

            if (i != 1) {
                try {
                    Thread.sleep(((int) (Math.random() * 10)) * 1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                changePosition();
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Автомобиль %d", curId);
    }
}
