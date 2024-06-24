/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class A
{
int a=3;
Scanner s=new Scanner(System.in);
void inputA()
{
System.out.println("Please enter A value");
a=s.nextInt();
}
void display()
{
System.out.println(" A value is "+a);
}
}
final class B extends A
{
int b;
void inputB()
{
System.out.println("Please enter B value");
b=s.nextInt();
}
void display()
{
System.out.println(" Addition is "+(a+b));
}
}
class C extends B//bacause final hai
{
}
public class Main
{
public static void main(String[] args) {
C obj=new C();
obj.inputA();
obj.display();
obj.inputB();
obj.display();
}
}
