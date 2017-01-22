package tv.lycam.exception;

/**
 * Created by lycamandroid on 17/1/19.
 */
public class LycamPlusException extends Exception {

    public LycamPlusException(int code, String message) {
        super("LycamPlus Exception: code=" + code + ", msg:" + message);
    }

}
