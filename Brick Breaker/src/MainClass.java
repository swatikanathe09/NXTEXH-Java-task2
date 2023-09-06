import javax.swing.JFrame;
public class MainClass {
    public static void main(String args[])
    {
        JFrame obj = new JFrame();
        GamePlay gamePlay= new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Welcome TO Brick Breaker Game....Let's Start");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        gamePlay.requestFocus(); 
    }
}
