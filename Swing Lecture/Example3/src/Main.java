import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int a = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Example for Simulation");//create frame
        JTextField t = new JTextField();
        t.setBounds(50,50,200,50);
        JButton b = new JButton("Display");
        b.setBounds(50,100,150,50);
        JButton colorBtn = new JButton("Color");
        colorBtn.setBounds(200,100,150,50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Welcome to OOP Lecture");
            }
        });

        colorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a%2 == 0){
                    f.getContentPane().setBackground(Color.CYAN);
                    a++;
                }
                else {
                    f.getContentPane().setBackground(Color.green);
                    a++;
                }
            }
        });

        f.add(t);
        f.add(b);f.add(colorBtn);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
