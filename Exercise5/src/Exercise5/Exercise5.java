/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lijuan Cao
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InfoModel myModel = new InfoModel();
        StartFrame myFrame = new StartFrame(myModel);
        myFrame.setTitle("StartFrame");
        myFrame.setVisible(true);      
        
    }
    
}
