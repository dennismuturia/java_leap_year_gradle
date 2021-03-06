import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest{
  @Test
  public void isLeapYear_forDivisibleByFour_true(){
    LeapYear leapyear = new LeapYear();
    assertEquals(false, leapyear.isLeapYear(1999));
  }

  @Test
  public void isLeapYear_forDivisibleByHundred_true(){
    LeapYear leapyear = new LeapYear();
    assertEquals(false, leapyear.isLeapYear(1900));
  }

  @Test
  public void isLeapYear_forDivisibleByFourHundred_true(){
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(2000));
  }
}
