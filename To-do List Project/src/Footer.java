import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Footer extends JPanel {
    JButton addTask;
    JButton clearAll;

    Footer() {
        this.setPreferredSize(new Dimension(400, 60)); // ขนาดพื้นที่ของ Footer

        addTask = new JButton("Add Task"); // ปุ่ม Add Task
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 15)); // ฟอนต์ของปุ่ม Add Task
        addTask.setVerticalAlignment(JButton.BOTTOM); // ทำให้ปุ่ม Add Task อยู่ด้านล่าง
        this.add(addTask); // เพิ่มไปที่ Footer

        this.add(Box.createHorizontalStrut(20)); // ระยะห่างระหว่างปุ่ม Add Task กับ Clear Finished Tasks

        clearAll = new JButton("Clear Finished Tasks"); // ปุ่ม Clear Finished Tasks
        clearAll.setFont(new Font("Sans-serif", Font.PLAIN, 15)); // ฟอนต์ของปุ่ม Clear Finished Tasks
        this.add(clearAll); // เพิ่มไปที่ Footer
    }

    public JButton getNewTask() {
        return addTask;
    }

    public JButton getClear() {
        return clearAll;
    }
}
