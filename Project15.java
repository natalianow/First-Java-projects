package pl.sdacademy;

public class Project15 {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println("1+2="+myCalculator.add(1,2));
        System.out.println("1+2="+myCalculator.substract(1,2));
        System.out.println("7+3="+myCalculator.multiply(7,3));
        System.out.println("1+2="+myCalculator.divide(1,2));
        System.out.println("1+2="+myCalculator.divide(1,2));
        System.out.println("1+2="+myCalculator.module(1,2));
    }
}
