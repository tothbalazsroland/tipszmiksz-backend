package hu.codecool.advanced.tipszmiksz.customExceptions;

public class EmailAlreadyExistException extends RuntimeException {

    public EmailAlreadyExistException(String exception) {
        super(exception);
    }

}
