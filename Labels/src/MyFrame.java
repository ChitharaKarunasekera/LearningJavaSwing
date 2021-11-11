import javax.swing.*;
import java.awt.*;

//MyFrame is subclass and JFrame is the parent class
public class MyFrame extends JFrame {

    public MyFrame(){
        this.setTitle("My first Frame"); //title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Quit application
        this.setResizable(false); //prevent from being resized
        this.setSize(420,420); //sets the size of frame
        this.setVisible(true);// make table visible


        ImageIcon image = new ImageIcon("CompanyName.png"); //create an image icon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane().setBackground(new Color(0,255,0));//change colour of background
    }
}
