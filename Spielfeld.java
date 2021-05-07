import java.awt.event.KeyListener;
import java.awt.*;  
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
/**
 * Beschreiben Sie hier die Klasse Spielfeld.
 * 
 * @author Emma Holtz und Karl Konrad Hanka 
 * @version Prototyp 1 7.5.2021
 */
public class Spielfeld implements KeyListener
{
    private Character character;
    //Hintergrundbild
    private BufferedImage bg = Resource.getResourceImage("smile.png");
    
    static int GROUNDY = 190;
    
    static int GRAVITY = 4;
    public Spielfeld()
    {
        //character = new Character();
        //In der Gui das als Eventlistener hinzufügen
    }
    
    public void keyReleased(KeyEvent e)
    {}
    
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_W)
        {
             //Hauptfigur Koordinaten werden geändert
             //character.jump();
        }
        if(e.getKeyCode() == KeyEvent.VK_S)
        {
            //Hauptfigur Koordinaten werden geändert
            //Hauptfigur Bild wird geändert
        }
    }
    
    public void keyTyped(KeyEvent e)
    {}
}
