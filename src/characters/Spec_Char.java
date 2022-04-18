
package characters;

import java.lang.reflect.Field;


public class Spec_Char extends AnimeCharacter{
    
    public Spec_Char()
    {
        super();
    }
   
 
    public String specQuestion[]=new String[3];
    
    
    public void createSpecChar(String attributes1[], String attributes[])
    {
        super.createCharacter(attributes1);
        
        this.specQuestion[0]= attributes[0];
        this.specQuestion[1]= attributes[1];
        this.specQuestion[2]= attributes[2];
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
