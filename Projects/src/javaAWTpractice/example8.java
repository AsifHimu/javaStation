package javaAWTpractice;
import java.awt.*;
import java.awt.event.*;

class check4 extends Frame implements ActionListener {
    private Button b1, b2;
    check4(){
        setVisible(true);
        setSize(500, 400);
        setLayout(new FlowLayout());
        b1 = new Button("Submit");
        b2 = new Button("Hello");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            System.out.println("First Button");
        }
        if(e.getSource() == b2){
            System.out.println("Second Button");
        }
    }
}
class mywindow implements WindowListener {
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
 public class example8 {
     public static void main(String[] args) {
         check4 ob = new check4();
         ob.addWindowListener(new mywindow());
     }
 }
