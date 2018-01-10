import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Test {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton b;
    JLabel l;
    A() {
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b = new JButton("Add");
        l = new JLabel("Result");
        b.addActionListener(this);
        add(t1);
        add(t2);
        add(b);
        add(l);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        l.setText(c + "");
    }
}
