
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
import java.util.Random;
public class Main extends JFrame implements ActionListener
{
	//ASD PLEASE WORK

	JButton instructions;
	JButton play;
	JButton credits;
	JButton exit;
	
	JOptionPane rules;
	
	
	private int frameHeight, frameWidth, buttonWidth, buttonHeight;
	
	public static void main (String args[])
	{
		//Pixlr for image edit
		//OpenGameArt.org
		Main main = new Main();
	}
	
	public Main()
	{
		instructions = new JButton("Instructions");
		play = new JButton("Play");
		credits = new JButton("Credits");
		exit = new JButton("Exit");
		
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setVisible(true);
		setLayout(null);
		frameHeight = getHeight();
		frameWidth = getWidth();
		
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
		
		
	}

	private void buttonSetup(JButton button)
	{
		button.setVisible(true);
		add(button);
		button.addActionListener(this);
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