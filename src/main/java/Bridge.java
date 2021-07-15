public final class Bridge {
    private Bridge() { }

    public static void moveToTheBridge(Car car) {
        String info = String.format("%s подъехал к мосту %s", car,
                (car.getPosition().equals("right")) ? "справа" : "слева"
        );
        System.out.println(info);
    }

    public static void moveOnTheBridge(Car car) {
        String info = String.format("%s заехал на мост %s", car,
                (car.getPosition().equals("right")) ? "справа" : "слева"
        );
        System.out.println(info);
    }

    public static void moveOverTheBridge(Car car) {
        String info = String.format("%s едет по мосту %s на%s", car,
                (car.getPosition().equals("right")) ? "справа" : "слева",
                (car.getPosition().equals("right")) ? "лево" : "право"
        );
        System.out.println(info);
    }

    public static void moveFromTheBridge(Car car) {
        String info = String.format("%s съехал с моста %s", car,
                (car.getPosition().equals("right")) ? "слева" : "справа"
        );
        System.out.println(info);
    }

    public static void moveOffTheBridge(Car car) {
        String info = String.format("%s отъехал от моста %s", car,
                (car.getPosition().equals("right")) ? "слева" : "справа"
        );
        System.out.println(info);
    }
}
