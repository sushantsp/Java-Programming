package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private HashMap<String, String> reverseDictionary;
    private String fileName;
 
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.reverseDictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();                                         // calls SaveableDictionary()
        this.fileName = file;
    }

    public boolean load() { 
        

        try (Scanner scanner = new Scanner(Paths.get(this.fileName));) {
            
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(":");

                String word = parts[0];
                String translation = parts[1];

                this.add(word, translation);
                
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }


    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.fileName)) {
            for (String word : this.dictionary.keySet()) {
                writer.println(word + ":" + this.dictionary.get(word));
            }

            return true;
        } catch (Exception e) {

            return false;
        }
    }


    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
        }
        if (!this.reverseDictionary.containsKey(words)) {
            this.reverseDictionary.put(translation, words);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } 
        
        if (this.reverseDictionary.containsKey(word)) {
            return this.reverseDictionary.get(word);
        }

        return null;
    }

    public void delete(String word) {

        if (this.dictionary.containsKey(word)) {
            this.reverseDictionary.remove(this.dictionary.get(word));
            this.dictionary.remove(word);    
        }

        if (this.reverseDictionary.containsKey(word)) {
            this.dictionary.remove(this.reverseDictionary.get(word));
            this.reverseDictionary.remove(word);    
        }
    }


}
