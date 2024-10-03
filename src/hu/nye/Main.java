package hu.nye;

import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner be = new Scanner(System.in);

        System.out.println("Kérek egy számot: ");
        int szamegy = be.nextInt();

        System.out.println("Kérek egy másik számot: ");
        int szamketto = be.nextInt();

        // Előbb egy üres nextLine() a maradék újsor karakter eldobására
        be.nextLine();

        System.out.println("Adj meg egy műveleti operátort: ");
        char karakter = be.nextLine().charAt(0);

        switch (karakter) {
            case '+' -> System.out.println("Eredmény: " + (szamegy + szamketto));
            case '-' -> System.out.println("Eredmény: " + (szamegy - szamketto));
            case '*' -> System.out.println("Eredmény: " + (szamegy * szamketto));
            case '/' -> System.out.println("Eredmény: " + (szamegy / szamketto));
            default -> System.out.println("Érvénytelen operátor!");
        }

        be.close(); // Zárd le a Scannert a program végén!
    }
}
