package lab3.ex2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String name;
        name = "Learn Java by Example";
        System.out.println(name.length());
        System.out.println(name.equals("learn"));
        System.out.println(name.equals("Learn Java by Example"));
        System.out.println(name.equalsIgnoreCase("learn java BY EXAMPLE"));
        String[] names = name.split(" ");
        System.out.println(Arrays.toString(names));
    }
}
