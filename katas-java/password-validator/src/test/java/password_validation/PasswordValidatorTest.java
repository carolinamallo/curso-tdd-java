package password_validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

  @Test
  public void check_password_is_valid() {
    String password = "123456Ab_";

    boolean validation = PasswordValidator.isValid(password);

    assertTrue(validation);
  }

  @Test
  public void check_password_is_greater_than_8_characters() {
    String invalidPassword = "23456Ab_";

    boolean validation = PasswordValidator.isValid(invalidPassword);

    assertFalse(validation);
  }

  @Test
  public void check_password_not_contains_at_least_1_capital_letter() {
    String invalidPassword = "234567ab_";

    boolean validation = PasswordValidator.isValid(invalidPassword);

    assertFalse(validation);
  }

  @Test
  public void check_password_not_contains_at_least_1_lowercase() {
    String invalidPassword = "234567AB_";

    boolean validation = PasswordValidator.isValid(invalidPassword);

    assertFalse(validation);
  }

  @Test
  public void check_password_not_contains_at_least_1_number() {
    String invalidPassword = "abcdefAB_";

    boolean validation = PasswordValidator.isValid(invalidPassword);

    assertFalse(validation);
  }

  @Test
  public void check_password_not_contains_at_least_1_underscore() {
    String invalidPassword = "234567aBC";

    boolean validation = PasswordValidator.isValid(invalidPassword);

    assertFalse(validation);
  }

}
