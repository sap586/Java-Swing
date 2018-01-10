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
    JTextField t1, t2;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;
    ButtonGroup bg = new ButtonGroup();
    A() {
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b = new JButton("Add");
        l = new JLabel("Result");
        r1 = new JRadioButton("Add");
        r2 = new JRadioButton("Sub");
        bg.add(r1);
        bg.add(r2);
        b.addActionListener(this);
        add(t1);
        add(t2);
        add(b);
        add(l);
        add(r1);
        add(r2);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c;
        if (r1.isSelected()) {
            c = a + b;
        } else if (r2.isSelected()) {
            c = a - b;
        } else {
            l.setText("Invalid");
            return;
        }
        l.setText(c + "");
    }
}
