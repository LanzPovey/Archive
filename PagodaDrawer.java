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
private ArrayList<