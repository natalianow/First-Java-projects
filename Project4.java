package pl.sdacademy;

import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value1;
        float value2;
        float value3;

        System.out.println("Podaj Liczbę 1: ");
        value1 = scanner.nextFloat();
        System.out.println("Podaj Liczbę 2: ");
        value2 = scanner.nextFloat();
        System.out.println("Podaj Liczbę 3: ");
        value3 = scanner.nextFloat();

        float sum = value1 + value2 + value3;
        float avg = sum/3;
        System.out.print("Suma: ");
        System.out.println(sum);

        System.out.print("Srednia: ");
        System.out.println(avg);
    }
}
