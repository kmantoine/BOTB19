package StartingFive;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GSU BOTB Team
 */
public class StartingFiveNewUser {
    public static void main(String[] args){
        createRandomDeck newUserDeck = new createRandomDeck();
        
        //Access the private method used to create new players
        try {
            Method createUsr = newUserDeck.getClass().getDeclaredMethod("createPlayers"); //"createPlayer" method from "createRandomDeck" class
            createUsr.setAccessible(true);
            createUsr.invoke(newUserDeck);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(StartingFiveNewUser.class.getName()).log(Level.SEVERE, "Error creating user", ex);
        }
        
        //Add created players to One Main Deck of trading cards
        newUserDeck.ADDtoMainDeck();
        //Select 5 random cards to start a new user with
        newUserDeck.randomizeNewUserDeck();
    }   
}