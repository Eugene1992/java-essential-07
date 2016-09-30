package cw09;


public class NegativeAgeException extends Exception {
    private String message;

    public NegativeAgeException(String message) {
        super(message);
    }
}
