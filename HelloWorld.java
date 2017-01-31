package helloworld;

/*byte integers not exceed the range -128 and 127 
short  2 bytes of storage range -32768 to 32767
int    4 bytes of storage range -2147483648 to 2147483647
long   8 bytes -2^63 to 2^63
float  4 bytes -3.40282347^38 x 10^28 to 3.40282347^38 x 10^28  
            7 digits of precision
double 8  -1.7976931348623157 x 10^308 to 1.7976931348623157 x 10^308
           15 digits of precision
char   2 bytes  Unicode characters such as 'A' '%'
boolean  true or false
x = x + 1 same as x++
int myLength = "Hello World".length() myLength is 11
String name  = "Hello World.toUpperCase()  name is HELLO World
String result = "Hello World".substring(0,6)
*/
import java.util.Scanner;
public class HelloWorld {
   int x;
   
   public static void main(String[] args) {
      String message = "Hello World";
      // x = x + 1 same as x++
      // Prints "Hello, World" in the terminal window.
        
      Scanner input = new Scanner (System.in);
      
      System.out.print("Enter an integer: ");
      int myInt = input.nextInt();
      System.out.printf("You Entered %d.%n%n", myInt);
      
      
      String result = message.substring (0,6);
      String uCase = message.toUpperCase();
      System.out.println("Hello, World");
      System.out.println(result);
      System.out.println(uCase);
   }
}