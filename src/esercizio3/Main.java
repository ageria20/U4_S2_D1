package esercizio3;

import exceptions.BancaException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BancaException {

        ContoCorrente cc = new ContoCorrente("Andrea", 1000000); //magari
        ContoOnLine ccOn = new ContoOnLine("Andrea", 1000000, 50);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto vorresti prelevare?");
        double prelievo = scanner.nextDouble();
        ccOn.preleva(prelievo);
        System.out.println(cc);
        System.out.println(ccOn);


    }
}
