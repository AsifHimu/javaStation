package javaPractice;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ara = new int[100];
        for(int i=1;i<=5;i++){
             ara[i] = input.nextInt();
        }
        for(int i=1;i<=5;i++){
            System.out.println(ara[i]);
        }
        //System.out.println(ara[3]);
    }
}
