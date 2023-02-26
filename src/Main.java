public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Renault Duster", 2014, 640000, "Желтый", 102);
        car1.getInfo();
        car1.start();
        car1.road("Миасс");
        car1.stop();
        car1.road("Миасс");

        Car car2 = new Car("Toyota Land Cruiser 200", 2008, 2200000, "Черный", 235);
        car2.getInfo();
        car2.start();
        car2.road("Киров");
        car2.stop();
        car2.road("Киров");

        car1.yearEquals(car2);
        car2.powerEquals(car1);

    }
}