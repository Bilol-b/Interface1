public class Setter extends Volleyballplayer{
    private int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public int getCountOfSets() {
        return countOfSets;
    }

    public void setCountOfSets(int countOfSets) {
        this.countOfSets = countOfSets;
    }
    @Override public String getInfo() {
        return super.getInfo() + ", Sets: " + countOfSets;
    }
}
