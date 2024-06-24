/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.IOException;
class Testthrows1{
void m()throws IOException
{
throw new IOException("device error");//checked exception
}
void n()throws IOException
{
m();
}
void p()
{
try
{
n();
}
catch(Exception e)
{
System.out.println("exception handled");
    
}
}
public static void main(String args[])
{
Testthrows1 obj=new Testthrows1();
obj.p();
System.out.println("normal flow...");
}
