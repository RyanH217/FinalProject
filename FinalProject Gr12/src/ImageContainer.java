import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ImageContainer extends JPanel {


    private Sprite sprite;
   

    public ImageContainer() throws IOException {

        initBoard();
    }

    private void initBoard() throws IOException {

    	setLayout(null);
        sprite = new Sprite();
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(sprite.getImage(), 0, 0, this);
    }
    
    

}