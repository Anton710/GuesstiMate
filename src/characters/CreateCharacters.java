/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characters;
import java.util.*;
/**
 *
 * @author rajaa
 */
public class CreateCharacters {
   public ArrayList<Spec_Char> selectionPool;
    public CreateCharacters() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
                
                Spec_Char Gojo= new Spec_Char(); 
                String attr1[] = {"Is your character supposedly the strongest ?", 
                                  "Does the character wear blindfolds ? ",
                                  "Is your character from Jujutsu Kaisen?"};
                
                String att1[] = {"white","tall","M","adult","false","true","true",
                                 "true","false","Gojo","JJK"};
                Gojo.createSpecChar(att1, attr1);
               // Gojo.printAnime();


                Spec_Char Itadori= new Spec_Char(); 
                String attr2[] = {"Is your character a vessel? ", 
                                  "Does the character eat fingers ?",
                                  "Is your character from Jujutsu Kaisen?"};
                String att2[] = {"Pink","tall","M","teen","false","true","true",
                                 "true","false","Itadori","JJK"};
                Itadori.createSpecChar(att2, attr2);
                //Itadori.printAnime();

                Spec_Char Fushiguro= new Spec_Char(); 
                String attr3[] = {"Does the character belong to zenin clan ? ",
                                  "Can your character summon a shikigami ? ",
                                  "Is your character from Jujutsu Kaisen?"};
                String att3[] = {"Black","tall","M","teen","true","true","true",
                                 "true","false","Megumi","JJK"};
                Fushiguro.createSpecChar(att3,attr3);
                //Fushiguro.printAnime();

                Spec_Char Sukuna= new Spec_Char(); 
                String attr4[] = {"Is your character a special grade spirit ? ",
                                  "Is the character also known as King of curses ? ",
                                  "Is your character from Jujutsu Kaisen?"};
                String att4[] = {"Pink","tall","M","adult","false","false","true",
                                 "true","false","Sukuna","JJK"};
                Sukuna.createSpecChar(att4,attr4);
                 //Sukuna.printAnime();

                Spec_Char Zenitsu= new Spec_Char(); 
                String attr5[] = {"Is your character a crybaby ? ",
                                  "Does your character associated with lightning ? ",
                                  "Is your character from Demon Slayer?"};
                String att5[] = {"Yellow","Average","M","teen","false","true"
                                 ,"true","true","false","Zenitsu","KNY"};
                Zenitsu.createSpecChar(att5,attr5);
                //Zenitsu.printAnime();


                Spec_Char Tanjiro= new Spec_Char(); 
                String attr6[] = {"Is your character a user of sun and water both ? ",
                                  "Does your character have heightened sense of smell ? ",
                                  "Is your character from Demon Slayer?"};
                String att6[] = {"Black","Average","M","teen","true","true","true",
                                 "true","false","Tanjiro","KNY"};
                Tanjiro.createSpecChar(att6,attr6);
                //Tanjiro.printAnime();


                Spec_Char Inosuke= new Spec_Char(); 
                String attr7[] = {"Does the character fight with two swords ? ",
                                  "Is the character associated with beast breathing Tchnique ? ",
                                  "Is your character from Demon Slayer?"};
                String att7[] = {"Black","Average","M","teen","false","true","true",
                                 "true","false","Inosuke","KNY"};
                Inosuke.createSpecChar(att7,attr7);
                //Inosuke.printAnime();


                Spec_Char Nezuko= new Spec_Char(); 
                String attr8[] = {"Does the character stay inside a box ? ",
                                  "IS your character vulnerable to sunlight ? ",
                                  "Is your character from Demon Slayer?"};
                String att8[] = {"Black","Average","F","teen","true","false","true",
                                 "true","true","Nezuko","KNY"};
                Nezuko.createSpecChar(att8,attr8);
                //Nezuko.printAnime();
                
           Spec_Char Pool []= {
             Gojo,Itadori,Fushiguro,Sukuna,Zenitsu,Tanjiro,Inosuke,Nezuko
             };
              

           selectionPool= new ArrayList<>(Arrays.asList(Pool));
                  
               //selectionPool[7].printAnime();
                
    
}
    }
    
