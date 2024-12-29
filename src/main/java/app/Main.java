package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Alternate Expressions");
        System.out.println("Version 1.0.1");

        int a = 10;
        int b = 100;
        int c = 5;
        System.out.println(sum(a, b) / c);
        int d = divide(a, b);
        System.out.println(d);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
    return a > b ? a / b : b / a;
    }
}
