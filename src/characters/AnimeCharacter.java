package characters;

import java.lang.reflect.Field;

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
    public String genQuestions[]= {};
    
    
    public void changeAttribute(String fieldName, String value) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
     this.getClass().getField(fieldName).set(this, value);   
    }
    
    public void changeAttribute(String fieldName, boolean value) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
            this.getClass().getField(fieldName).set(this, value);
    }
    
    public void changeAttribute(String fieldName, char value) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
            this.getClass().getField(fieldName).set(this, value);
    }
    
    public void changeAttribute(String fieldName, int value) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
            this.getClass().getField(fieldName).set(this, value);
    }
    
    public void printAnime() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
      Field li[]= this.getClass().getFields();
        for (Field li1 : li) {
            String field= li1.toString();
            int ind = field.lastIndexOf(".");
            String member = field.substring(ind+1);
            System.out.println(member + ": " + li1.get(this));
        }
    }
    
    public void createCharacter(String attributes[])
    {
        this.hairColor= attributes[0];
        this.height= attributes[1];
        this.gender= attributes[2].charAt(0);
        this.age= attributes[3];
        this.sibling= Boolean.parseBoolean(attributes[4]);
        this.human= Boolean.parseBoolean(attributes[5]);
        this.superpower= Boolean.parseBoolean(attributes[6]);
        this.fighter= Boolean.parseBoolean(attributes[7]);
        this.deformities= Boolean.parseBoolean(attributes[8]);
        this.mask= Boolean.parseBoolean(attributes[9]);
        this.blinds= Boolean.parseBoolean(attributes[10]);
        this.mark= Boolean.parseBoolean(attributes[11]);
    }
}
