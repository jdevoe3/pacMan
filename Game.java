import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class Game extends JPanel implements ActionListener{

    private Dimension d;
    private Font font = new Font("Arial", Font.BOLD, 14);
    private boolean inGame = false;
    private boolean dead = false;

    private final int BLOCK_SIZE = 22;
    private final int X_BLOCKS = 15;
    private final int SIZE = BLOCK_SIZE * X_BLOCKS;
    private final int MAX_GHOSTS = 15;
    private final int PAC_SPEED = 6; 

    private int numGhosts = 5;
    private int lives, score;
    private int [] dx, dy;
    private int[] ghostX, ghostY, ghostDX, ghostDY, ghostSpeed;

    private Image heart, ghost;
    private Image up, down, left, right;

    private int pacmanX, pacmanY, pacmanDX, pacmanDY;
    private int reqDX, reqDY;

    private final int validSpeeds[] = {1,2,3,4,5,6};
    private final int maxSpeed = 6;
    private int currentSpeed = 1;
    private short[] screenData;
    private Timer timer;

    private final short levelData[] = {

    }

    public Game(){
        loadImages();
        initializeVariables();
        addKeyListener(newTAdapter());
        setFocusable(true);
        inititializeGame();
    }

    private void loadImages(){
        down = new ImageIcon("Images/down".getImage());
        up = new ImageIcon("Images/up".getImage());
        left = new ImageIcon("Images/left".getImage());
        right = new ImageIcon("Images/right".getImage());
        ghost = new ImageIcon("Images/ghost".getImage());
        heart = new ImageIcon("Images/heart".getImage());
    }

    private void initializeVariables(){
        
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
