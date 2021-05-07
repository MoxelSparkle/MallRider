import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 * Beschreiben Sie hier die Klasse Resource.
 * 
 * @author Emma Holtz und Karl Konrad Hanka
 * @version Prototyp 1 7.5.2021
 */
public class Resource
{
    public static BufferedImage getResourceImage(String name)
    {
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("images/" + name));
        } catch(IOException ex){
            ex.printStackTrace();
        }
        return img;
    }
}
