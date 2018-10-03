
package GUI;


import Model.EnemyShip;
import Model.PlayerShip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame
{
    public Main() 
    {
        initComponents();
        setLookAndFeel();               
    }
    
    private void initComponents()
    {
        this.setSize(400, 428);
        this.setTitle("Senven Sea");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel()
        {          
          Image image = Toolkit.getDefaultToolkit().createImage("Image\\Background.png");          
          @Override
          public void paintComponent(Graphics g)
          {
            super.paintComponent(g);
            if (image != null)

            {
                g.drawImage(image, 0, 0, this);
            }              
          }
        };
        panel.setSize(400, 400);
        this.add(panel);
        
        PlayerShip player = new PlayerShip(new ImageIcon("Image/Player_1.png"), 80, 160);
        EnemyShip en_1 = new EnemyShip(new ImageIcon("Image//Enemy.png"), 240, 0);
        EnemyShip en_2 = new EnemyShip(new ImageIcon("Image//Enemy.png"), 240, 0);
        this.add(player);
        this.add(en_2);
        this.add(en_1);
        panel.setLayout(null);
        
    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Main().setVisible(true);
            }
        });
    }
    
    private void setLookAndFeel()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
    }    
    
}
