package StartingFive;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GSU BOTB Team
 */

//Class used to control user attached beacons
public class Beacon {
    Scanner input = new Scanner(System.in);

    private double radius;           //Beacon radius default
    private double centerX, centerY; //Cordinates for users location
    boolean response, stillInsideRadius=false;
    
    public Beacon (){
        radius = 4;
        centerX=0;
        centerY=0;
    }
    
    public boolean insideRadius (double x, double y){ 
        // Compare radius of circle with 
        // distance of its center from 
        // given point 
        if (Math.pow(x-centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radius, 2)){ 
            notifyUser();
            return true;
        }
        return false;
    }
    
    void notifyUser(){
        //popUp("Nearby User!");  
        //askUser("Do you want to CLASH with " + nextPlayerName + "?");
        response = input.hasNext();
        //If the user wants to enage then run clash method
        if (response) {
            while (stillInsideRadius){
                try {
                    TimeUnit.SECONDS.sleep(5);
                    //Clash method
                    clash();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Beacon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            compareCards(); //If the user doesnt want to engage the next user, show other player's cards and compare/ offer to trade
        }
    }
    
    private void compareCards(){
        //showNextPlayerCards();
        //code to compare my cards with next players cards
        System.out.println("Trade any cards?");
        response = input.hasNext();
        if (response) {
            initiateTrade();
        }
    }
    
    public void clash(){
        /*
        Users play a head to head
        against eahc other.
        Possible a best of three (offense vs defense)        
        */
    }
    
    private void initiateTrade(){
        //askUser("Which card/cards do you want to trade?");
        response = input.hasNext();
        if (response) {
            //Get selected cards
            //Confirm trade with secondary user
            //Move cards betweens hands
        }        
    }
    
    //Send signal and wait for another
    public void broadcastSignal(){
        //while broadcasting signal, if a  nearby beacon is found, x & y would be its cordinates in relation to our radius and location
        //this.centerX=value1;
        //this.centerY=value2;
        
        //Found secondary beacon//
        double x = 2.3;
        double y = 1.2;
        insideRadius(x, y); //Find if they are in our 
    }

}
