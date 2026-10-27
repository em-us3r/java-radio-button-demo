
import javax.swing.*;
import java.awt.event.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("RadioButtonDemo");

        JRadioButton b1 = new JRadioButton("Bird");
        JRadioButton b2 = new JRadioButton("Cat");
        JRadioButton b3 = new JRadioButton("Dog");
        JRadioButton b4 = new JRadioButton("Rabbit");
        JRadioButton b5 = new JRadioButton("Pig");

        b1.setBounds(50, 30, 100, 30);
        b2.setBounds(50, 60, 100, 30);
        b3.setBounds(50, 90, 100, 30);
        b4.setBounds(50, 120, 100, 30);
        b5.setBounds(50, 150, 100, 30);

        ButtonGroup bg = new ButtonGroup();

        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        bg.add(b5);

        b5.setSelected(true);

        JButton btn = new JButton("Show");
        btn.setBounds(50, 200, 100, 30);

        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(b1.isSelected())
                {
                    JOptionPane.showMessageDialog(f, "Bird selected");
                }
                else if(b2.isSelected())
                {
                    JOptionPane.showMessageDialog(f, "Cat selected");
                }
                else if(b3.isSelected())
                {
                    JOptionPane.showMessageDialog(f, "Dog selected");
                }
                else if(b4.isSelected())
                {
                    JOptionPane.showMessageDialog(f, "Rabbit selected");
                }
                else if(b5.isSelected())
                {
                    JOptionPane.showMessageDialog(f, "Pig selected");
                }
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(btn);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
