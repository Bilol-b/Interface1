public class Basketballplayer extends Player{
    private int numberOfGoals;

    public Basketballplayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
    public String getInfo() {
        return super.getInfo() + ", Goals: " + numberOfGoals;
    }
}
