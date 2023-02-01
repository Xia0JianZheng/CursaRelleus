class Athlete extends Thread {
    private final String name;
    private final long individualTime;
    private final Team team;

    public Athlete(String name, long individualTime, Team team) {
        this.name = name;
        this.individualTime = individualTime;
        this.team = team;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " has started running for " + team.getName());
            Thread.sleep(individualTime);
            team.updateTotalTime(individualTime);
            System.out.println(name + " has finished running for " + team.getName());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }
}