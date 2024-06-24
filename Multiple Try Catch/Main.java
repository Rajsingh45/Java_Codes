/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
class Main
{
public static void main(String z[])throws IOException
{
int a,b,c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 2 numbers");
try
{
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a/b;
System.out.println("Division is "+c);
}
catch(ArithmeticException e)
{
System.out.println("Your are not supposed to enter 0 as deno");
}
catch(NumberFormatException e)
{
System.out.println("Pls Enter a number");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

