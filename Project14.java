package pl.sdacademy;

import java.util.Scanner;

public class Project14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj maksymalna liczbe:");
        int maxValue = scanner.nextInt();
        int counter = 0;

        while(counter <= maxValue){
            System.out.print("Liczba: " + counter);
            if(counter++ % 2 == 0) {
                System.out.println("jest parzysta");
            } else {
                System.out.println("jest nieparzysta");
            }
        }
    }
}
