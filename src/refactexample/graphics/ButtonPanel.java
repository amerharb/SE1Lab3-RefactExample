/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactexample.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import refactexample.Controller;

/**
 *
 * @author admin
 */
public class ButtonPanel extends JPanel
{

    Controller controller;

    public ButtonPanel(Controller controller)
    {
        this.controller = controller;
        ButtonListener buttonListener = new ButtonListener();
        JButton squareButton = new JButton("SQUARE");
        add(squareButton);
        squareButton.addActionListener(buttonListener);
        JButton circleButton = new JButton("CIRCLE");
        add(circleButton);
        circleButton.addActionListener(buttonListener);
        JButton blankButton = new JButton("BLANK");
        add(blankButton);
        blankButton.addActionListener(buttonListener);
        JButton quitButton = new JButton("QUIT");
        add(quitButton);
        quitButton.addActionListener(buttonListener);
    }

    private class ButtonListener implements ActionListener
    {

        private ButtonListener()
        {
            super();
        }

        public void actionPerformed(ActionEvent e)
        {
            controller.paintShape(e.getActionCommand());
        }
    }
}
