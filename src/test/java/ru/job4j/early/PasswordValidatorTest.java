package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordValidatorTest {

    @Test
    public void whenExceptionPswdNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("Пустой пароль");
    }

    @Test
    public void whenExceptionPswdShortOrLong() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("Adams");
                });
        assertThat(exception.getMessage()).isEqualTo("Длина пароля должна находится в диапазоне [8, 32]");
    }

    @Test
    public void whenExceptionPswdIsContainsUpperCaseChar() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("george washington");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы один символ в верхнем регистре");
    }

    @Test
    public void whenExceptionPswdIsContainsLowerCaseChar() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("SUPER123");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы один символ в нижнем регистре");
    }

    @Test
    public void whenExceptionPswdIsContainsDigitChar() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("wtTFGHnbvgj");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы одну цифру");
    }

    @Test
    public void whenExceptionPswdIsContainsSpecialChar() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("wtTFGH234nbvgj");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль должен содержать хотя бы один специальный символ");
    }

    @Test
    public void whenExceptionPswdIsContainsSubstring() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("qwerty!wtTFGH234nbvgj");
                });
        assertThat(exception.getMessage()).isEqualTo("Пароль не должен содержать подстроки: qwerty, 12345, password, admin, user");
    }
}