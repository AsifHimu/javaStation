package javaAWTpractice;

import java.awt.*;

public class example4 {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setSize(300,500);
        //fr.setResizable(false);
        TextField tf = new TextField("HELLLOOOO");
        TextField tf2 = new TextField("asiiiiiiidddd");
        TextField tf3 = new TextField("kkkkkkkkissssssdddd");
        TextField tf4 = new TextField("aoooooooooooo");

        fr.add(tf);
        fr.add(tf2);
        fr.add(tf3);
        fr.add(tf4);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
    }

}
