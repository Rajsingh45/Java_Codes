/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Even extends Thread
{
public void run()
{
for(int i=0;i<10;i+=2)
{
System.out.println(i);
}
}
}
class Odd extends Thread
{
public void run()
{
for(int i=1;i<10;i+=2)
{
System.out.println(i);
}
}
}
public class Main
{
public static void main(String[] args) {
Even e=new Even();
Odd o=new Odd();
e.start();
o.start();
}
}
