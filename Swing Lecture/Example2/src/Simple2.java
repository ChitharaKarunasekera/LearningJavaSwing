import javax.swing.*;

public class Simple2 extends JFrame {
    JFrame f;

    public Simple2(){
        JButton b = new JButton("Click");//create button
        b.setBounds(130,100,100,40);

        add(b);//adding button to frame
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
}
