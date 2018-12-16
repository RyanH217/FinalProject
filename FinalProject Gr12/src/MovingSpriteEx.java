
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

public class MovingSpriteEx extends JFrame {

    public MovingSpriteEx() throws IOException{
        
        initUI();
    }
    
    private void initUI() throws IOException{
        setLayout(null);
        add(new ImageContainer(1000,1000));

        setTitle("Moving sprite");
        setSize(400, 300);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException{

			    MovingSpriteEx ex = new MovingSpriteEx();
			    ex.setVisible(true);

    }
}