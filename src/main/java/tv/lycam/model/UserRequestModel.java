package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/18.
 */
public class UserRequestModel implements Serializable {


    private String username;
    private String password;
    private String email;
    private String phone;
    private String description;
    private String displayName;


    public UserRequestModel() {}

    public UserRequestModel(String username, String password, String email, String phone, String description, String displayName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


}
