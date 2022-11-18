package datastructures.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class bracketsTest {
  @Test
  public void multiBracketValidation() {
    assertTrue(brackets.bracketVal("[hello there]"));
  }

  @Test
  public void multiBracketValidation2() {
    assertTrue(brackets.bracketVal("[[{}]]"));
  }

  @Test
  public void multiBracketValidation3() {
    assertFalse(brackets.bracketVal("[({}]"));
  }

  @Test
  public void multiBracketValidation4() {
    assertFalse(brackets.bracketVal("["));
  }

  @Test
  public void multiBracketValidation5() {
    assertFalse(brackets.bracketVal("}"));
  }

  @Test
  public void multiBracketValidation6() {
    assertTrue(brackets.bracketVal("()[[eeeep]]()"));
  }

  @Test
  public void multiBracketValidation7() {
    assertFalse(brackets.bracketVal("{(})"));
  }

}
