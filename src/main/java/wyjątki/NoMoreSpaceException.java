package wyjątki;

public class NoMoreSpaceException extends Exception {
    public NoMoreSpaceException(String message) {
        super(message);
    }
}
