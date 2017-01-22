package tv.lycam.enumeration;

/**
 * Created by lycamandroid on 17/1/22.
 */
public enum Sort {

    ID("id"), DESCRIPTION("description"), CREATED("created");

    private Sort(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
