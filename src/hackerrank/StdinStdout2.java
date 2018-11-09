package hackerrank;

import java.util.Scanner;

public class StdinStdout2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); //it only reads the int value.
        Double d = scan.nextDouble(); //it only reads the double value.
        scan.nextLine(); //When you continue reading, you receive the "/n" Enter key.
        String s = scan.nextLine(); //Now, it will read the string value.
   
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
