package yb_java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

 class Wrong2 extends JFrame {

    private JPanel contentPane;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Wrong2 frame = new Wrong2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Wrong2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton button = new JButton("关闭");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chaxun m = new chaxun();
                m.play();
            }
        });
        button.setIcon(null);
        button.setBounds(10, 200, 414, 51);
        contentPane.add(button);
        
        JTextPane textPane = new JTextPane();
        textPane.setText("操作成功");
        textPane.setBounds(176, 72, 78, 21);
        contentPane.add(textPane);
    }
}
