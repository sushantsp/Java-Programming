public class Bot extends Player{


    public Bot(String name) {
        super(name);
    }

    public void addMove(String move) {
        System.out.println("played " + move );
    }

}
