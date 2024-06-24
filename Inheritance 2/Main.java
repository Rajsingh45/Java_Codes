/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class monkey{
    void jump(){
             System.out.println("jump");
    }
    void bite(){
             System.out.println("bite");
    }
}
interface basicanimal{
    void eat();
    void steep();
}
class kuman extends monkey implements basicanimal{
    public void jump(){
        System.out.println("jumping");

    }
    public void bite(){
        System.out.println("biting");

    }
    public void eat(){
        System.out.println("eat");

    }
    public void steep(){
        System.out.println("steep");

    }

}
public class Main {
    public static void main(String[] args) {
        kuman pen=new kuman();
        pen.eat();
        pen.bite();
    }
}

