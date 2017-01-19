package tv.lycam.exception;

/**
 * Created by lycamandroid on 17/1/19.
 */
public class LycamPlusException extends Exception {

    public LycamPlusException() {}


    public LycamPlusException(Exception e) {
        super(e);
    }

    public LycamPlusException(String message) {
        super(message);
    }

    public LycamPlusException(String message, Throwable cause) {
        super(message, cause);
    }

}
