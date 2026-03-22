import javax.swing.*;
import java.awt.*;

class List extends JPanel {
    List() {
        GridLayout layout = new GridLayout(10, 1); // สร้าง layout ด้วยจํานวนแถว = 10 และคอลัมน์ = 1
        layout.setVgap(5); // ระยะห่างระหว่าง Tasks

        this.setLayout(layout); // ตั้งค่า layout 
        this.setPreferredSize(new Dimension(400, 560)); // ขนาดพื้นที่ของ Tasks
    }

    public void removeCompletedTasks() {
        // Note: Component คือ object ที่แสดงกราฟิกที่สามารถแสดงบนหน้าจอและสามารถโต้ตอบกับผู้ใช้ได้ เช่น ปุ่มต่าง ๆ หรือ text field
        for (Component c : getComponents()) { // Return ค่า array ทั้งหมดของ components ใน container
            // Note: "instanceof" ใช้เพื่อทดสอบว่า object เป็น instance ของ class หรือ implements interface ไหนหรือเปล่า (return boolean)
            if (c instanceof Task) {
                if (((Task) c).getState()) { // ถ้า true ลบ component
                    remove(c);
                }
            }
        }
    }
}
