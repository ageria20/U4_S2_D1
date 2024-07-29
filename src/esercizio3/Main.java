package esercizio3;

import exceptions.BancaException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContoCorrente cc = new ContoCorrente("Andrea", 50); //magari
        ContoOnLine ccOn = new ContoOnLine("Andrea", 50, 50);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto vorresti prelevare?");
        double prelievo = scanner.nextDouble();
        try {
            ccOn.preleva(prelievo);
            System.out.println(ccOn);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }


        try {
            cc.preleva(prelievo);
            System.out.println(cc);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println(cc);


    }
}
