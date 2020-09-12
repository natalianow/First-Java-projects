package pl.sdacademy;

import java.util.Scanner;

public class Project10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator BMI");
        System.out.println("Podaj swoją wagę");
        float weight = scanner.nextFloat();
        System.out.println("Podaj swój wzrost[m]");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);
        System.out.println("BMI:");
        System.out.println(bmi);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else if( bmi > 24.9) {
            System.out.println("Nadwaga!");
        } else {
            System.out.println("Niedowaga");
        }
    }
}

