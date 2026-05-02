import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordDictionary;

    public DictionaryOfManyTranslations() {
        this.wordDictionary = new HashMap<>();
    }

    public void add(String word, String tranlsation) {

        // hashmaps does not contain the a single list initially
        this.wordDictionary.putIfAbsent(word, new ArrayList<>());
        this.wordDictionary.get(word).add(tranlsation);
    }

    public ArrayList<String> translate(String word) {

        if (this.wordDictionary.containsKey(word)) {
            return this.wordDictionary.get(word);
        }

        return new ArrayList<>();
    }

    public void remove(String word) {
        this.wordDictionary.remove(word);
    }
}
