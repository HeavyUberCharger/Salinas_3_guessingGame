/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salinas_3_strings;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author HUC
 */
public class Salinas_3_strings {
          static boolean playagain;
          static int magicnumber;
          static int guess;
          static String username;
          static Random randomnumber = new Random(10);
          static int triesleft;
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playagain = true;
        triesleft = 5;
        magicnumber = randomnumber.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your name???");    
       
       
        username = input.nextLine();
        
        System.out.println("Hello " +username + ",I want to play a game");
        
        while(playagain){
            if(triesleft > 0){
            isrunning();
            }else{
                System.out.println("YOU LOSE,HAHAHAAHHA");
                playagain = false;
            }
        
    
        }}
    
    static void isrunning (){
     Scanner userinputnumbers = new Scanner(System.in);
     System.out.println("pick a number");
     guess = userinputnumbers.nextInt();
     if(magicnumber == guess){
         System.out.println("YOU WON,HACKER!!!!1111");
         playagain = false;
     }else{
         if( magicnumber < guess){
             triesleft = triesleft- 1;
             System.out.println(" To high");
             System.out.println("you now have: " +triesleft+  "tries left");
         }
         if(magicnumber > guess){
             triesleft = triesleft- 1;
             System.out.println("To low");
             System.out.println("you now have: " +triesleft + " tries left");
         }
         
     }
        
    }

}

