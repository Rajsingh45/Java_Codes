/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class A
{
A()
{
System.out.println("Constructor of A class");
}
}
class B extends A
{
B()
{
System.out.println("Constructor of B class");
}
}
class C extends B
{
C()
{
System.out.println("Constructor of C class");
}
}
public class Main
{
public static void main(String[] args) {
C obj=new C();
}
}
