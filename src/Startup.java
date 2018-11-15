
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Startup
{
	public static JFrame jf; //Frame on which the game is located
	public static JLabel jl; //Label to display current turn
	public static Map op; //Panel which handles drawing and input
	public static JButton reset; //Button for resetting game
	
	public static void main(String[] args)
	{
		jf = new JFrame("SideScroller"); //Initialize components
		jl = new JLabel("Level 1");
		op = new Map();
		reset = new JButton("Retry");
		
		op.setPreferredSize(new Dimension(1200, 600)); //Set sizes
		jl.setSize(800, 20);
		reset.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				reset();
			}
		});

		jf.add(op, BorderLayout.NORTH); //Add components to frame
		jf.add(jl, BorderLayout.CENTER);
		jf.add(reset, BorderLayout.SOUTH);

		jf.revalidate(); //Validate component hierarchy
		jf.pack(); //Size frame to fit components
		jf.setFocusTraversalKeysEnabled(true); //Allow key traversal
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set up close operation
		reset();	//Reset initial variables
		jf.setVisible(true); //Set visible
	}
	
	public static void reset()
	{
		
	}
	}
