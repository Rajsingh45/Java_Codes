/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Student s[]=new Student[3];
for(int i=1;i<3;i++)
{
s[i]=new Student();
s[i].input();
}
for(int i=1;i<3;i++)
{
s[i].display();
}}}

class Student
{
String name;
int total;
Scanner s=new Scanner(System.in);
void input()
{
System.out.println("Please enter name and total");
name=s.nextLine();
total=s.nextInt();
}
void display()
{
System.out.print("name and total is "+name+ " and "+total);
}
}
