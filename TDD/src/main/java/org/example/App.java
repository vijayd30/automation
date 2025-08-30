package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isValidUserName(String name) {
        if (name.contains("-")||(name.contains(" ")) ||(name.contains("_"))) {
            return false;
        }
        return true;
    }
}
