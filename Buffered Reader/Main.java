/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Error aa rha hai
import.java.io.*;
public class Main
{ 
public static void main(String args[])throws InstantiationException
{ 
Inputstreamreader isr=new Inputstreamreader(System.in);
BufferedReader br=new BufferedReader();
int num = Integer.parseInt(br.readLine()); 
int count=0;
while(num>0){
    num =num/10; 
    count++; 
} 
System.out.println(count); 
} 
}

