public class Volleyballplayer extends Player {
    private int numberOfPoints;

    public Volleyballplayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
    @Override public String getInfo() {
        return super.getInfo() + ", Points: " + numberOfPoints;
    }
}
