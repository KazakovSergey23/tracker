package ru.early;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.early.PasswordValidator.validate;

public class PasswordValidatorTest {
    @Test
    void whenPasswordValid() {
        String password = "Ln2$mrTY12";
        String expected = "Ln2$mrTY12";
        String result = validate(password);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenPasswordIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(null));
        String expected = "Password can't be null";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordLenghtLess8() {
        String password = "Ln2$mrT";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password should be lenght [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordLenghtMore32() {
        String password = "Ln2$mrTY3245nMdsdfdfpppg$#dg124531";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password should be lenght [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordNotContainUpperCaseLetter() {
        String password = "ln2$mrty12";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password should contain at least one uppercase letter";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordNotContainLowerCaseLetter() {
        String password = "LN2$MRTY12";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password should contain at least one lowercase letter";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordNotContainFigure() {
        String password = "LnI$mrTYUo";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password should contain at least one figure";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordNotContainSpecialSymbol() {
        String password = "Ln2pmrTY12";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password should contain at least one special symbol";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordContainSubstrQWERTY() {
        String password = "Ln2$mrTY12QWerty12";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordContainSubstr12345() {
        String password = "Ln2$mrTY12345";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordContainSubstrAdmin() {
        String password = "Ln2$mrTY12adMin12";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordContainSubstrUser() {
        String password = "Ln2$mrTY12User12";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validate(password));
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }
}
