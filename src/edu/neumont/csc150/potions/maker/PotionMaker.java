/**
 * @author zdyse
 * @createdOn 3/2/2023 at 1:51 PM
 * @projectName OOPFinal
 * @packageName edu.neumont.csc150.potions.maker;
 */
package edu.neumont.csc150.potions.maker;

import edu.neumont.csc150.Console;

import java.util.ArrayList;
import java.util.List;

public class PotionMaker {
    //TODO: update UML as we go
    List<String> potions = new ArrayList<>();

    public static void run(){
        int x = 0;
        while (x == 0){
            int y = Console.getIntInput("What would you like to do?" +
                    "\n1 : Make a potion with a single effect" +
                    "\n2 : Make a potion with 2 effects" +
                    "\n3 : make a potion with 3 effects" +
                    "\n4 : Make a random potion" +
                    "\n5 : Make a random number of potions" +
                    "\n6 : Exit", Console.TextColor.PURPLE);
            if (y == 1){
                potionMaker1();
            } else if (y == 2){
                potionMaker2();
            } else if (y == 3){
                potionMaker3();
            } else if (y == 4){
                potionMakerRandom();
            } else if (y == 5){
                randomPotionMaker();
            } else if (y == 6){
                x = 1;
            }

        }
    }

    //TODO: All potions should start with the same base ingredient, and from there depending on what you add will determine the effect
    // determine ingredients
    // determine which ingredients do which things
    public static void potionMaker1(){

    }
    public static void potionMaker2(){

    }
    public static void potionMaker3(){

    }
    public static void potionMakerRandom(){

    }
    public static void randomPotionMaker(){

    }
}
