public class Pointguard extends Basketballplayer {
    private int countOfGuard;

    public Pointguard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }

    public void setCountOfGuard(int countOfGuard) {
        this.countOfGuard = countOfGuard;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", Guards: " + countOfGuard;
    }
}
