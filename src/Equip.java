class Team {
    private final String name;
    private final Athlete[] athletes;
    private int currentAthlete = 0;
    private long totalTime = 0;

    public Team(String name, Athlete[] athletes) {
        this.name = name;
        this.athletes = athletes;
    }

    public synchronized Athlete getNextAthlete() {
        Athlete nextAthlete = athletes[currentAthlete];
        currentAthlete = (currentAthlete + 1) % athletes.length;
        return nextAthlete;
    }

    public synchronized void updateTotalTime(long time) {
        totalTime += time;
    }

    public String getName() {
        return name;
    }

    public Athlete[] getAthletes() {
        return athletes;
    }

    public long getTotalTime() {
        return totalTime;
    }
}