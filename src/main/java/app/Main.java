package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java ExpressionRepo");
        System.out.println("Version 1.0.0");
        description();

        int a = 56;
        int b = 8;
        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void description() {
        System.out.println("This code is to implement and improve " +
                "skills of using GitHub instruments and concepts.");
    }
}
