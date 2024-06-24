/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Demo
{
void display(int x)
{
System.out.println("X= "+x);
}
protected void finalize()
{
System.out.println("I m in the finalize method, good bye ");
}
}
public class Main
{
public static void main(String[] args) {
Demo d=new Demo();
d.display(10);
d=null;
System.gc();
}
}
