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
final void display()
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
void display()//because final hai isliye error aa rha hai
{
System.out.println(" Addition is "+(a+b));
}
}
public class Main
{
public static void main(String[] args) {
B obj=new B();
obj.inputA();
obj.display();
obj.inputB();
obj.display();
}
}
