import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PagodaDrawing extends JPanel
{
private int initialX;
private int initialY; //Top of the bottom rectangle
private int initialHeight; //Height for the bottom rectangle
private double scale; //Amount to reduce each layer
private boolean isRenderable;
private ArrayList<Rectangle> recs;

public static void main(String[] args) {
    PagodaDrawing obj1 = new PagodaDrawing();
    obj1.start();
    
    
}

public void start()
{
    PagodaDrawer(10,10,10,2);
}

public void PagodaDrawer(int initialX, int initialY, int initialHeight, double scaleFactor)
{
    this.initialX = initialX;
    this.initialY = initialY;
    this.initialHeight = initialHeight;
    scale = scaleFactor;
    isRenderable = false;
    recs = new ArrayList<Rectangle>();
}

public void drawPagoda()
{
    drawLayer(initialX, initialY, 2 * initialHeight, initialHeight);
}

public void drawLayer(double x, double y, double width, double height)
{
    if(y < 0 || height < 5) //If off the top of the screen, or less than 5 tall
    {
        isRenderable = true;
        return;
    }
    drawLayer(x + .5 * (width - (width * scale)), y - (height * scale), width * scale, height * scale );
    Rectangle r = new Rectangle((int)x, (int)y, (int)(2 * height), (int)height);
    recs.add(r);
}

public void paintComponent(Graphics g)
{
    if(!isRenderable)
        return;
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    for(int i = 0; i < recs.size(); i++)
    {
        g2.draw(recs.get(i));
        System.out.println(recs.get(i));
    }
}

public class DisplayComponent extends JFrame
{
private static final long serialVersionUID = -4279682826771265863L;
private static final int FRAME_WIDTH = 500;
private static final int FRAME_HEIGHT = 500;

private JPanel panel;
private PagodaDrawing p;

public DisplayComponent(int initialHeight, double scaleFactor)
{
    //p = new PagodaDrawing(FRAME_WIDTH / 2, FRAME_HEIGHT, initialHeight, scaleFactor);
    panel = new JPanel();
    p.drawPagoda();
    add(p);

    pack();



    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setVisible(true);
}
}
}