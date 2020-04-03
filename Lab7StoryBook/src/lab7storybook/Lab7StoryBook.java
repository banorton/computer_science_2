/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7storybook;

/**
 *
 * @author banor
 */sdfg
public class Lab7StoryBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StorybookModel myModel = new StorybookModel();

        StartFrame myStartFrame = new StartFrame(myModel);
        myStartFrame.setVisible(true);
    }

}
