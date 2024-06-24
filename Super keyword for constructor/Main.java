/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A
{
int a;
A(int x)
{
a=x;
}
void display()
{
System.out.println(" A value is "+a);
}
}
class B extends A
{
int b;
B(int x,int y)
{
super(x);
b=y;
}
void display()
{
super.display();
System.out.println(" Addition is "+(a+b));
}
}
public class Main
{
public static void main(String[] args) {
B obj=new B(10,5);
obj.display();
}
}