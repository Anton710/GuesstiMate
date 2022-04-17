
package Main;
import characters.*;
import java.util.*;

public class Tester {
    public static void main(String args[]) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
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
                Spec_Char Gojo= new Spec_Char(); 
                String attr1[] = {"true","true","true","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false"};
                String att1[] = {"white","tall","M","adult","false","true","true","true","false","false","true","false"};
                Gojo.createSpecChar(att1, attr1);
                Gojo.printAnime();


                Spec_Char Itadori= new Spec_Char(); 
                String attr2[] = {"false","false","false","true","true","true","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false"};
                String att2[] = {"Pink","tall","M","adult","false","true","true","true","false","false","false","false"};
                Itadori.createSpecChar(att2, attr2);
                //Itadori.printAnime();

                Spec_Char Fushiguro= new Spec_Char(); 
                String attr3[] = {"false","false","false","false","false","false","true","true","true","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false"};
                String att3[] = {"Black","tall","M","adult","true","true","true","true","false","false","false","false"};
                Fushiguro.createSpecChar(att3,attr3);
                //Fushiguro.printAnime();

                Spec_Char Sukuna= new Spec_Char(); 
                String attr4[] = {"false","false","false","false","false","false","false","false","false","true","true","false","false","false","false","false","false","false","false","false","false","false","false","false"};
                String att4[] = {"Pink","tall","M","adult","false","false","true","true","false","false","false","true"};
                Sukuna.createSpecChar(att4,attr4);
                 //Sukuna.printAnime();

                Spec_Char Zenitsu= new Spec_Char(); 
                String attr5[] = {"false","false","false","false","false","false","false","false","false","false","false","true","true","true","true","false","false","false","false","false","false","false","false","false"};
                String att5[] = {"Yellow","Average","M","teen","false","true","true","true","false","false","false","false"};
                Zenitsu.createSpecChar(att5,attr5);
                //Zenitsu.printAnime();


                Spec_Char Tanjiro= new Spec_Char(); 
                String attr6[] = {"false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","true","true","true","false","false","false","false","false","false"};
                String att6[] = {"Black","Average","M","teen","true","true","true","true","false","false","false","true"};
                Tanjiro.createSpecChar(att6,attr6);
                //Tanjiro.printAnime();


                Spec_Char Inosuke= new Spec_Char(); 
                String attr7[] = {"false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","true","true","true","false","false","false"};
                String att7[] = {"Black","Average","M","teen","false","true","true","true","false","true","false","false"};
                Inosuke.createSpecChar(att7,attr7);
                //Inosuke.printAnime();


                Spec_Char Nezuko= new Spec_Char(); 
                String attr8[] = {"false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","true","true","true"};
                String att8[] = {"Black","Average","F","adult","true","false","true","true","true","false","false","false"};
                Nezuko.createSpecChar(att8,attr8);
                //Nezuko.printAnime();
        
           }
           else if("Series".equalsIgnoreCase(inp2))
           {

           }
           else 
                System.out.println("Invalid entry!!");
        }
        else 
            System.out.println("Invalid Entry!! Try Again");
        
}}
