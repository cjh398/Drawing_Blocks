import javax.swing.JFrame;
import java.awt.Color;

class BlocksViewer {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(10 * 20, 26 * 20);
	frame.setTitle("Tretis!!!");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBackground(Color.GRAY);
  Blocks b = new Blocks();
  frame.add(b);
  frame.setVisible(true);



	// Create a new JComponent descendant object
	// Add that object to the frame
	// Make the frame visible so it renders
    }
}
