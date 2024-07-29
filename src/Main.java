import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        Random random = new Random();
        int[] myArr = new int[5];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(1, 10);
        }
        System.out.println("Before " + Arrays.toString(myArr));
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Inserisci un numero da 1 a 5 per scegliere la posizione, e 0 per uscire");
            int index = scanner.nextInt();
            if (index == 0) break;
            else {
                switch (index) {
                    case 1:
                        System.out.println("che numero vuoi inserire nella posizione 0?");
                        int choosenNum = scanner.nextInt();
                        myArr[index - 1] = choosenNum;
                        System.out.println("After " + Arrays.toString(myArr));

                        break;
                    case 2:
                        System.out.println("che numero vuoi inserire nella posizione 1?");
                        choosenNum = scanner.nextInt();
                        myArr[index - 1] = choosenNum;
                        System.out.println("After " + Arrays.toString(myArr));
                        break;
                    case 3:
                        System.out.println("che numero vuoi inserire nella posizione 2?");
                        choosenNum = scanner.nextInt();
                        myArr[index - 1] = choosenNum;
                        System.out.println("After " + Arrays.toString(myArr));
                        break;
                    case 4:
                        System.out.println("che numero vuoi inserire nella posizione 3?");
                        choosenNum = scanner.nextInt();
                        myArr[index - 1] = choosenNum;
                        System.out.println("After " + Arrays.toString(myArr));
                        break;
                    case 5:
                        System.out.println("che numero vuoi inserire nella posizione 4?");
                        choosenNum = scanner.nextInt();
                        myArr[index - 1] = choosenNum;
                        System.out.println("After " + Arrays.toString(myArr));
                        break;
                    default:
                        System.out.println("Inserisci il numero richiesto");
                        break;
                }
            }
            logger.info(Arrays.toString(myArr));
            logger.error(Arrays.toString(myArr));
        }

    }
}