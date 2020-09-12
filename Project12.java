package pl.sdacademy;

import java.util.Scanner;

public class Project12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilu wygenerowanych uzytkowników potrzebujesz: ");
        int numberOfUsers = scanner.nextInt();
        int counter = 1;

        while (counter <= numberOfUsers) {
            System.out.println("Użytkownik " + counter++);
        }
    }
}
