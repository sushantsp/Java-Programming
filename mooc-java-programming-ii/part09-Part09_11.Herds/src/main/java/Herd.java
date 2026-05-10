import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }

    public String toString() {
        String allMovables = "";

        for(Movable movable: this.movables) {
            allMovables = allMovables + movable + "\n";
        }

        return allMovables;
    }

    public void move(int dx, int dy) {
        for(Movable movable: this.movables) {
            movable.move(dx, dy);
        }
    }


}
