import java.awt.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.Random;
public class Main extends JFrame implements ActionListener
{

	JButton instructions;
	JButton play;
	JButton credits;
	JButton exit;


	JLayeredPane layers;
	ImageContainer background;
	
	JOptionPane rules;

	private int frameHeight, frameWidth, buttonWidth, buttonHeight;

	public static void main (String args[]) throws IOException
	{
		//Pixlr for image edit
		//OpenGameArt.org
		Main main = new Main();
	}

	public Main() throws IOException
	{
		setUndecorated(true);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setVisible(true);
		setLayout(null);
		frameHeight = getHeight();
		frameWidth = getWidth();
		

		instructions = new JButton("Instructions");
		play = new JButton("Play");
		credits = new JButton("Credits");
		exit = new JButton("Exit");
		layers = new JLayeredPane();
		background = new ImageContainer(frameWidth,frameHeight);
	
		layers.add(background, 2,-1);
		layers.setLayout(null);
		layers.setBounds(0,0,frameWidth,frameHeight);

		buttonWidth = (int)(frameWidth/10.0);
		buttonHeight =(int)(frameHeight/10.0);
		
		play.setBounds(frameWidth/2-buttonWidth/2, buttonHeight*2, buttonWidth, buttonHeight);
		instructions.setBounds(frameWidth/2-buttonWidth/2, buttonHeight*4, buttonWidth, buttonHeight);
		credits.setBounds(frameWidth/2-buttonWidth/2, buttonHeight*6, buttonWidth, buttonHeight);
		exit.setBounds(frameWidth/2-buttonWidth/2, buttonHeight*8, buttonWidth, buttonHeight);
		buttonSetup(play);
		buttonSetup(instructions);
		buttonSetup(credits);
		buttonSetup(exit);

		add(layers);
		background.repaint();
		
		

	}

	private void buttonSetup(JButton button)
	{
		button.setOpaque(true);
		button.setVisible(true);
		button.addActionListener(this);
		layers.add(button, 2, 0);
	
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String buttonType = e.getActionCommand();

		if (buttonType.equals("Play"))
		{
			//RUN THE GAME
		}
		else if (buttonType.equals("Instructions"))
		{
			JOptionPane.showMessageDialog(this, "INSERT INSTRUCTIONS FOR GAME");
		}
		else if (buttonType.equals("Credits"))
		{
			JOptionPane.showMessageDialog(this, "Menu by: Ilan Truanovsky");
		}
		else if (buttonType.equals("Exit"))
		{
			System.exit(0);
		}

	}

}