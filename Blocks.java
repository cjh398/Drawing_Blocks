import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Blocks extends JComponent
{

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Rectangle longBlock = new Rectangle(0, 0, 20, 80);
    Rectangle squareBlock = new Rectangle(40, 0 , 40, 40);
    Color longBlockC = Color.YELLOW;
    Color squareBlockC = Color.BLUE;
    g2.translate(20, 40);
    g2.setPaint(longBlockC);
    g2.setPaint(squareBlockC);
    g2.fill(longBlock);
    g2.fill(squareBlock);
  }


}
