package javaAWTpractice;

import java.awt.*;

public class frame2 extends Frame {
    public static void main(String[] args) {
        frame2 ob = new frame2();
        ob.setTitle("newTitle");
        ob.setSize(500,500);
        ob.setLocation(600,400);
        //ob.setBounds(500,100,500,300);
        //ob.setBackground(Color.ORANGE);
        TextField tf = new TextField("HiiiiiiiiiiMuuuuuuuu");
        ob.add(tf);
        ob.setVisible(true);
    }
}
