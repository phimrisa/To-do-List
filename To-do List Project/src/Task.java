import java.awt.*;

import javax.swing.*;

public class Task extends JPanel{
    JLabel index;
    JTextField taskName;
    JCheckBox checkBox;
    JButton delete;

    private boolean checked;

    Task()
    {
        this.setPreferredSize(new Dimension(200, 20));

        this.setLayout(new BorderLayout());

        checked = false;

        taskName = new JTextField();
        taskName.setFont(new Font("Sans-serif", Font.PLAIN, 15));
        this.add(taskName, BorderLayout.CENTER);

        checkBox = new JCheckBox();
        checkBox.setFocusPainted(false);
        this.add(checkBox, BorderLayout.WEST);

        delete = new JButton("Delete");
        this.add(delete, BorderLayout.EAST);
    }

    public JCheckBox getDone() {
        return checkBox;
    }

    public boolean getState() {
        return checked;
    }

    public void changeState() {
        checked = true;
        revalidate();
    }

    public JButton getDelete(){
        return this.delete;
    }
}
