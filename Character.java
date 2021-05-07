
/**
 * Beschreiben Sie hier die Klasse Charakter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Character extends Entity
{
    private float speedY = 0;
    
    /**
     * Konstruktor für Objekte der Klasse Charakter
     */
    public Character()
    {
        xPos = 0;
        yPos = 0;
    }

    /**
     * Update jedesmal aufgerufen bei Gameloop durchlauf
     * durchfuehrung der Schwerkraftsimulation
     */
    public void update(){
       if(yPos >= GROUNDY - 100){ //100 fuer obere linke Ecke von Character
          speedY = 0;
          //Koordinate des Test-Quadrats (100x100) wird oben links gemessen
          yPos = GROUNDY - 100; 
       }
       else{
           speedY += GRAVITY; //speedY = speedY + GRAVITY
           yPos += speedY;
       }
    }
    
    public void jump(){
        speedY = -4;
        yPos+= speedY;
    }
}
