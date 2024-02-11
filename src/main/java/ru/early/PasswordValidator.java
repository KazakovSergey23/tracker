package ru.early;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static final String[] FORBIDDEN = {"qwerty", "12345", "password"};

    public static String validate(String password) {
        String specialChars = "[!@#$,.?!*&(){}']";
        Pattern pattern = Pattern.compile(specialChars);
        Matcher matcher = pattern.matcher(password);
        if (password == null) {
            throw new IllegalArgumentException("");
        }
        if ((password.length() < 8) && (password.length() > 32)) {
            throw new IllegalArgumentException("");
        }
        if (!password.toUpperCase().equals(password)) {
            throw new IllegalArgumentException("");
        }
        if (!password.toLowerCase().equals(password)) {
            throw new IllegalArgumentException("");
        }
        if (!matcher.matches()) {
            throw new IllegalArgumentException("");
        }
        if (password.equalsIgnoreCase("qwerty")
                || password.equalsIgnoreCase("password")
                || password.equalsIgnoreCase("12345")
                || password.equalsIgnoreCase("admin")
                || password.equalsIgnoreCase("user")) {
            throw new IllegalArgumentException("");
        }
        return password;
    }
}
