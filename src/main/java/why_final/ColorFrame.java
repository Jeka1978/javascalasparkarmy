package why_final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(final int counter) throws HeadlessException {
        setSize(600,600);
        JButton button = new JButton("click to change color");
        getContentPane().add(button,BorderLayout.NORTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
                repaint();
                System.out.println(counter);
            }
        });


        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(1);
    }












}
