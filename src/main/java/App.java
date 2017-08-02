import java.io.Console;

public class App{
  public static void main(String []args){
    Console myConsole = System.console();
    System.out.println("Enter the year you wanna test to seeif its a leap year");
    String myYear = myConsole.readLine();

    int theYear = Integer.parseInt(myYear);

    LeapYear leapyear = new LeapYear();
    boolean leapyearResult = leapyear.isLeapYear(theYear);

    System.out.println("Is that a leap year? " +leapyearResult);
  }
}
