/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Counter
{
static int count;
Counter()
{
count++;
}
static void display()
{
System.out.println("Count = "+count);
}
}
public class Main
{
public static void main(String[] args) {
Counter c1=new Counter();
Counter.display();
Counter c2=new Counter();
Counter c3=new Counter();
Counter.display();
}
}
