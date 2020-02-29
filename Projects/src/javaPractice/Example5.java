package javaPractice;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int[][] ara = new int[100][100];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix :");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                ara[i][j]=input.nextInt();
            }
        }
        System.out.println("MATRIX");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(ara[i][j] + " ");
            }
            System.out.println();
        }
    }
}
