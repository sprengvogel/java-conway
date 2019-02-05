import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.*;

public class Window extends JFrame {
	private static final long serialVersionUID = -5554719700311951974L;
	private static final int GRID_SIZE = 50;
    private static final int CELL_SIZE = 20;
	private static final int CANVAS_WIDTH = CELL_SIZE * GRID_SIZE;
	private static final int CANVAS_HEIGHT = CELL_SIZE * GRID_SIZE;
	
	private JToggleButton[][] buttonArray = new JToggleButton[GRID_SIZE][GRID_SIZE];

	public Window() {
    	Container cp = getContentPane();
        cp.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
        
        for(int i=0; i < GRID_SIZE; i++) {
        	for(int j=0; j < GRID_SIZE; j++) {
        		JToggleButton button = new JToggleButton();
        		buttonArray[i][j] = button;
        		cp.add(button);
        	}
        }
        
        cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        pack();
   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Handle window closing
        setTitle("Game of life");
        setVisible(true);
    }

    public static void main(final String[] args) {
        new Window();
    }
}