package ru.early;

import static java.lang.Character.*;

public class PasswordValidator {
    public static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        boolean numberLower = false;
        boolean numberUpper = false;
        boolean numberSpec = false;
        boolean numberInt = false;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        char[] str = password.toCharArray();
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be lenght [8, 32]");
        }
        for (char character : str) {
            if (isUpperCase(character)) {
                numberUpper = true;
            }
            if (isLowerCase(character)) {
                numberLower = true;
            }
        }
        if (!numberUpper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");

        }
        if (!numberLower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");

        }
        for (char character : str) {
            if (isDigit(character)) {
                numberInt = true;
            }
        }
        if (!numberInt) {
            throw new IllegalArgumentException("Password should contain at least one figure");

        }
        for (char character : str) {
            if (!isDigit(character) && !isWhitespace(character) && !isLetter(character)) {
                numberSpec = true;
            }
        }
        if (!numberSpec) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String string : FORBIDDEN) {
            if (password.toLowerCase().contains(string)) {
                    throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
