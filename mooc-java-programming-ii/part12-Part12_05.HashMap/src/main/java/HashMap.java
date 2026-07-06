import java.util.ArrayList;

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values; // Array of Lists of Pairs
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    // Retriving a value
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i=0; i<valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }

        return null;
    }

    // Adding to HashMap

    public void add(K key, V value) {
        // int hashValue = Math.abs(key.hashCode() % this.values.length);
        // if (this.values[hashValue] == null) {
        //     this.values[hashValue] = new List<>();
        // }

        // List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        // int index = -1;
        // for (int i = 0; i<valuesAtIndex.size(); i++) {
        //     if (valuesAtIndex.value(index).getKey().equals(key)) {
        //         index = i;
        //         break;
        //     }
        // }

        List<Pair<K, V>> valuesAtIndex = getListBasedOnkey(key);

        int index = getIndexOfKey(valuesAtIndex, key);


        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private List<Pair<K, V>> getListBasedOnkey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }

        return this.values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i =0; i<myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }


    // growing the HashMap when reaching 75% of its original or increase size.
    private void grow() {
        // Create a new array

        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];
        
        // copy every list from an old array into new one.
        for(int i=0; i<this.values.length; i++) {
            //copy every list fron that arrya
            copy(newValues, i);
        }

        this.values = newValues;
    }

    private void copy(List<Pair<K, V>>[] newArray, int frmIndex) {
        for(int i =0; i<this.values[frmIndex].size(); i++) {
            Pair<K, V> value = this.values[frmIndex].value(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }

            newArray[hashValue].add(value);
        }
    }

    // remove the pair for HashMap

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnkey(key);

        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

}
