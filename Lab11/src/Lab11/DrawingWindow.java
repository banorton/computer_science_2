package Lab11;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author lcao2
 */
public class DrawingWindow extends JPanel {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public DrawingWindow() {
        this.setBackground(Color.WHITE);
        //add different types of shapes in the ArrayList

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        for (Shape s : shapes) {
            s.draw(g2d);
        }

    }

    public static void main(String[] args) {
        JFrame drawingFrame = new JFrame();
        drawingFrame.setSize(1000, 1000);
        drawingFrame.setTitle("Drawing Window");
        drawingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingWindow window = new DrawingWindow();
        drawingFrame.add(window);
        drawingFrame.setVisible(true);

        for (Shape s : window.shapes) {
            System.out.println("Area of " + s.getClass().getSimpleName() + " is: " + s.getArea());
        }
        
    }
}
