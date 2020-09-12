package pl.sdacademy;

public class Project16 {
    public static void main(String[] args) {
        Car opel = new Car();
        Car fiat = new Car();
        Car ferrari = new Car();

        System.out.println("Opel:");
        opel.increase(30);
        opel.increase(20);
        opel.showCurrentSpeed();
        opel.increase(85);
        opel.showCurrentSpeed();

        System.out.println("Fiat:");
        fiat.increase(80);
        fiat.decrease(30);
        fiat.showCurrentSpeed();

        System.out.println("Ferrari");
        ferrari.increase(300);
        ferrari.showCurrentSpeed();
        ferrari.stop();
        ferrari.showCurrentSpeed();

    }
}
