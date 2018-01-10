import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

class Test {
    public static void main(String[] args) {
        
        
        
        A a = new A();
        
        
        
    }
}

class A extends JFrame implements ActionListener, ItemListener {
    JTextField t1, t2;
    JButton b;
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JLabel l;
    ButtonGroup bg = new ButtonGroup();
    A() {
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b = new JButton("Add");
        l = new JLabel("Result");
        r1 = new JRadioButton("Add");
        r2 = new JRadioButton("Sub");
        c1 = new JCheckBox("Box1");
        c2 = new JCheckBox("Box2");
        bg.add(r1);
        bg.add(r2);
        b.addActionListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        add(t1);
        add(t2);
        add(b);
        add(l);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        
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
    public void itemStateChanged(ItemEvent e) {
        if (c1.isSelected()) {
            System.out.println("c1 changed");
        } else if (c2.isSelected()) {
            System.out.println("c2 changed");
        } else {
            System.out.println(".");
        }
    }
}
