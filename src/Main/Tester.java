/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import characters.*;

/**
 *
 * @author rajaa
 */
public class Tester {
    public static void main(String args[]) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        AnimeCharacter ac= new AnimeCharacter();
        AnimeCharacter dc= new AnimeCharacter();
        System.out.println("hi "+ac.mask+" "+dc.mask);
        ac.changeAttribute("mask", true);
        System.out.println("bye "+ac.mask+" "+dc.mask);
        String attr[]= {"white","tall","M","adult","false","true","true","true","false","false","true","false"};
        AnimeCharacter gojo= new AnimeCharacter();
        gojo.createCharacter(attr);
        gojo.printAnime();
        
        
    }
}
