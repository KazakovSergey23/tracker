package ru.ex;

import java.util.Objects;

public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUserName() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return valid == user.valid && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, valid);
    }
}
