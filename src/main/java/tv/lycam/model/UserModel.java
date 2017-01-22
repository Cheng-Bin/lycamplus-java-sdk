package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by chapin on 17/1/19.
 */
public class UserModel implements Serializable {

    private String id;
    private String username;
    private String clientId;
    private String uuid;
    private boolean active;
    private boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", clientId='" + clientId + '\'' +
                ", uuid='" + uuid + '\'' +
                ", active=" + active +
                ", deleted=" + deleted +
                '}';
    }
}
