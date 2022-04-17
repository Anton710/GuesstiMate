
package characters;

import java.lang.reflect.Field;


public class Spec_Char extends AnimeCharacter{
    
    public Spec_Char()
    {
        super();
    }
    //gojo
    public boolean strongest= false;
    public boolean blindfolds= false;
//    public boolean infinity= true;
    String GojoSpecQuestions[]= {"Is your character supposedly the strongest ?", 
                                   "Does the character wear blindfolds ? "};
    
    //itadori
//    public boolean superhuman_strength= true;
    public boolean vessel= false;
    public boolean eatfingers= false;
    String ItadoriSpecQuestions[]= {"Is your character a vessel? ", 
                                  "Does the character eat fingers ?"};
    //fushiguro
    public boolean zenin= false;
    public boolean shikigami= false;
//    public boolean shadow= false;
    String FushiguroSpecQuestions[]= {"Does the character belong to zenin clan ? ",
                                    "Can your character summon a shikigami ? "};
            
    //sukuna
    //public boolean vengeful= false;
    public boolean special_grade= false;
    public boolean king= false;
    String SukunaSpecQuestions[]= {"Is your character a special grade spirit ? ",
                                     "Is the character also known as King of curses ? "};
    
    //zenitsu
    public boolean crybaby= false;
    public boolean lightning_bolts= false;
//    public boolean hearing= false;
//    public boolean thunder= false;
    String ZenitsuSpecQuestions[]= { "Is your character a crybaby ? ",
                                   "Does your character associated with lightning ? "};
    
    //tanjiro
    public boolean water_sun= false;
    public boolean smell= false;
//    public boolean water_breathing= false;
        String TanjiroSpecQuestions[]= { "Is your character a user of sun and water both ? ",
                                     "Does your character have heightened sense of smell ? "};

    
    //inosuke
//    public boolean others_name= false;
    public boolean two_swords= false;
    public boolean beast_breathing= false;
        String InosukeSpecQuestions[]= { "DOes the character fight with two swords ? ",
                                    "Is the character associated with beast breathing Tchnique ? "};

    
    //nezuko
    public boolean box= false;
    public boolean sunlight= false;
//    public boolean blood_demon= false;
    //public boolean explode= false;
        String NezukoSpecQuestions[]= {"Does the character stay inside a box ? ",
                                     "IS your character vulnerable to sunlight ? "};

    
//    public String specQuestions[]= {"Is your character supposedly the strongest ?", 
//                                     "Does the character wear blindfolds ? ",
//                                     "Is the character associated with Infinity ? ",
//                                     "Does your character have superhuman strength ? ",
//                                     "Is your character a vessel? ", 
//                                     "Does the character eat fingers ?",
//                                     "Does the character belong to zenin clan ? ",
//                                     "Can your character summon a shikigami ? ",
//                                     "Is the character associated with Ten shadow technique ? ",
//                                     "Is your character a special grade spirit ? ",
//                                     "Is the character also known as King of curses ? ",
//                                     "Is your character a crybaby ? ",
//                                     "Does your character associated with lightning ? ",
//                                     "Does your character have heightened sense of hearing ?",
//                                     "Is the character associated with Thunder breathing Tchnique ? ",
//                                     "Is your character a user of sun and water both ? ",
//                                     "Does your character have heightened sense of smell ? ",
//                                     "Is the character associated with Water breathing Tchnique ?",
//                                     "Does the character have trouble remembering others name? ",
//                                     "DOes the character fight with two swords ? ",
//                                     "Is the character associated with beast breathing Tchnique ? ",
//                                     "Does the character stay inside a box ? ",
//                                     "IS your character vulnerable to sunlight ? ",
//                                     "Is your character associated with blood demon art ? "}; 

    public void createSpecChar(String attributes1[], String attributes[])
    {
        super.createCharacter(attributes1);
        this.strongest=Boolean.parseBoolean(attributes[0]);
        this.blindfolds= Boolean.parseBoolean(attributes[1]);
//        this.infinity= Boolean.parseBoolean(attributes[2]);
//        this.superhuman_strength= Boolean.parseBoolean(attributes[3]);
        this.vessel= Boolean.parseBoolean(attributes[4]);
        this.eatfingers= Boolean.parseBoolean(attributes[5]);
        this.zenin= Boolean.parseBoolean(attributes[6]);
        this.shikigami= Boolean.parseBoolean(attributes[7]);
//        this.shadow= Boolean.parseBoolean(attributes[8]);
        this.special_grade= Boolean.parseBoolean(attributes[9]);
        this.king= Boolean.parseBoolean(attributes[10]);
        this.crybaby= Boolean.parseBoolean(attributes[11]);
        this.lightning_bolts= Boolean.parseBoolean(attributes[12]);
//        this.hearing= Boolean.parseBoolean(attributes[13]);
//        this.thunder= Boolean.parseBoolean(attributes[14]);
//        this.water_fire= Boolean.parseBoolean(attributes[15]);
        this.smell= Boolean.parseBoolean(attributes[16]);
//        this.water_breathing= Boolean.parseBoolean(attributes[17]);
//        this.others_name= Boolean.parseBoolean(attributes[18]);
        this.two_swords= Boolean.parseBoolean(attributes[19]);
        this.beast_breathing= Boolean.parseBoolean(attributes[20]);
        this.box= Boolean.parseBoolean(attributes[21]);
        this.sunlight= Boolean.parseBoolean(attributes[22]);
//        this.blood_demon= Boolean.parseBoolean(attributes[23]);
    }

    @Override
    public void printAnime() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
      Field li[]= this.getClass().getFields();
      
      //Not needed - for testing purpose only
//        for(int i= 0;i<genQuestions.length; i++)
//            System.out.println(genQuestions[i]);
//        for(int i= 0;i<specQuestions.length; i++)
//            System.out.println(specQuestions[i]);
       
        for (Field li1 : li) {
            String field= li1.toString();
            int ind = field.lastIndexOf(".");
            String member = field.substring(ind+1);
            System.out.println(member + ": " + li1.get(this));
        }
        
        

       
              
    }
    
    
}
