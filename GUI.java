
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel.*;
import java.awt.Container.*;
import java.awt.event.*;
/**
 * Beschreiben Sie hier die Klasse GUI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GUI
{
    private JFrame fenster;
    
    /**
     * Konstruktor für Objekte der Klasse GUI
     */
    public GUI()
    {
        fensterErzeugen();
    }

    public void fensterErzeugen(){
        fenster = new JFrame("MallRider");
        
        Container contentPane = fenster.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        JButton start = new JButton("START");
        
        
        contentPane.add(start, BorderLayout.CENTER);
        
        
        fenster.pack();
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(600,200);
        fenster.setVisible(true);
        fenster.setResizable(false);
        
    }
}
