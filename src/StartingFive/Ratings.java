package StartingFive;

/**
 *
 * @author GSU BOTB Team
 */

//Class to calculate player and team ratings based on several aspects of the game
public class Ratings {
    private int rating;
    
    private boolean tradeRumors;
    private boolean isInjured;
    
    //Metrics for calculating player and team ratings
    public int ROTY, PRObowls, rareCardsAvailable, HOFprospect, fantasyRanking, 
               yearsInTheLeague, teamWins, superBowlsWon,
               DPOTY, sacs, tackles, fieldGoalsMade,
               oneHundredyardGames, QBR, touchdowns,
               injured,traded;
    
    public Ratings(){
        this.rating=50;
        
        //Used as an example, would be added by various components of the general app
        ROTY = 0; 
        PRObowls = 2; 
         
        HOFprospect = 0;
        fantasyRanking = 78;
        yearsInTheLeague = 15; 
        teamWins = 12;
        superBowlsWon = 0;
        DPOTY = 0;
        sacs = 0;
        tackles = 0; 
        fieldGoalsMade = 0;
        oneHundredyardGames = 1; 
        QBR = 0;
        touchdowns = 6;
        rareCardsAvailable = 2;
        
        tradeRumors = false;
        isInjured = false;
    }
    /*
    Calculate rating
    Future changes: categorize rankings based on player positions
        -A running back's ranking shouldnt account for sacks, QBR, etc; but overall ranking should be able to compete with a QB
    */  
    public int calculateRating(){
        double calculatedRating;
        if (isInjured)
            injured = -5;   //Injured players lose rank
        if (tradeRumors)
            traded=-2;      //Players on the trade block lose rank basedon the situation
        
        calculatedRating = ROTY + PRObowls + rareCardsAvailable + HOFprospect + (fantasyRanking/2) + yearsInTheLeague + teamWins + superBowlsWon 
                         + DPOTY + sacs + tackles + fieldGoalsMade + oneHundredyardGames + (QBR/2.5) + touchdowns + injured + traded;
                                                                                    //QBRs and Fantasy Rankings are usually high, too high for our rating over 100
        
        //In case a rank is over 100 
        if (calculatedRating>100)
            rating = 99; //No one is perfect lol
        
        return rating;
    }
    
}
