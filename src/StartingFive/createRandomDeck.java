package StartingFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author GSU BOTB Team
 */
public class createRandomDeck {
    ArrayList<Object> Cards = new ArrayList<>();    //Places cards from all categories into one deck
    ArrayList<Object> regularPlayers = new ArrayList<>();
    ArrayList<Object> rookies = new ArrayList<>();
    ArrayList<Object> proBowlers = new ArrayList<>();
    ArrayList<Object> HOF = new ArrayList<>();
    

    public void ADDtoMainDeck(){                        //Method used to add cards from various subcategories into one deck in various numbers and then shuffle
        for (int i=0; i <regularPlayers.size(); i++) {  //Should be replaced by algorithm for selecting a random selector with probability aspect
            Cards.add(regularPlayers.get(i));           //Currently places the higher probability category several times more than lower probability cards
            Cards.add(regularPlayers.get(i));
            Cards.add(regularPlayers.get(i));
            Cards.add(regularPlayers.get(i));
            Cards.add(regularPlayers.get(i));           //Adds a regular player 6x
            Cards.add(regularPlayers.get(i));           //46%
        }
        for (int i=0; i <rookies.size(); i++) {
            Cards.add(rookies.get(i));
            Cards.add(rookies.get(i));                  //Adds a rookie four times
            Cards.add(rookies.get(i));                  //31%
            Cards.add(rookies.get(i));
        }
        for (int i=0; i <proBowlers.size(); i++) {      //Pro-bowlers are less likely to be given to a new user than a regular player
            Cards.add(proBowlers.get(i));               //Adds a pro-bowler twice
            Cards.add(proBowlers.get(i));               //15%
        }
        for (int i=0; i <HOF.size(); i++) {
            Cards.add(HOF.get(i));                      //A HOFamer is availble for picking 1/13
        }                                               //7%
        //Shuffle the deck of cards
        Collections.shuffle(Cards); 
    }
    
    public void randomizeNewUserDeck(){
        //Random selector
        Random randomDeckGenerator = new Random(); 
        ArrayList<Object> randomDeck = new ArrayList<>();
        int index;
        
        while (randomDeck.size()<5){                            //Ensures there are 5 starting cards in the deck
            index = randomDeckGenerator.nextInt(Cards.size());  //Find a random idex
            if (!randomDeck.contains(Cards.get(index))){        //Ensures the same card isnt given twice
                randomDeck.add(Cards.get(index));
            }
        }        
        
        //Print the results for testing purposes
        for(Object i: randomDeck){
            System.out.println(i);
        }
    }
    
    private void createPlayers() {
        //Create regular players and add them to a deck
        PlayerCard mLynchOK = new PlayerCard("Marshawn Lynch", "Oakland Raiders", 24, "RB", 99, 2017, true, "Regular Players");
        regularPlayers.add(mLynchOK);
        
        PlayerCard mLynchST = new PlayerCard("Marshawn Lynch", "Seattle Seahawks", 24, "RB", 88, 2007, false, "Regular Players");
        regularPlayers.add(mLynchST);
        
        PlayerCard HaHaClintonDixGB = new PlayerCard("Ha Ha Clinton Dix", "Washington Redskins", 20, "S", 84, 2019, false, "Regular Players");
        regularPlayers.add(HaHaClintonDixGB);
        
        PlayerCard JJWattHou = new PlayerCard("J. J. Watt", "Houston Texans", 99, "DE", 87, 2011, true, "Regular Players");
        regularPlayers.add(JJWattHou);
        
        PlayerCard VonMillerDen = new PlayerCard("Von Miller", "Denver Broncos", 58, "OLB", 92, 2011, true, "Regular Players");
        regularPlayers.add(VonMillerDen);
        
        PlayerCard CarlosHyde = new PlayerCard("Carlos Hyde", "Jacksonville Jaguars", 97, "RB", 85, 2018, true, "Regular Players");
        regularPlayers.add(CarlosHyde);
        
        PlayerCard AaronRodgersGB = new PlayerCard("Aaron Rodgers", "Greenbay Packers", 12, "QB", 87, 2005, true, "Regular Players");
        regularPlayers.add(AaronRodgersGB);
        
        
        //Create pro-bowl players and add them to a deck
        PlayerCard mLynchPro = new PlayerCard("Marshawn Lynch", "Seattle Seahawks", 24, "RB", 91, 2012, false, "Pro-Bowlers");
        proBowlers.add(mLynchPro);
        
        PlayerCard JulioJonesPro = new PlayerCard("Julio Jones", "Atlanta Falcons", 4, "WR", 87, 2018, true, "Pro-Bowlers");
        proBowlers.add(JulioJonesPro);
        
        PlayerCard PatrickPetersonPro = new PlayerCard("Patrick Peterson", "Arizona Cardinals", 21, "CB", 88, 2018, true, "Pro-Bowlers");
        proBowlers.add(PatrickPetersonPro);
        
        PlayerCard TomBradyPro = new PlayerCard("Tom Brady", "New England Patriots", 12, "QB", 93, 2000, true, "Pro-Bowlers");
        proBowlers.add(TomBradyPro);
        
        PlayerCard CJMosleyPro = new PlayerCard("C.J. Mosley", "Baltimore Ravens", 57, "LB", 90, 2018, true, "Pro-Bowlers");
        proBowlers.add(CJMosleyPro);
        
        PlayerCard VonMillerPro = new PlayerCard("Von Miller", "Denver Broncos", 58, "OLB", 88, 2011, true, "Pro-Bowlers");
        proBowlers.add(VonMillerPro);
        
        
        //Create rookie players and add them to a deck
        PlayerCard mLynchRook = new PlayerCard("Marshawn Lynch", "Seattle Seahawks", 24, "RB", 68, 2007, false, "Rookies");
        rookies.add(mLynchRook);
        
        PlayerCard SaquonBarkleyRook = new PlayerCard("Saquon Barkley", "New York Giants", 26, "RB", 90, 2018, true, "Rookies");
        rookies.add(SaquonBarkleyRook);
        
        PlayerCard BakerMayfieldRook = new PlayerCard("Baker Mayfield", "Cleveland Browns", 6, "QB", 85, 2018, true, "Rookies");
        rookies.add(BakerMayfieldRook);
        
        PlayerCard TreDaviousWhiteRook = new PlayerCard("Tre'Davious White", "Buffalo Bills", 27, "CB", 62, 2017, true, "Rookies");
        rookies.add(TreDaviousWhiteRook);
        
        PlayerCard EzekielElliottRook = new PlayerCard("Ezekiel Elliott", "Dallas Cowboys", 21, "RB", 60, 2016, true, "Rookies");
        rookies.add(EzekielElliottRook);
       
        
        //Create HOF players and add them to a deck
        PlayerCard EdReedHOF = new PlayerCard("Ed Reed", "Baltimore Ravens", 20, "S", 97, 2019, false, "HOF");
        HOF.add(EdReedHOF);
        
        PlayerCard RandyMossHOF = new PlayerCard("Randy Moss", "Minnesota Vikings", 84, "WR", 97, 2018, false, "HOF");
        HOF.add(RandyMossHOF);
        
        PlayerCard RayLewisHOF = new PlayerCard("Ray Lewis", "Baltimore Ravens", 52, "DB", 97, 2018, false, "HOF");
        HOF.add(RayLewisHOF);
        
        PlayerCard BrettFavreHOF = new PlayerCard("Brett Favre", "Greenbay Packers", 4, "QB", 97, 2016, false, "HOF");
        HOF.add(BrettFavreHOF);
        
        PlayerCard BruceSmithHOF = new PlayerCard("Bruce Smith", "Buffalo Bills", 78, "DE", 97, 2009, false, "HOF");
        HOF.add(BruceSmithHOF);
    }
   
}
