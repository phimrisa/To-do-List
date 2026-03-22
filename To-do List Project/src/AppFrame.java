import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {

    private TitleBar title;
    private Footer footer;
    private List list;

    private JButton newTask;
    private JButton clear;

    AppFrame() {
        super("To-do List Application"); 
        this.setSize(500, 550); // ขนาดของแอป
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // กดปุ่มกากบาทเพื่อปิด
        this.setVisible(true); // แสดงหน้าต่างแอป

        title = new TitleBar(); 
        footer = new Footer();
        list = new List();

        this.add(title, BorderLayout.NORTH); // เพิ่ม title bar ไว้ด้านบน
        this.add(footer, BorderLayout.SOUTH); // เพิ่ม footer ไว้ด้านล่าง
        this.add(list, BorderLayout.CENTER); // เพิ่ม list ไว้ตรงกลาง

        newTask = footer.getNewTask();
        clear = footer.getClear();

        addListeners();
    }
    
    public void addListeners() {
        newTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task); // เพิ่ม task ที่ถูกสร้างไปที่ list
                revalidate(); // ปรับ layout ของ component

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e)
                    {
                        task.changeState(); // สถานะของ task เสร็จแล้วจริง
                        revalidate(); // ปรับ layout ของ component
                    }
                });

                task.getDelete().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        list.remove(task); // ลบ task
                        revalidate(); // ปรับ layout ของ component
                        repaint(); // รีเฟรชหรืออัปเดตหน้าจอแสดงผล
                    }
                });
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks(); // ลบ task ที่ทำเสร็จแล้วทั้งหมด
                revalidate(); // ปรับ layout ของ component
                repaint(); // รีเฟรชหรืออัปเดตหน้าจอแสดงผล
            }
        });
    }
}
