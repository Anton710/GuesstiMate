/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import characters.*;
import java.util.*;
import jdk.jshell.spi.SPIResolutionException;

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
                //System.out.println("here"+cc.selectionPool.get(0).age);
                ArrayList<Spec_Char> sp = (ArrayList)cc.selectionPool.clone();
                
                boolean found = false;
                
                String max="";
                int i = 0;
                while(!found){
                    HashMap<String,Integer> specify = new HashMap<String,Integer>();
                    if( i==ac.genQuestions.length){
                        temp.printAnime();
                        System.out.println("remaining: "+ sp.size());
                        break;
                    }
                    else if(max.isEmpty()&& i!= ac.genQuestions.length){
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
                            
                            String input= sc.next();
                            temp.changeAttribute(test, input);

                        }
                        else 
                        {
                            char input= sc.next().charAt(0);
                            temp.changeAttribute(test, input);

                        }
                        for(Spec_Char c : cc.selectionPool){
                            
                            if( !temp.getClass().getField(test).get(temp).
                                   toString().equalsIgnoreCase
                                  (c.getClass().getField(test).get(c).toString())){
                                
                                sp.remove(c);
                                if(sp.size()==1){
                                    if( sp.get(0).getClass().getField(test).get(sp.get(0))
                                        .toString().equalsIgnoreCase(temp.getClass().getField(test)
                                                .get(temp).toString())){
                                    found = true;
                                    System.out.println("Answer : ");
                                    //sp.get(0).printAnime();
                                    System.out.println(sp.get(0).name);
                                    System.out.println(sp.get(0).animeName);
                                    break;
                                }
                                }
                                if(sp.isEmpty()){
                            found = true;
                            System.out.println("No character found");
                            break;
                        }
                              
                            }
                            
                        }
                        
                        for(Spec_Char c : sp){
                            if( temp.getClass().getField(test).get(temp).
                                   toString().equalsIgnoreCase
                                  (c.getClass().getField(test).get(c).toString())){
                            if(specify.containsKey(c.animeName)){
                                    specify.put(c.animeName,specify.get(c.animeName)+1);
                                }else{
                                    specify.put(c.animeName,1);
                                }
                            }
                        }
                        for(String s : specify.keySet()){
                            System.out.println( s + " "+ specify.get(s));
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
