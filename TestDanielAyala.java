import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestDanielAyala {

  @Test
  public void demoTestMethod() {
    DanielAyala instance = new DanielAyala();
    assertTrue(instance.getFullName().equals("Daniel Ayala"));
  }
}