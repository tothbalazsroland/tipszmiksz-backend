package hu.codecool.advanced.tipszmiksz.customExceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String exception) {
        super(exception);
    }

}
