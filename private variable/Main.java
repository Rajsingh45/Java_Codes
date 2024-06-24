/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Test {
private int age;
public void setAge(int a)
{
if(a>18)
age=18;
else
System.out.println("You are not allowed to vote");
}
public int getAge()
{
return this.age;
}
}
class Main {
public static void main(String[] args)
{
Test test = new Test();
//test.setAge(4);
//test.age=25;
System.out.println("Age: " + test.getAge());
}
}
