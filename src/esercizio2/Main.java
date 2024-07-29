package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("Quanti KM hai fatto?");

        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        System.out.println("Quanti LT hai consumato?");
        int lt = scanner.nextInt();


        try {
            logger.info("KM / LT: " + km / lt);
        } catch (ArithmeticException e) {
            logger.error(e.getMessage());
            System.out.println("I litri consumati non possono essere 0");

//            logger.error("Hai inserito dei dati errati " + e.getMessage());
        }

    }


}
