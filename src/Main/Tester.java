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
    public static void main(String args[])
    {
        AnimeCharacter ac= new AnimeCharacter();
        ac.printAnime();
        System.out.println("hi "+ac.hairColor);
        ac.changeAttribute("hairColor", "white");
        System.out.println("bye "+ac.hairColor);
    }
}
