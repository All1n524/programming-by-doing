//Graphics A Circle Allen Hung 20 points

import java.awt.*;
import javax.swing.JFrame;

public class ACircle extends Canvas{

  public void paint(Graphics g){
    g.setColor(Color.green);
    g.fillOval(100, 100, 50, 50);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("A circle");
    jFrame.setSize(400,400);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ACircle canvas = new ACircle();
    jFrame.add(canvas);
    jFrame.setVisible(true);
  }
}
