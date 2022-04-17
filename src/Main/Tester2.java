/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import characters.*;
import java.util.*;

/**
 *
 * @author rajaa
 */
public class Tester2 {
    
    public static void main(String args[]) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
       
//      System.out.print(ac.genQuestions[0]);
       
        Scanner sc = new Scanner(System.in);
        String inp1,inp2;
        System.out.println("Is your character Real or Fictional ?");
        inp1 = sc.nextLine();
        
        if ("Real".equalsIgnoreCase(inp1))
        { 
            
        }
        else if("Fictional".equalsIgnoreCase(inp1))
        {
           System.out.println("Is your character from an anime or series ?");
           inp2 = sc.nextLine();
           if ("Anime".equalsIgnoreCase(inp2))
           {   
                AnimeCharacter ac= new AnimeCharacter();
                Spec_Char temp = new Spec_Char();
                CreateCharacters cc= new CreateCharacters();
                System.out.println("here"+cc.selectionPool.get(0).age);
                boolean found = false;
                
                String max="";
                int i = 0;
                while(!found){
                    if( i==ac.genQuestions.length-3){
                        temp.printAnime();
                        break;
                    }
                    else if(max.isEmpty()&& i!= ac.genQuestions.length-3){
                        System.out.println(ac.genQuestions[i]);
                        String test = ac.genAttributes[i];
                        String attribute=temp.getClass().getField(test).getType().toString();
                        String type= attribute.substring(attribute.lastIndexOf(".")+1);
                        System.out.println(test+"= "+type);
                        if(type.equals("boolean"))
                        {
                            boolean input= sc.nextBoolean();
                             temp.changeAttribute(test, input);

                        }
                        else if(type.equals("String"))
                        {
                            System.out.println(" we are here sirji");
                            String input= sc.next();
                            temp.changeAttribute(test, input);

                        }
                        else 
                        {
                            char input= sc.next().charAt(0);
                            temp.changeAttribute(test, input);

                        }
                        i++;
                    }else{
                        
                    }
                    
                    
                }
        
           }
           else if("Series".equalsIgnoreCase(inp2))
           {

           }
           else 
                System.out.println("Invalid entry!!");
        }
        else 
            System.out.println("Invalid Entry!! Try Again");
        

    
    }
    
}
