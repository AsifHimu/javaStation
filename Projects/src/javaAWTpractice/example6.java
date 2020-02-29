package javaAWTpractice;
import java.awt.*;

class check2 extends Frame {
    private TextField tf1,tf2,tf3;
    private Button b1,b2;
    check2(){
        setVisible(true);
        setSize(700,400);
        setLocation(100,100);
        setLayout(new FlowLayout());
        tf1 = new TextField("Himuuuuuuuu");
        add(tf1);
        //tf1.setEditable(false);
        //tf1.setText("huhuhuhuh");
        //System.out.println(tf1.getText());
        //b1 = new Button();
        b2 = new Button("Submit");
        b2.setPreferredSize(new Dimension(200,20));
        //add(b1);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.ORANGE);
        add(b2);
    }
}
public class example6 {
    public static void main(String[] args) {
        check2 ob = new check2();
    }
}

