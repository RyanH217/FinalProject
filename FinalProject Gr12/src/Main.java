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
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setVisible(true);
		setLayout(null);
		frameHeight = getHeight();
		frameWidth = getWidth();
		
		instructions = new JButton("Instructions");
		play = new JButton("Play");
		credits = new JButton("Credits");
		exit = new JButton("Exit");



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
		
		
		add(new ImageContainer(frameWidth,frameHeight));



	}

	private void buttonSetup(JButton button)
	{
		button.setVisible(true);
		add(button);
		button.addActionListener(this);
		button.setFocusable(true);
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