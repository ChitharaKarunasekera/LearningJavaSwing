import jdk.jfr.Enabled;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import javax.xml.stream.FactoryConfigurationError;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

//MyFrame is subclass and JFrame is the parent class
public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    public MyFrame(){
        ImageIcon icon = new ImageIcon("pointor.jpg");
        ImageIcon icon2 = new ImageIcon("face.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250, 150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(150,100,250,100);//dimensions of button
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);//remove broader around text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(0);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);//disable button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Boo");
            label.setVisible(true);
            //To make it active only for once
            //button.setEnabled(false);//disable button
        }
    }
}
