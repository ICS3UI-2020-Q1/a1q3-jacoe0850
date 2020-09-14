import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Asking for quantities 
    System.out.println("How many chromebook chargers?");
     int chargers = input.nextInt();
      System.out.println("How many motherboards?");
      int motherboards = input.nextInt();
      System.out.println("How many mice?");
      int mice = input.nextInt();
      // calculating basic subtotal
double subtotal = chargers*34.99+motherboards*127.50+mice*18.00;
// stating subtotal
System.out.println("Subtotal= $" + subtotal);
//stating and calculating taxes and total with taxes
System.out.println("Subtotal= $" + subtotal*0.13);
System.out.println("Subtotal= $" + subtotal*1.13);
  }
}
