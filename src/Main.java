//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Player fotballplayer = new Footbalplayer("Sardor","football",8,"RM",4,34,34);
     Player goalkeeper = new GoalKeeper("hakim","football",3,"Rm",4,6,2,3);
     Player volleyballplayer = new Volleyballplayer("kiim","volleyball",4,"er",4);
     Player setter = new Setter("qwert","Valleyball",4,"er",4,5);
     Player basketballplayer = new Basketballplayer("Vedma","basketball",4,"er",43);
     Player pointguard = new Pointguard("wer","basketball",4,"er",34,4);

        System.out.println(fotballplayer.getInfo());
        System.out.println(goalkeeper.getInfo());
        System.out.println(volleyballplayer.getInfo());
        System.out.println(setter.getInfo());
        System.out.println(basketballplayer.getInfo());
        System.out.println(pointguard.getInfo());

    }
}