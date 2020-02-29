package javaPractice;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int[][] ara = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ara[i][j]=input.nextInt();
            }
        }
        for(int[] x : ara){
            System.out.print(x[0]);
            System.out.print(x[1]);
            System.out.print(x[2]);
            System.out.println();
            for(int y : x){
                System.out.print(y + "bo");
            }
            System.out.println();
        }
    }
}
