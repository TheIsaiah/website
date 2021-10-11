package me.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String str = "Good bye!";
        System.out.println(str);

        str = "String changed!";
        System.out.println(str);

        for (int i = 0; i < 3; i++) {
            System.out.println("This is a loop!");
        }

        String[] arr = {"Array0", "Array1"};
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.print("Array Length: ");
        System.out.println(arr.length);
        System.out.print("String Length: ");
        System.out.println("Hello".length());
        System.err.println("This is an error!");

        if (str.contains("changed")) {
            System.out.println("CONTAINS!");
        }

        test();
        only_test();

        File fi = new File("data.txt");
        List<String> szz = Files.readAllLines(fi.toPath());
        System.out.println(szz);
    }

    // @Deprecated
    public static void test() {
        System.out.println("Deprecated function");
    }

    /**
     * This is a comment
     */
    public static void only_test() {
        // J2V OFF
        System.out.println("This will only print in Java!");
        // J2V ON
        // V println("This will only print in V!")
    }

}