import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestDanielAyala {
  
  @Test
  public void fullNameTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals("Daniel Ayala", instance.getFullName());
  }

  @Test
  public void firstNameTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals("Daniel", instance.getFirstName());
  }

  @Test
  public void lastNameTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals("Ayala", instance.getLastName());
  }

  @Test
  public void UCInetIDTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals("djayala1", instance.getUCInetID());
  }

  @Test
  public void studentNumberTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals(28399460, instance.getStudentNumber());
  }

  @Test
  public void positiveRotatedFullNameTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals("niel AyalaDa", instance.getRotatedFullName(14));
  }

  @Test
  public void negativeRotatedFullNameTest() {
    DanielAyala instance = new DanielAyala();
    assertEquals("AyalaDaniel ", instance.getRotatedFullName(-17));
  }

}