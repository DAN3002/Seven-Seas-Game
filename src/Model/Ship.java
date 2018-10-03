
package Model;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Ship extends JLabel
{
    public Ship(Icon image, int x, int y) 
    {
        super(image);
        this.setVisible(true);
        this.setSize(80,80);
        moveTo(x, y);
    }
    
    public Boolean wasDie()
    {        
        Boolean out = false;
        try 
        {
            Icon ico = this.getIcon();
        } catch (Exception e) 
        {
            out =  true;                            
        }
        return out;
    }
    
    public void moveTo(int x, int y)
    {
        this.setLocation(x, y);
    }
    
    public void kill()
    {
        this.setIcon(null);
    }
    
    public void crashIsland()
    {
        if(this.getX() == 160 && this.getY() == 160)
        {
            kill();
        }
    }
    
}
