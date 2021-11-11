import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageIcon coder = new ImageIcon("coder.jpg");

        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");//set text of label (creating a label)
        label.setIcon(coder);
        label.setHorizontalTextPosition(JLabel.CENTER); //Options : set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //Options : set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0, 65, 47)); // set colour of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of Text
        label.setIconTextGap(-27);
        label.setBackground(Color.black);//set background color
        label.setOpaque(true); //display bg colour
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of Icon and Text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of Icon and Text within label
        //label.setBounds(100,100,350,350);//set x and y position within frame and dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        //****have to include pack method after adding all the components
        frame.pack();//adjust size of frame according to its components
    }
}
