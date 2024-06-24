/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
public static void main(String[] args) {
Vector v=new Vector(5,2);
v.addElement(new Integer(1));
v.addElement(new Double(7.8));
v.addElement(new Float(3.2));
v.addElement(new Long(1000045));
v.addElement(new String("DJSCE"));
System.out.println("Vector is "+v);
System.out.println("Capacity is = "+v.capacity());
v.addElement(new Float(3.2));
v.addElement(new Long(1000045));
v.addElement(new String("DJSCE"));
System.out.println("Vector is "+v);
System.out.println("Capacity is = "+v.capacity());
System.out.println("Size is = "+v.size());
v.addElement(new String("Sixth Element"));
System.out.println("Vector is "+v);
System.out.println("Capacity is = "+v.capacity());
System.out.println("Size is = "+v.size());
}
}
