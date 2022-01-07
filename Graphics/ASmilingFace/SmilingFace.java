//Graphics A Smilling Face 40 points Allen Hung
import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
    public void paint (Graphics g)
    {
        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
        // lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical

        g.setColor(Color.yellow);
        g.fillOval(100,100,460,460);
        g.setColor(Color.blue);
        g.fillOval(200,250,60,60);
        g.setColor(Color.blue);
        g.fillOval(400,250,60,60);
        g.setColor(Color.red);
        g.drawArc(200,400,250,80,0,-180);

    }
    public static void main( String[] args )
	{
		JFrame win = new JFrame("SmilingFace");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SmilingFace canvas = new SmilingFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
