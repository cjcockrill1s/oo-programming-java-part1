import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player newPlayer) {
        if (this.maxSize > this.players.size()) {
            this.players.add(newPlayer);
        }
    }

    public void printPlayers() {
        for (Player playerInList : players) {
            System.out.println(playerInList.toString());
        }
    }

    public int goals() {
        int teamGoals = 0;
        for (Player playerInList : players) {
            teamGoals += playerInList.goals();
        }
        return teamGoals;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }
}
