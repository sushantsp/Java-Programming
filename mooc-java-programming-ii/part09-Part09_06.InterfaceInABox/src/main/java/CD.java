public class CD implements Packable{

    // CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int). 
    // The weight of all CDs is 0.1 kg.

    private String artist;
    private String name;
    private int pubYear;
    private double weight;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.pubYear = year;
        this.weight = 0.1;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")"; 
        // Pink Floyd: Dark Side of the Moon (1973)
    }

    public double weight() {
        return this.weight;
    }





}
