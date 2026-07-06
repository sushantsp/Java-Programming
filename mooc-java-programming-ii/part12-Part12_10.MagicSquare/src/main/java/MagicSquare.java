
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sumRows = new ArrayList<>();

        for(int i=0; i<this.square.length; i++) {
            int sum = 0;
            for(int j=0; j<this.square[i].length; j++) {
                sum += this.square[i][j];
            }
            sumRows.add(sum);
        }

        return sumRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumColumns = new ArrayList<>();

        for(int i=0; i<this.square.length; i++) {
            int sum = 0;
            for(int j=0; j<this.square[i].length; j++) {
                sum += this.square[j][i];
            }
            sumColumns.add(sum);
        }


        return sumColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumDigonals = new ArrayList<>();

// 8 1 6
// 3 5 7
// 4 9 2
        int mainDigonalSum = 0;
        int otherDigonalSum = 0;
        int n = this.square.length;
        for(int i=0; i<n; i++) {
            // for(int j=0; j<this.square[i].length; j++) {
            //     if (i == j) { // 00 11 22
            //         mainDigonalSum += this.square[i][j];  //8 + 
            //         if (i != this.square.length-1 && j != this.square[i].length -1 && i != 0 && j != 0) {
            //             otherDigonalSum += this.square[i][j]; // 11 6+5
            //         }
            //     } else if (i == 0 && j== this.square[i].length-1) {
            //         otherDigonalSum += this.square[i][j]; // 02 6+
            //     } else if (j == 0 && i== this.square.length-1) {
            //         otherDigonalSum += this.square[i][j]; // 20 6+5+4
            //     }

            // }
            mainDigonalSum += this.square[i][i];
            otherDigonalSum += this.square[i][n-1-i];
        }

        sumDigonals.add(mainDigonalSum);
        sumDigonals.add(otherDigonalSum);

        return sumDigonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
