public class GoalKeeper extends Footbalplayer{
    private int countOfSaves;

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName, countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    public int getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(int countOfSaves) {
        this.countOfSaves = countOfSaves;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", Saves: " + countOfSaves;
    }
}
