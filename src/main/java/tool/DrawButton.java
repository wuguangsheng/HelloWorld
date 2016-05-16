package tool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * The program drawing a button
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/17
 */
public class DrawButton extends JFrame{
    private String labe = "Press Me!";
    public DrawButton(){
        super("Test Button Window");
        Container myPane = getContentPane();
        myPane.setLayout(new BorderLayout());
        final JButton b =new JButton(labe);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pack();
            }
        });
        myPane.add(b, BorderLayout.CENTER);
        pack();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void button(){
        DrawButton b = new DrawButton();
        b.setVisible(true);
    }
}
