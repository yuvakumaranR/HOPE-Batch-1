import java.util.*;

class Player {
    private String name;
    private int score;

    Player(String name) {
        this.name = Name(name);
        score = 0;
    }

    private String Name(String name) {
        if(name.length() == 0) return name;
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void addScore(int s) {
        score = score + s;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class BattleGame {

    String gameName = "Battle Game";
    Random r = new Random();

    public void play(Player p) {
        int points = r.nextInt(50) + 1;
        System.out.println(p.getName() + " played " + gameName + " and got " + points + " points");
        p.addScore(points);
    }
}

class Leaderboard {

    ArrayList<Player> players = new ArrayList<>();

    void addPlayer(Player p) {
        players.add(p);
    }

    void showLeaderboard() {

        players.sort((a,b) -> b.getScore() - a.getScore());

        System.out.println("\nFinal Leaderboard");

        int rank = 1;
        for(Player p : players) {
            System.out.println(rank + ". " + p.getName() + " - " + p.getScore());
            rank++;
        }

        Player winner = players.get(0);
        System.out.println("\nWinner: " + winner.getName());
    }
}

public class GamingLeaderboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Player> playerList = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter player " + i + " name: ");
            String name = sc.nextLine();
            playerList.add(new Player(name));
        }

        BattleGame game = new BattleGame();
        Leaderboard lb = new Leaderboard();

        for(Player p : playerList) {
            lb.addPlayer(p);
        }

        System.out.print("\nEnter number of rounds: ");
        int rounds = sc.nextInt();

        for(int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i);

            for(Player p : playerList) {
                game.play(p);
            }
        }

        lb.showLeaderboard();
    }
}
