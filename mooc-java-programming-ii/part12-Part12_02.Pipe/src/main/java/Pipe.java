import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }
//public void putIntoPipe(T value) puts an object with a type in accordance with the 
// type parameter given to the the class into the pipe.

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
// public T takeFromPipe() takes out the value, which has been in the pipe the longest. 
// In case there is nothing in the pipe, return null. Calling the method returns the value, 
// which has been in the pipe the longest, and removes it from the pipe.
    public T takeFromPipe() {
        if (this.isInPipe()) {
            int oldestValueIndex = this.pipe.size() - 1;
            T valueToReturn = this.pipe.get(oldestValueIndex);

            this.pipe.remove(oldestValueIndex);
            return valueToReturn;
        }
        return null;
    }


// public boolean isInPipe() returns the value true if the pipe has values. 
// In case the pipe is empty, it returns the value false.

    public boolean isInPipe() {
        if(!this.pipe.isEmpty()) {
            return true;
        }

        return false;
    }
}
