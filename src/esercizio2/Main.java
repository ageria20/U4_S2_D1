package esercizio2;

import exceptions.NumLessThenZero;
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
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new NumLessThenZero(lt);
//            logger.error("Hai inserito dei dati errati " + e.getMessage());
        }

    }


}
