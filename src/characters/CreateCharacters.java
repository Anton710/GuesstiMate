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
                
                
                Spec_Char Goku= new Spec_Char(); 
                String attr9[] = {"Is your character's strongest form ultra instinct ? ",
                                  "IS your character's signature move spirit bomb ? ",
                                  "Is your character from Dragon Ball ?"};
                String att9[] = {"Black","Tall","M","adult","true","true","true",
                                 "true","false","Goku","DB"};
                Goku.createSpecChar(att9,attr9);
              
                
                Spec_Char Vegeta= new Spec_Char(); 
                String attr10[] = {"Is your character's strongest form Ultra Ego ? ",
                                  "IS your character's signature move final flash ? ",
                                  "Is your character from Dragon Ball ?"};
                String att10[] = {"Black","Tall","M","adult","true","true","true",
                                 "true","false","Vegeta","DB"};
                Vegeta.createSpecChar(att10,attr10);
                
                
                Spec_Char Gohan= new Spec_Char(); 
                String attr11[] = {"Is your character's strongest form Ultimate Gohan ? ",
                                  "IS your character's signature move ka-me-ha-meha ? ",
                                  "Is your character from Dragon Ball ?"};
                String att11[] = {"Black","Tall","M","adult","true","true","true",
                                 "true","false","Gohan","DB"};
                Gohan.createSpecChar(att11,attr11);
                
                
                Spec_Char Yamcha= new Spec_Char(); 
                String attr12[] = {"Is your character good at baseball ? ",
                                  "IS your character's signature move Fist of the Wolf Fang ? ",
                                  "Is your character from Dragon Ball ?"};
                String att12[] = {"Black","Tall","M","adult","false","true","true",
                                "true","false","Yamcha","DB"};
                Yamcha.createSpecChar(att12,attr12);
                
                
                Spec_Char Horikita= new Spec_Char(); 
                String attr13[] = {"Is your character the smartest ? ",
                                  "Is your character anti-social ? ",
                                  "Is your character from Classroom of the Elite ?"};
                String att13[] = {"Black","Average","F","teen","true","true","false",
                                 "false","false","Horikita","COE"};
                Horikita.createSpecChar(att13,attr13);
                
                
                Spec_Char Kushida= new Spec_Char(); 
                String attr14[] = {"Does your character have dual nature ? ",
                                  "IS your character overfriendly ? ",
                                  "Is your character from Classroom of the Elite ?"};
                String att14[] = {"Beige","Average","F","teen","false","true","false",
                                 "false","false","Kushida","COE"};
                Kushida.createSpecChar(att14,attr14);
                  Kushida.printAnime();
                
                Spec_Char Karuizawa= new Spec_Char(); 
                String attr15[] = {"Does the character have trust issues ? ",
                                 "Does the character have poor academic performance ? ",
                                  "Is your character from Classroom of the Elite ?"};
                String att15[] = {"Blonde","Average","F","teen","false","true","false",
                                 "false","false","Karuizawa","COE"};
                Karuizawa.createSpecChar(att15,attr15);
                
                
                Spec_Char Ichinose= new Spec_Char(); 
                String attr16[] = {"IS your character richest in the class ? ",
                                  "IS your character leader of class B? ",
                                  "Is your character from Classroom of the Elite ?"};
                String att16[] = {"Blonde","Average","F","teen","false","true","false",
                                 "false","false","Ichinose","COE"};
                Ichinose.createSpecChar(att16,attr16);
                
           Spec_Char Pool []= {
             Gojo,Itadori,Fushiguro,Sukuna,Zenitsu,Tanjiro,Inosuke,Nezuko,Goku,Vegeta,Gohan,Yamcha,Horikita,Kushida,Karuizawa,Ichinose
             };
              

           selectionPool= new ArrayList<>(Arrays.asList(Pool));
                  
               //selectionPool[7].printAnime();
                
    
}
    }
    
