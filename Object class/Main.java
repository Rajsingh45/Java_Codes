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
System.out.println("Object value is "+d);
System.out.println("To string method of Object class is "+d.toString());
System.out.println("Hash value is "+d.hashCode());
Demo d1=new Demo();
Demo d2=d1;
System.out.println("Are two Objects equal? "+d2.equals(d1));
Object o=new Demo();
System.out.println("o is an object of type "+o.getClass());
d=null;
System.gc();
}
}
