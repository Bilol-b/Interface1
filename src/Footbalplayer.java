public class Footbalplayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public Footbalplayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }
    @Override public String getInfo() {
        return super.getInfo() + ", Red Cards: " + countOfRedCard + ", Yellow Cards: " + countOfYellowCard + ", Goals: " + countOfGoals;
    }
}
