package hackerrank;

import java.util.Scanner;

public class OutputFormatting {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //System.out.println(s1); --string
            //System.out.println(x);  --int
            System.out.printf("%-15s%03d%n", s1, x); //%n will give you the line ending --This is solution, others just for explanation
            System.out.printf("%-15s", s1); //This is printing "java          ". Because -15 means, first print string after complete 15 character with space.
            System.out.printf("%03d", x); //If the input java 50 then it prints "java          050". Why? This means, "03", the input should contains 3 characters if it is not then you complete with 0(start).
            System.out.printf("%05d", x); //If the input 3 then it prints "00003".


        }
        System.out.println("================================");

}
}
