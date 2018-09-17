import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        Dog d = new Dog("Max", 3);

        d.bark();

        int dogYears = d.getDogYears();
        System.out.print(dogYears + " dog years.");

        d.toy();
        d.toy();
        d.toy();
        d.toy();

    }

    }
