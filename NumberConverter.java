import java.lang.*;

class conversion{
    int num;
    void setnumber(int n){
        num=n;
    }
    String toDecimal(){
        String dec=Integar.toString(num);
        return dec;
    }
    String toHex(){
        String hex=Integar.toHexString(num);
        return hex;
    }
    String toBinary(){
        String bin=Integar.toBinaryString(num);
        return bin;
    }
    String toOctal(){
        String oct=Integar.toOctalString(num);
        return oct;
    }
}
class NumberConverter{
    public static void main(String[] args){
        conversion obj=new conversion();
        obj.setnumber(11);
        String result;
        result=obj.toDecimal();
        System.out.println("Decimal Value is : " + result);
        result=obj.toHex();
        System.out.println("Hexadecimal Value is : " + result);
        result=obj.toBinary();
        System.out.println("Binary Value is : " + result);
        result=obj.toOctal();
        System.out.println("Octal Value is : " + result);
    }
}