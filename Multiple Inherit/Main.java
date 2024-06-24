/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class A
{
int a;
Scanner s=new Scanner(System.in);
void inputA()
{
System.out.println("Please enter A value");
a=s.nextInt();
}
void displayA()
{
System.out.println(" A value is "+a);
}
}


class B extends A
{
int b;
void inputB()
{
System.out.println("Please enter B value");
b=s.nextInt();
}
void displayAplusB()
{
System.out.println(" Addition is "+(a+b));
}
}
class C extends B
{
int c;
void inputC()
{
System.out.println("Please enter C value");
c=s.nextInt();
}
void displayAddition()
{
System.out.println(" Addition is "+(a+b+c));
}
}
public class Main
{
public static void main(String[] args) {
C obj=new C();
obj.inputA();
obj.displayA();
obj.inputB();
obj.displayAplusB();
obj.inputC();
obj.displayAddition();
}
}