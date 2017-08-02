import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest{
  @Test
  public isLeapYear_forNumberDIvisbleByFour_true{
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(2012));
  }
}
