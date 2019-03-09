package StartingFive;

/**
 *
 * @author GSU BOTB Team
 */

//Class which defines what is on a player's card
public class PlayerCard {
    
    private String name;
    private String team;
    private int playerNumber;
    private String position;
    private int rating;
    private int year;
    private String active; //If the card is of an active player of their current team......i.e. >> Marshawn Lynch Seatlle/Rookie cards would be "No"
    public String deck;
    
    //Constructor used when creating player card objects
    public PlayerCard (String newName, String newTeam, int newPlayerNumber, String newPosition, int newRating, int newYear, boolean newActive, String newDeck){
        name=newName;
        team=newTeam;
        playerNumber=newPlayerNumber;
        position=newPosition;
        rating=newRating;
        year=newYear;
        if (newActive)
            active="Yes";        //Do not want 
        else                    //to use true/false 
            active="No";       //as output
        deck=newDeck;
    }
    
    public static PlayerCard createPlayer(String name, String team, int number, String position, int rating, int year, boolean active, String classs){
        PlayerCard newPlayer = new PlayerCard(name, team, number, position, rating, year, active, classs);
        return newPlayer;
    }
    
    //Setters
    public void setName (String newName){
        name=newName;
    }
    public void setTeam (String newTeam){
        team=newTeam;
    }
    public void setPlayerNumber (int newPlayreNumber){
        playerNumber=newPlayreNumber;   
    }
    public void setPosition (String newPosition){
        position=newPosition;   
    }
    public void setRating (int newRating){
        rating=newRating;
    }
    public void setCurrentPlayer (String newActive){
        active=newActive;
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public String getPosition(){
        return position;
    }
    public int getRating(){
        return rating;
    }
    public String getCurrentPlayer(){
        return active;
    }
    
    private void validateName(String name) throws FormatException {
    // Do validation here to ensure we have a legit phone number.
    // Throw an exception if its invalid.
  }
    
    //For outputing string used to test what cards a player gets. For Testing purposes
    @Override
    public String toString() {
      return name + " - " + team + " - " + playerNumber + " - " + position + " - " + rating + " - " + year + " - " + active + " - " + deck;
    }
    
}
