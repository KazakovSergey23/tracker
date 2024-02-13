package ru.early;

import static java.lang.Character.*;

public class PasswordValidator {
    public static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be lenght [8, 32]");
        }
        boolean numberLower = false;
        boolean numberUpper = false;
        boolean numberSpec = false;
        boolean numberInt = false;
        char[] str = password.toCharArray();
        for (char character : str) {
            if (isUpperCase(character)) {
                numberUpper = true;
            }
            if (isLowerCase(character)) {
                numberLower = true;
            }
            if (isDigit(character)) {
                numberInt = true;
            }
            if (!isLetterOrDigit(character) && !isWhitespace(character)) {
                numberSpec = true;
            }
            if (isLowerCase(character)) {
                numberLower = true;
            }
            if (isDigit(character)) {
                numberInt = true;
            }
            if (!isLetterOrDigit(character) && !isWhitespace(character)) {
                numberSpec = true;
            }
            if (numberUpper && numberLower && numberSpec && numberInt) {
                break;
            }
        }
        if (!numberUpper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");

        }
        if (!numberLower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");

        }
        if (!numberInt) {
            throw new IllegalArgumentException("Password should contain at least one figure");

        }
        if (!numberSpec) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String lowerPass = password.toLowerCase();
        for (String string : FORBIDDEN) {
            if (lowerPass.contains(string)) {
                    throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}