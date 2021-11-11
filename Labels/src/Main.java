import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ImageIcon

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");//set text of label (creating a label)

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}
