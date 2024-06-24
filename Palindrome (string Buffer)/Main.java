/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String s1=s.nextLine();
System.out.println("Original String is = "+s1);
StringBuffer sb=new StringBuffer();
sb.append(s1);
System.out.println("StringBuffer is = "+sb);
sb.reverse();
System.out.println("StringBuffer is = "+sb);
String rev=sb.toString();
System.out.println("String Reverse is = "+rev);
if(s1.equalsIgnoreCase(rev))
System.out.println("String is Palindrome ");
else
System.out.println("String is not a Palindrome ");
}
}
