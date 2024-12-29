package app;

import app.model.AbstractEntity;
import app.model.User;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("Welcome to Java ExpressionRepo");
        System.out.println("Version 1.0.1");
      
        int a = 10;
        int b = 100;
        int c = 5;
        System.out.println(sum(a, b) / c);
        int d = divide(a, b);
        System.out.println(d);
      
        User user = new User("Billy", 24);
        AbstractEntity abstractEntity = new User("Roy", 42);
        abstractEntity.setPlanet("Earth");
        abstractEntity.setType("Human");
        System.out.println(abstractEntity);
        System.out.println(user);
     }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        return a > b ? a / b : b / a;
    }
}
