
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Map extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Color blackground = new Color(118, 117, 116); //Color of the background
	private static Color whiteground = new Color(207, 206, 203);
	
	//Default constructor
	public Map()
	{
		MapHandler mHandler = new MapHandler(); //Initialize handler
		addKeyListener(mHandler); //Add handlers
		addMouseListener(mHandler);
		setFocusable(true); //Allow focus
		setBackground(whiteground);
	}

	//Override painting method for unique drawing
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g); //Call super to paint on frame
		Graphics2D g2d = (Graphics2D) g; //Establish better graphics system
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Enable antialiasing

		drawGrid(g2d);
		drawPieces(g2d);
	}
	
	//Draws in circles for the pieces depending on what the grid contains
	private void drawPieces(Graphics2D g2d)
	{
	
	}

	//Draws in the grid to establish that checkerboard pattern
	private void drawGrid(Graphics2D g2d)
	{
		g2d.setColor(whiteground);
		
		
	}

	/*
	 * This private class does all the input handling for the Chess Handling It
	 * will also likely control repaint rate KeyListening may prove to be pointless
	 */
	private class MapHandler implements KeyListener, MouseListener
	{
		//@formatter:off
		// keyListener methods
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}

		public void keyTyped(KeyEvent e)
		{
		}

		// mouseListener methods
		public void mouseClicked(MouseEvent e)
		{	
			
			repaint();
		}
		
		
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		//@formatter:on
	}
}