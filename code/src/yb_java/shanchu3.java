package yb_java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

class shanchu3 extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    shanchu3 frame = new shanchu3();
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
    public shanchu3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 607, 412);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        lblNewLabel_2 = new JLabel("请输入您要删除的id或名字");
        lblNewLabel_2.setFont(new Font("仿宋", Font.PLAIN, 15));
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setBounds(184, 32, 232, 46);
        contentPane.add(lblNewLabel_2);


        textField = new JTextField();
        textField.setBounds(41, 133, 174, 31);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(346, 133, 174, 31);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        btnNewButton = new JButton("\u5220\u9664\u6B64id");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                String t=textField.getText();
                shanchu2 m = new shanchu2(t,t);
                m.play(t,t);
            }
        });
        btnNewButton.setBounds(66, 198, 108, 30);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("\u5220\u9664\u6B64\u59D3\u540D");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                String t=textField_1.getText();
                shanchu2 m = new shanchu2(t,t);
                m.play(t,t);
            }
        });
        btnNewButton_1.setBounds(383, 198, 108, 31);
        contentPane.add(btnNewButton_1);

        btnNewButton_2 = new JButton("\u8FD4\u56DE\r\n");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m = new login();
                m.play();
            }
        });
        btnNewButton_2.setForeground(new Color(0, 0, 0));
        btnNewButton_2.setIcon(null);
        btnNewButton_2.setBackground(new Color(255, 255, 255));
        btnNewButton_2.setBounds(189, 283, 203, 46);
        contentPane.add(btnNewButton_2);
    }

}
