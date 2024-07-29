package exceptions;

public class NumLessThenZero extends RuntimeException {
    public NumLessThenZero(int num) {
        super("Il numero inserito non e' corretto, non si puo' dividero per 0!!!");
    }
}
