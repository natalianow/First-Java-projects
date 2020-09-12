package pl.sdacademy;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        byte age = scanner.nextByte();
        System.out.println("Czy jesteś studentem?: ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Podaj formę zatrudnienia (D/E): ");
        char employmentForm = scanner.next().charAt(0);


        System.out.println("################");
        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Last name: ");
        System.out.println(lastName);
        System.out.print("Age: ");
        System.out.println(age);
        System.out.print("isStudent: ");
        System.out.println(isStudent);
        System.out.print("Employment form: ");
        System.out.println(employmentForm);
        System.out.println("##################");

    }
}