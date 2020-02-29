package javaPractice;
import java.util.Scanner;

public class Example2 {
    public static void main(String args[]) {
        System.out.println("Enter :");
        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        //System.out.println(num);
        String name = input.nextLine();
        System.out.println(name);
    }
}
