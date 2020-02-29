package javaAWTpractice;

import java.awt.*;

class check extends Frame {
    private TextField tf1,tf2,tf3;
    check(){
        setVisible(true);
        setSize(700,400);
        setLocation(100,100);
        setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
        tf1 = new TextField("Himuuuuuuuu");
        tf2 = new TextField("asiiiiiiiiif");
        tf3 = new TextField("dddddddddddd");
        add(tf1);
        add(tf2);
        add(tf3);
    }
}
public class example5 {
    public static void main(String[] args) {
        check ob = new check();
    }
}
