package javaPractice;

public class Example {
    public static void main(String[] args) {
       String s1 = new String("abc");
       String s2 = new String("abc");
       System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//false bcz different objects
    }
}
