/**
 * Кто не доделал - задания на семинаре:
 * 1)
 * Напишите класс Car.
 * В классе должна храниться следующая информация:
 * название автомобиля - model;
 * год выпуска - year;
 * стоимость - price;
 * цвет - color;
 * объем двигателя - power.
 */
public class Car {
    /**
     * Кто не доделал - задания на семинаре:
     * 1)
     * Напишите класс Car.
     * В классе должна храниться следующая информация:
     * название автомобиля - model;
     * год выпуска - year;
     * стоимость - price;
     * цвет - color;
     * объем двигателя - power.
     */
    String model;
    int year;
    double price;
    String color;
    int power;
    private boolean status;


    Car(String model, int year, double price, String color, int power){
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
    }

    /**
     * 3) Доработайте класс Car.
     * В классе должна храниться следующая информация:
     * Свойство - которое говорит заведен авто или нет
     */
    /**
     * Метод - запуска автомобиля
     */
    public void start(){
        status = true;
        System.out.println("Автомобиль заведен.");
    }

    /**
     * Метод - остановки автомобиля
     */
    public void stop(){
        status = false;
        System.out.println("Автомобиль остановлен.");
    }

    /**
     * Метод дороги - при вызове, в качестве аргумента передаем место назначения
     * И если авто заведён - выводим, что мы на такой-то авто едем место назначения
     * Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
     * @param city
     */
    public void road(String city){
        if(status == true){
            System.out.println("Мы на автомобиле " + model + " едем в город " + city);
        } else {
            System.out.println("Авто не заведено. И мы не можем ехать.");
        }
    }

    /**
     * 2) Доработайте класс Car.
     * Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта
     * класса model , power и year.
     */
    public void getInfo(){
        System.out.println(model + ", " + power + " л.с., " + year + "г.");
    }

    /**
     * Доработайте программу в свободном стиле.
     * Можно сравнить 2 автомобиля между собой
     * @param car
     */
    public void yearEquals(Car car) {
        if (this.year == car.year) {
            System.out.println(String.format("Автомобили %s и %s одного года выпуска", this.model, car.model));
        }
        else if (this.year > car.year){
            System.out.println(String.format("Автомобиль %s новее автомобиля %s", this.model, car.model));
        }
        else {
            System.out.println(String.format("Автомобиль %s старее автомобиля %s", this.model, car.model));
        }
    }
    public void powerEquals(Car car) {
        if (this.power == car.power) {
            System.out.println(String.format("Автомобили %s и %s одинаковой мощности", this.model, car.model));
        }
        else if (this.power > car.power){
            System.out.println(String.format("Автомобиль %s мощнее автомобиля %s", this.model, car.model));
        }
        else {
            System.out.println(String.format("Автомобиль %s мощнее автомобиля %s", car.model, this.model));
        }
    }
}
