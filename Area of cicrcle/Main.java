/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Circle
{
    double r=5,a;
Circle(double r)
{
this.r=r;
}
Circle()
{
}
void process(){
a=3.14D*r*r;
}
void output()
{
System.out.println("Area= "+a);
}
}
public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter r");
    double x=sc.nextDouble();
Circle c=new Circle(x);
c.process();
c.output();

}
}


