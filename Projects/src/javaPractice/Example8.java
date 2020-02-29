package javaPractice;

class A {
    //int p=10;
    A(){
        System.out.println("Constructing...1A");
    }
    A(int x,int y){
        System.out.println("Constructing...2A");
    }
}
class B extends A{
    //int q=20;
    B(){
        System.out.println("Constructing..1B");
    }
    B(int x){
        super(1,2);
        System.out.println("Constructing..2B");
    }
   /* public void func1(){
        int p=50;
        System.out.println(p);
        System.out.println(super.p);
    }
    */
}
class C extends B{
    C(){
        System.out.println("Constructing...1C");
    }
    C(int x){
        super(5);
        System.out.println("Constructing...2C");
    }
}
public class Example8 {
    public static void main(String[] args) {
        C ob = new C(1);
    }
}
