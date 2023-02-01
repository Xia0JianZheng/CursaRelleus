class RelayRace {
    private final Team[] teams;
    private volatile int currentTeam = 0;

    public RelayRace(Team[] teams) {
        this.teams = teams;
    }

    public void startRace() throws InterruptedException {
        for (int i = 0; i < teams[0].getAthletes().length; i++) {
            Athlete currentAthlete = teams[currentTeam].getNextAthlete();
            currentAthlete.run();
            currentTeam = (currentTeam + 1) % teams.length;
        }
    }

    public Team[] getTeams() {
        return teams;
    }
}