package javaAWTpractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class check3 extends Frame {
    private Button b1,b2;
    check3(){
        setVisible(true);
        setSize(500,300);
        b1 = new Button("Submit");
        b2 = new Button("Hello");
        setLayout(new FlowLayout());
        b1.setPreferredSize(new Dimension(50,20));
        add(b1);
        add(b2);
        b1.addActionListener(new action());
        b2.addActionListener(new action2());
    }
}
public class example7 {
    public static void main(String[] args) {
        check3 ob = new check3();
    }
}
class action implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Button Clicked");
    }
}
class action2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Another Button");
    }
}
