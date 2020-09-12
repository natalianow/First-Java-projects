package pl.sdacademy;

public class Car {
    int speed = 0; // atrybut klasy/pole klasy

    public void increase(int value) {
        speed = speed + value;
    }

    public void decrease(int value) {
        speed = speed - value;
    }
    public void  stop() {
        speed = 0;
    }

    public void showCurrentSpeed() {
        System.out.println("Aktualna prędkośc samochodu");
        System.out.println(speed);
    }
}
