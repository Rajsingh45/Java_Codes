/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main
{
public static void main(String z[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter your age numbers");
try
{
age=s.nextInt();
if(age<18)
{
throw new NumberFormatException();
}
System.out.println(" You are an eligible voter");
}
catch(NumberFormatException e)
{
System.out.println("You cannot vote");
}
}
