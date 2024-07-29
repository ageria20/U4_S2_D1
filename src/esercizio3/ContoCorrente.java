package esercizio3;


import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private Logger logger = LoggerFactory.getLogger(Main.class);
    private int nMovimenti;
    private String titolare;
    private int Movimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {

        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
            if (saldo < 0) {
                throw new BancaException("Il saldo e' in rosso");
            }
        } else saldo = saldo - x - 0.50;

//            throw new BancaException("Il Saldo e' in rosso!!!");

        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    @Override
    public String toString() {
        return "ContoCorrente: " +
                "maxMovimenti=" + maxMovimenti +
                ", nMovimenti=" + nMovimenti +
                ", titolare='" + titolare + '\'' +
                ", Movimenti=" + Movimenti +
                ", saldo=" + saldo;
    }
}


