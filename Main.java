class Box{
    int a,b;
    Box(int x,int y){
        a=x;
        b=y;
    }
    int area(){
        return a*b;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("himuuuuuuuu");
        Box ob=new Box(2,3);
        int x=ob.area();
        System.out.println(x);
    }
}