package esercizio3;

import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoOnLine extends ContoCorrente {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        String maxMovimenti = "";
        System.out.println("Titolare:" + getTitolare() + " - Saldo: " + restituisciSaldo() + " - Num movimenti: " + getnMovimenti()
                + "- Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile:" + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {

        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non e' disponibile, puoi prelevare massimo " + maxPrelievo);
        } else if (x <= maxPrelievo) {
            super.preleva(x);
        }


    }

    @Override
    public String toString() {
        return "ContoOnLine" +
                "maxPrelievo=" + maxPrelievo;
    }
}

