

public class Checker {

    public boolean isDayOfWeek(String string) {
        String regex = "mon|tue|wed|thu|fri|sat|sun";

        if (string.matches(regex)) {
            return true;
        }

        return false;
    }

    public boolean allVowels(String string) {
        String regex = "(a|e|i|o|u)*";
        if (string.matches(regex)) {
            return true;
        }

        return false;
    }


    public boolean timeOfDay(String string) {
        // So the acceptable values are between 00:00:00 and 23:59:59.

        String regex = "([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";

        if (string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
}
