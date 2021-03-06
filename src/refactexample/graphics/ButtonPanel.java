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
        ButtonListener buttonListener = new ButtonListener(this);
        setButtons(buttonListener);
    }

    private void setButtons(ButtonListener buttonListener)
    {
        JButton squareButton = new JButton("SQUARE");
        add(squareButton);
        squareButton.addActionListener(buttonListener);
        JButton circleButton = new JButton("CIRCLE");
        add(circleButton);
        circleButton.addActionListener(buttonListener);
        JButton eraseButton = new JButton("ERASE");
        add(eraseButton);
        eraseButton.addActionListener(buttonListener);
        JButton quitButton = new JButton("QUIT");
        add(quitButton);
        quitButton.addActionListener(buttonListener);
    }

}
