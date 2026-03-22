import java.awt.*;

import javax.swing.*;

public class Task extends JPanel {
    JLabel index;
    JTextField taskName;
    JCheckBox checkBox;
    JButton delete;

    private boolean checked;

    Task() {
        this.setPreferredSize(new Dimension(200, 20)); // ขนาดพื้นที่ของช่อง Task

        this.setLayout(new BorderLayout()); // ตั้งค่า layout ของ Task

        checked = false;

        taskName = new JTextField(); // สร้าง text field
        taskName.setFont(new Font("Sans-serif", Font.PLAIN, 15)); // ฟอนต์ของข้อความใน text field
        this.add(taskName, BorderLayout.CENTER);

        checkBox = new JCheckBox(); // สร้าง check box
        checkBox.setFocusPainted(false); // ทำให้ check box ว่าง
        this.add(checkBox, BorderLayout.WEST); 

        delete = new JButton("Delete"); // สร้างปุ่ม delete
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
        revalidate(); // ปรับ layout ของ component 
    }

    public JButton getDelete(){
        return this.delete;
    }
}
