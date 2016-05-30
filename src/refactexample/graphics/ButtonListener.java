/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactexample.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Amer
 */
class ButtonListener implements ActionListener
{
    private final ButtonPanel outer;

    ButtonListener(final ButtonPanel outer)
    {
        super();
        this.outer = outer;
    }

    
    public void actionPerformed(ActionEvent e)
    {
        outer.controller.paintShape(e.getActionCommand());
    }
    
}
