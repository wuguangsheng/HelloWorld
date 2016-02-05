package tool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * The program is the class provides a basic window,
 * with a quite button,that can be used to create simple GUI.
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/4
 */
public class DrawFrame extends JFrame{
    /**
     * Override of the method to add a <CODE>JPanel</CODE> to
     * the <CODE>DrawFrame</CODE> so that the <CODE>JPanel</CODE>
     * is centred.
     */
    public void add(final JPanel panel){
        getContentPane().add(panel, BorderLayout.CENTER);
    }

    /**
     * Terminate the program when the user want to quit.
     */
    private void quit(){
        System.exit(0);
    }

    /**
     * Construct a <CODE>DrawFrame</CODE> .
     * @param title
     */
    public DrawFrame(final String title){
        // Initialize the JFrame ensuring the title bar is set.
        super(title);
        // Set up the quit button with it's listener.
        Button quitButton = new Button("Quit");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quit();
            }
        });
        // Put all the button into a JPanel.
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(quitButton);
        // Create the contents of the frame. Use BorderLayout with the
        // top (Center) part being the drawing area and the button
        // (South) strip holding a quit button.
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        // Ensure that window close events from the window manager are
        // caught and acted upon.
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                quit();
            }
        });
    }

    /**
     * Position a window in the center of the screen
     */
    public void centreOnScreen(){
        Dimension displaySize = getToolkit().getScreenSize();
        Dimension windowSize =getSize();
        int x = (displaySize.width - windowSize.width) / 2;
        int y = (displaySize.height - windowSize.height) /2;
        if (x < 0) {
            x = 0;
        }
        if (y <0) {
            y = 0;
        }
        setLocation(x,y);
    }
}
