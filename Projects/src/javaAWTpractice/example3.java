package javaAWTpractice;

import java.awt.*;

public class example3 extends Frame {
    public static void main(String[] args) {
        example3 ob = new example3();
        TextField tf;
        ob.setSize(400,400);
        ob.setTitle("HELLLLLOOOOO");
        tf = new TextField(10);
        tf.setBounds(150,50,100,20);
        ob.setLayout(null);
        ob.add(tf);
        ob.setVisible(true);
    }
}
