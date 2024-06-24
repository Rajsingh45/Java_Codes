/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Complex
{
int x,y;
Complex(int x,int y)
{
this.x=x;
this.y=y;
}
Complex()
{
}
void display()
{
System.out.println("Complex number is = "+x+"+i"+y);
}
Complex add(Complex p)
{
Complex z=new Complex();
z.x=x+p.x;
z.y=y+p.y;
return z;
}
}
public class Main
{
public static void main(String[] args) {
Complex c1=new Complex(10,5);
Complex c2=new Complex(5,10);
Complex c3=c1.add(c2);
c3.display();
}
}
