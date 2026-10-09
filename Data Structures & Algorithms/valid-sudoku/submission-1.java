class Solution {
    public boolean isValidSudoku(char[][] board) {
        
          // Check every row
        for (int row = 0; row < 9; row++) {
            Set<Character> values = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char value = board[row][col];

                if (value != '.' && !values.add(value)) {
                    System.out.println(
                        "Duplicate in row " + row + ": " + value
                    );
                    return false;
                }
            }
        }

        // Check every column
        for (int col = 0; col < 9; col++) {
            Set<Character> values = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char value = board[row][col];

                if (value != '.' && !values.add(value)) {
                    System.out.println(
                        "Duplicate in column " + col + ": " + value
                    );
                    return false;
                }
            }
        }

        // Check every 3x3 box
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                Set<Character> values = new HashSet<>();

                for (int row = boxRow; row < boxRow + 3; row++) {
                    for (int col = boxCol; col < boxCol + 3; col++) {
                        char value = board[row][col];

                        if (value != '.' && !values.add(value)) {
                            System.out.println(
                                "Duplicate in box starting at [" +
                                boxRow + "][" + boxCol + "]: " + value
                            );
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
