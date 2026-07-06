
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        int row = 0;
        int col = size/2;

        // place the first value - [0, n/2] location
        square.placeValue(row, col, 1);
        
        // go up - right - if available fille it. if not come down.
            // crossing the boundary
                // for row - go to last row
                // for col - go to the first col.

        // the loop for the remaining members
        for(int i=2 ; i<=size*size; i++) {
            
            // go up & right
            int newRow = row - 1;
            int newCol = col + 1;

            if (newRow < 0) {
                newRow = size - 1;
            }

            if (newCol >= size) {
                newCol = 0;
            }


            if (square.readValue(newRow, newCol) == 0) {
                row = newRow;
                col = newCol;

                square.placeValue( row, col, i);
            } else {
                row = row + 1;

                if (row < 0) {
                    row = size - 1;
                }

                if (col >= size) {
                    col = 0;
                }

                square.placeValue(row, col, i);
            }
        }

        return square;
    }

}

    // Debug Version
    // public MagicSquare createMagicSquare(int size) {

    //     MagicSquare square = new MagicSquare(size);

    //     // implement the creation of a magic square with the Siamese method algorithm here
        
    //     int row = 0;
    //     int col = size/2;

    //     // place the first value - [0, n/2] location
    //     System.out.println(row + " " +col + " -> "+ 1);
    //     square.placeValue(row, col, 1);
        
    //     // go up - right - if available fille it. if not come down.
    //         // crossing the boundary
    //             // for row - go to last row
    //             // for col - go to the first col.

    //     // the loop for the remaining members
    //     for(int i=2 ; i<=size*size; i++) {
            
    //         // go up & right
    //         System.out.println("going up and right : \n row " + row + " -> " + (row-1) + "\n col " + col + " -> " + (col+1) + "\n");
    //         int newRow = row - 1;
    //         int newCol = col + 1;

    //         if (newRow < 0) {
    //             System.out.println("row out of bound : " + newRow);
    //             newRow = size - 1;
    //         }

    //         if (newCol >= size) {
    //             System.out.println("col out of bound : " + newCol);
    //             newCol = 0;
    //         }

    //         System.out.println("\nnew values (if required): " + "\n newRow :" + newRow + "\n newCol :" + newCol);

    //         if (square.readValue(newRow, newCol) == 0) {
    //             row = newRow;
    //             col = newCol;

    //             System.out.println(row + " " +col + " -> "+ i + "\n");
    //             square.placeValue( row, col, i);
    //         } else {
    //             row = row + 1;

    //             if (row < 0) {
    //                 row = size - 1;
    //             }

    //             if (col >= size) {
    //                 col = 0;
    //             }

    //             System.out.println(row + " " +col + " -> "+ i + "\n");
    //             square.placeValue(row, col, i);
    //         }
    //     }

    //     return square;
    // }
