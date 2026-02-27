import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Footer extends JPanel {
    JButton addTask;
    JButton clearAll;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    Footer() {
        this.setPreferredSize(new Dimension(400, 60));

        addTask = new JButton("Add Task");
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 15));
        addTask.setVerticalAlignment(JButton.BOTTOM);
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        clearAll = new JButton("Clear finished tasks");
        clearAll.setFont(new Font("Sans-serif", Font.PLAIN, 15));
        this.add(clearAll);
    }

    public JButton getNewTask() {
        return addTask;
    }

    public JButton getClear() {
        return clearAll;
    }
}