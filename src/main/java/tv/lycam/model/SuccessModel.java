package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by chapin on 17/1/19.
 */
public class SuccessModel implements Serializable {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "SuccessModel{" +
                "success=" + success +
                '}';
    }
}
