package javaAWTpractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Converter extends Frame implements ActionListener{
    private Button btn1 ,btn2, btn3;
    private TextField txt1,txt2;
    private Label lb1,lb2;
    Converter(){
        setVisible(true);
        setSize(400,300);
        setResizable(false);
        txt1 = new TextField(10);
        txt2 = new TextField(10);
        lb1 = new Label("Input a number");
        lb2 = new Label("Result");
        btn1 = new Button("Binary");
        btn2 = new Button("Octal");
        btn3 = new Button("Hexadecimal");
        setLayout(null);
        txt1.setBounds(90,70,190,30);
        add(txt1);
        lb1.setBounds(90,50,100,30);
        add(lb1);
        txt2.setBounds(90,140,190,30);
        add(txt2);
        lb2.setBounds(90,120,100,30);
        add(lb2);
        btn1.setBounds(90,180,40,20);
        add(btn1);
        btn2.setBounds(140,180,40,20);
        add(btn2);
        btn3.setBounds(190,180,90,20);
        add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btn1) {
                int val = Integer.parseInt(txt1.getText());
                String bin = Integer.toBinaryString(val);
                txt2.setText(bin);
            } else if (e.getSource() == btn2) {
                int val = Integer.parseInt(txt1.getText());
                String oct = Integer.toOctalString(val);
                txt2.setText(oct);
            } else {
                int val = Integer.parseInt(txt1.getText());
                String hex = Integer.toHexString(val);
                txt2.setText(hex);
            }
        }catch (Exception p){
            txt2.setText("Invalid Input");
        }
    }
}
class window1 implements WindowListener{
    @Override
    public void windowClosed(WindowEvent e) {
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {
    }
    @Override
    public void windowOpened(WindowEvent e) {
    }
}
public class Converting {
    public static void main(String[] args) {
        Converter ob = new Converter();
        ob.addWindowListener(new window1());
    }
}
