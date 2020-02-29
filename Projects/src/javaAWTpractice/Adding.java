package javaAWTpractice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class add extends Frame implements ActionListener{
    private TextField text1,text2,text3;
    private Button btn;
    private Label l1,l2,l3;
    add(){
        setTitle("Ulalalala");
        setVisible(true);
        setSize(400,400);
        text1 = new TextField(10);
        text2 = new TextField(10);
        text3 = new TextField(10);
        l1 = new Label("Enter First Number");
        l2 = new Label("Enter Second Number");
        l3 = new Label("Result");
        btn = new Button("Submit");
        setLayout(null);
        l1.setBounds(20,50,150,20);
        l2.setBounds(20,100,150,20);
        l3.setBounds(20,150,150,20);
        text1.setBounds(180,50,100,30);
        text2.setBounds(180,100,100,30);
        text3.setBounds(180,150,100,30);
        btn.setBounds(210,200,50,30);
        add(l1);
        add(l2);
        add(l3);
        add(text1);
        add(text2);
        add(text3);
        add(btn);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            try{
                int f = Integer.parseInt(text1.getText());
                int s = Integer.parseInt(text2.getText());
                int sum = f+s;
                //String bin = Integer.toBinaryString(sum);
                String abc = Integer.toString(sum);
                text3.setText(abc);
            }catch (Exception p){
                text3.setText("Invalid Input");
            }
        }
    }
}
class window implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }
    @Override
    public void windowClosed(WindowEvent e) {
    }
}
public class Adding {
    public static void main(String[] args) {
        add ob = new add();
        ob.addWindowListener(new window());
    }
}
