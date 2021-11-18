import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple JFrame Example");
        JButton b = new JButton("Click");
        b.setBounds(200, 100, 100, 50);

        frame.add(b);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
