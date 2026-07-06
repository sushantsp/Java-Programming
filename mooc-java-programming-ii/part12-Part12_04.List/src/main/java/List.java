public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    // Adding values to the list
    public void add(Type value) {
        if (this.values.length == this.firstFreeIndex) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; // same as firstFreeIndex = firstFreeIndex + 1;
    }

    // Dynamic increament of Array on reaching the limit. can be used in class methods. 
    private void grow() {
        int newSize = this.values.length + this.values.length/2;
        Type[] newValues = (Type[]) new Object[newSize];

        for(int i=0; i<this.values.length;i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    // contains method
    public boolean contains(Type value) {
        // for (int i=0; i<this.firstFreeIndex; i++) {
        //     if (this.values[i].equals(value)) {
        //         return true;
        //     }
        // }

        // return false;

        return this.indexOfValue(value) >= 0;
    }

    // remove method
    public void remove(Type value) {
        // boolean found = false;

        // for(int i=0; i<this.firstFreeIndex; i++) {
        //     if (found) {
        //         this.values[i - 1] = this.values[i];
        //     } else if (this.values[i] == value || this.values[i].equals(value)) {
        //         this.firstFreeIndex--;
        //         found = true;
        //     }
        // }

        int indexOfValue = indexOfValue(value);
        if (indexOfValue<0) {
            return;
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
    // split the above method in two separate methods

    public int indexOfValue(Type value) {
        for (int i=0; i<this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for(int i=fromIndex; i<this.firstFreeIndex; i++) {
            this.values[i] = this.values[i+1];
        }
    }

    // Searching from an index

    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + "Outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }


}
