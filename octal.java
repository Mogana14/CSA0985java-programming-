import java.util.Scanner;
class octal {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a binary number: ");
String binary = sc.next();
int num = Integer.parseInt(binary, 2);
String octal = Integer.toOctalString(num);
System.out.println("The octal representation of " + binary + " is " + octal);
sc.close();
}
}