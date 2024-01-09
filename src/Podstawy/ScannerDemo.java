package Podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        int numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj średnią z obiektówki: ");
        double average = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj swoje imię: ");
        String name = klawiatura.nextLine();

        System.out.println("Twój numer buta: " + numerButa +
                ", średnia: " + average + ", imię: " + name);
    }
}
