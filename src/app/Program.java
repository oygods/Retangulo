package app;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        System.out.println(retangulo);
    }
}
