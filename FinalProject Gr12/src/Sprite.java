import java.awt.*;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Sprite
{
	 private int dx;
	    private int dy;
	    private int x = 40;
	    private int y = 60;
	    private int w;
	    private int h;
	    private ImageIcon image;
	    Image newImage;
	    
	    
	    public Sprite(int width, int height) throws IOException {
	    	this.w = width;
	    	this.h = height;
	        loadImage();
	    }

	    private void loadImage() throws IOException {
	        
	    	image = new ImageIcon("src/resources/sea.jpg");
	    	newImage = image.getImage().getScaledInstance(w, h, Image.SCALE_FAST);
	    }
	

	    public int getX() {
	        
	        return x;
	    }

	    public int getY() {
	        
	        return y;
	    }
	    


	    public Image getImage() {
	        
	        return newImage;
	    }
}