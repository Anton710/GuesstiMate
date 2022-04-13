package characters;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimeCharacter extends FictionalCharacter{
    
    public AnimeCharacter()
    {
        super();
        super.anime= true;
    }
    
    public String hairColor= "";
    public String height= "";
    public char gender= '\u0000';
    public String age= "adult";
    public boolean sibling= false;
    public boolean human= true;
    public boolean superpower= true;
    public boolean fighter= true;
    public boolean deformities= false;
    public boolean mask= false;
    public boolean blinds= false;
    public boolean mark= false;
    
    
    public void changeAttribute(String fieldName, String value)
    {
        
        try {
            this.getClass().getField(fieldName).set(this, value);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeAttribute(String fieldName, boolean value)
    {
        
        try {
            this.getClass().getField(fieldName).set(this, value);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeAttribute(String fieldName, char value)
    {
        
        try {
            this.getClass().getField(fieldName).set(this, value);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeAttribute(String fieldName, int value)
    {
        
        try {
            this.getClass().getField(fieldName).set(this, value);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void printAnime()
    {
        System.out.println("Res:: " + this.anime);
        try {
            System.out.println(this.getClass().getField("mask").getBoolean(this));
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AnimeCharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
