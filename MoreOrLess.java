import java.io.Console;

public class MoreOrLess {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter any number. Positive or negative.");
    String stringNumber = myConsole.readLine();
    Integer number = Integer.parseInt(stringNumber);

    if (number >= 0 ) {
      number += 1;
    } else {
      number -= 1;
    }

    System.out.println("The new number is " + number + ".");
  }
}
