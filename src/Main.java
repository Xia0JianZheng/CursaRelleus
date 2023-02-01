import java.util.Arrays;

public class Main {

    Team team1 = new Team("Team 1", new Athlete[] {
            new Athlete("Athlete 1-1", 1000, team1),
            new Athlete("Athlete 1-2", 1000, team1),
            new Athlete("Athlete 1-3", 1000, team1)
    });

    Team team2 = new Team("Team 2", new Athlete[] {
            new Athlete("Athlete 2-1", 1000, team2),
            new Athlete("Athlete 2-2", 1000, team2),
            new Athlete("Athlete 2-3", 1000, team2)
    });

    Team team3 = new Team("Team 3", new Athlete[] {
            new Athlete("Athlete 3-1", 1000, team3),
            new Athlete("Athlete 3-2", 1000, team3),
            new Athlete("Athlete 3-3", 1000, team3)
    });

    RelayRace race = new RelayRace(new Team[] { team1, team2, team3 });
    race.startRace();

Arrays.sort(race.getTeams(), (team1, team2) -> Long.compare(team1.getTotalTime(), team2.getTotalTime()));

System.out.println("Final standings:");

for (int i = 0; i < race.getTeams().length; i++) {
        System.out.println((i + 1) + ". " + race.getTeams()[i].getName() + " with total time " + race.getTeams()[i].getTotalTime());
    }
}
