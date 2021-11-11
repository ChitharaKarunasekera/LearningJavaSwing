import javax.swing.*;
import java.awt.*;

public class Table extends JFrame {
    JTable table;

    public Table(){
        setLayout(new FlowLayout());

        String[] columnNames = {"Driver Name", "Team Name", "1st Positions", "2nd Positions", "3rd Positions", "Points", "Completed"};
        Object[][] data = {
                {"Bill", "Hazel", "Male", "Male", "Male", "Male", "Male"},
                {"Mary", "Black", "Female", "Male", "Male", "Male", "Male"},
                {"Rick", "Red", "Male", "Male", "Male", "Male", "Male"},
                {"Janice", "Yellow", "Female", "Male", "Male", "Male", "Male"},
        };

        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));//width and height of table
        table.isEditing();
        //table.setFillsViewportHeight(true);

        //scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);//table is inside scroll pane
    }
}