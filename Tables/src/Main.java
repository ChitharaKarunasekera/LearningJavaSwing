import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Table myTable = new Table();

        myTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myTable.setSize(600, 200);
        myTable.setVisible(true);
        myTable.setTitle("My Java Swing Table");
    }
}
