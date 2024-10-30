package studio7;

/**
 * Represents a hockey player with personal info and game statistics.
 */
public class HockeyPlayer {
    private String name;
    private int jerseyNumber;
    private String shootingSide;    // "left", "right", or "both"
    private String handedness;      // "left" or "right"
    private int totalGoals;
    private int totalAssists;
    private int gamesPlayed;
    
    /**
     * Constructs a hockey player with given attributes.
     * 
     * @param playerName player's name
     * @param number jersey number
     * @param shoots shooting preference ("left", "right", or "both")
     * @param hand dominant hand ("left" or "right")
     */
    public HockeyPlayer(String playerName, int number, String shoots, String hand) {
        name = playerName;
        jerseyNumber = number;
        shootingSide = shoots;
        handedness = hand;
        totalGoals = 0;
        totalAssists = 0;
        gamesPlayed = 0;
    }
    
    /**
     * Records statistics for a completed game.
     * 
     * @param goals number of goals scored in the game
     * @param assists number of assists in the game
     */
    public void recordGame(int goals, int assists) {
        totalGoals += goals;
        totalAssists += assists;
        gamesPlayed++;
    }
    
    /**
     * Calculates total points (goals + assists).
     * 
     * @return total points scored
     */
    public int getPoints() {
        return totalGoals + totalAssists;
    }
    
    /**
     * Returns a string representation of the player.
     * 
     * @return string with player info and statistics
     */
    public String toString() {
        return name + " #" + jerseyNumber + 
               " (Shoots: " + shootingSide + 
               ", Hands: " + handedness + ")\n" +
               "Stats: " + totalGoals + "G, " + 
               totalAssists + "A, " + getPoints() + "P in " +
               gamesPlayed + " games";
    }
    
    /**
     * Main method to test the HockeyPlayer class functionality.
     */
    public static void main(String[] args) {
        // Create a player
        HockeyPlayer player1 = new HockeyPlayer("Brian Hong", 99, "left", "right");
        
        // Print initial stats
        System.out.println("New player created:");
        System.out.println(player1);
        
        // Record some games
        System.out.println("\nRecording 3 games...");
        player1.recordGame(2, 3);  // 2 goals, 3 assists
        player1.recordGame(1, 2);  // 1 goal, 2 assists
        player1.recordGame(3, 1);  // 3 goals, 1 assist
        
        // Print updated stats
        System.out.println(player1);
        
        // Create another player who shoots both ways
        HockeyPlayer player2 = new HockeyPlayer("K Han", 66, "both", "right");
                                              
        System.out.println("\nSecond player created:");
        System.out.println(player2);
        
        // Record a game for second player
        player2.recordGame(4, 2);  // 4 goals, 2 assists
        System.out.println("\nAfter one game:");
        System.out.println(player2);
    }
}