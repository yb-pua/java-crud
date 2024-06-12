package yb_java;


import java.awt.BorderLayout;
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
import java.sql.SQLException;

class shanchu2 extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    /**
     * Launch the application.
     * */
    public  void play(String s ,String s1) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    shanchu2 frame = new shanchu2(s,s1);
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
    public shanchu2(String s,String s1) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 607, 412);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("删除");
        btnNewButton.setFont(new Font("仿宋", Font.PLAIN, 12));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                mysql m = new mysql();
                try {
                    if(m.denglu(s,s1)==1){
                        m.del2(s,s1);
                        trueshanchu2 q = new trueshanchu2();
                        q.play();
                    }
                    else{
                        notshanchu m1 = new notshanchu();
                        m1.play();
                    }
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setIcon(null);
        btnNewButton.setBounds(85, 301, 190, 62);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("返回");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m =new login();
                m.play();
            }
        });
        btnNewButton_1.setIcon(null);
        btnNewButton_1.setBounds(342, 301, 203, 62);
        contentPane.add(btnNewButton_1);

        lblNewLabel_2 = new JLabel("请考虑下是否删除");
        lblNewLabel_2.setFont(new Font("仿宋", Font.PLAIN, 16));
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setBounds(207, 123, 190, 46);
        contentPane.add(lblNewLabel_2);
    }

}
