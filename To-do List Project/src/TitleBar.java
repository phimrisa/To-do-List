import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{
    TitleBar() {
        this.setPreferredSize(new Dimension(400,80)); // ขนาดพื้นที่ของ Title Bar
        JLabel titleText = new JLabel("To-do List"); // ข้อความของ Title Bar
        titleText.setPreferredSize(new Dimension(200, 60)); // ขนาดตัวอักษร Title Bar
        titleText.setFont(new Font("Sans-serif",Font.PLAIN, 20)); // ฟอนต์ Title Bar
        titleText.setHorizontalAlignment(JLabel.CENTER); // ทำให้ Title Bar อยู่ตรงกลาง
        this.add(titleText); // เพิ่มข้อความไปที่ Title Bar
    }
}
