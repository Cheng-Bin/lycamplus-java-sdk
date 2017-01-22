package tv.lycam.enumeration;

/**
 * Created by lycamandroid on 17/1/22.
 */
public enum Order {

    DESC("desc"), ASC("asc");

    private Order(String value) {
        this.value = value;
    }
    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
