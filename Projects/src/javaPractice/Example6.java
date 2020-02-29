package javaPractice;

public class Example6 {
    public static void main(String[] args) {
        int[] num = {100,200,300,400,500,600,700,800};
        for(int x : num){
            //if(x == 500) break;
            System.out.println(x);
            x = x * 2;
        }
    }
}
