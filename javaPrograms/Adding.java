import java.awt.*;
import java.awt.event.*;

class add extends Frame implements ActionListener {
    private TextField txt_fnum, txt_snum, txt_sum;
    private Button btn_add;
    private Label lbl_fnum,lbl_snum,lbl_result;

    public add(){
        setResizable(false);
        setTitle("Addition");
        setSize(300,300);
        setLocation(100,100);
        lbl_fnum = new Label("Enter 1st Number");
        lbl_snum = new Label("Enter 2nd Number");
        lbl_result= new Label("Result");
        txt_fnum = new TextField(10);
        txt_snum = new TextField(10);
        btn_add = new Button("Submit");
        txt_sum = new TextField(10);
        setLayout(null);
        lbl_fnum.setBounds(10, 50, 130, 20);
        txt_fnum.setBounds(150, 50, 100, 20);
        lbl_snum.setBounds(10, 100, 130, 20);
        txt_snum.setBounds(150, 100, 100, 20);
        btn_add.setBounds(90, 200, 70, 20);
        lbl_result.setBounds(10,150,130,20);
        txt_sum.setBounds(150, 150, 100, 20);

        add(lbl_fnum);
        add(txt_fnum);
        add(lbl_snum);
        add(txt_snum);
        add(btn_add);
        add(lbl_result);
        add(txt_sum);
        btn_add.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btn_add) {
            int fno=Integer.parseInt(txt_fnum.getText());
            int sno=Integer.parseInt(txt_snum.getText());
            int sum=fno+sno;
            txt_sum.setText(sum+"");
        }
    }
}

class Adding{
    public static void main(String args[]) {
        new add().setVisible(true);
    }
}