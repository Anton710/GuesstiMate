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
    public String name="";
    public String animeName="";
    
    /*
    What is your character's gender?
    What is your character's hairColor?
    What is your character's age?
    Does your character have any siblings?
    Is your character human?
    Does your character have superpower?
    Is your character a fighter?
    What is your character's height?
    Does your character have any
    What is your character's
    What is your character's
    */
    public String genAttributes[]= {"gender","hairColor","age","sibling","human","superpower","fighter",
    "height","deformities","name","animeName"};
    
    public String genQuestions[]= {"Is your character male or female?" ,
                                   "What is the hair color of your character?",
                                   "What is the age of your character?",
                                   "Does your character have any siblings? ",
                                   "Is your character human or not?" ,                             
                                   "Does your character have superpowers? ",
                                   "Is the character a fighter or not?",
                                   "What is the height of your character?",
                                   "Does your character have any deformities?"};
    
    
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
       for(int i= 0;i<genQuestions.length; i++)
           System.out.println(genQuestions[i]);
      
       for (Field li1 : li) {
           String field= li1.toString();
           int ind = field.lastIndexOf(".");
           String member = field.substring(ind+1);
           System.out.println(member + ": " + li1.get(this));
       }
      
             
   }
//    
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
        this.name=attributes[9];
        this.animeName=attributes[10];
        
    }
}
