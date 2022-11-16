package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    //if x wins
    public Boolean isInFavorOfX() { //could figure out how to do with a loop? with ints i and j instead
        if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') { //1st horizontal
            return true;
        } else if (matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X') { //2nd horizontal
            return true;
        } else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') { //3rd horiz
            return true;
        } else if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X') { //1st vert
            return true;
        } else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') { //2nd vert
            return true;
        } else if (matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X') { //3rd vert
            return true;
        } else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') { //diag \
            return true;
        } else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X') { //diag/
            return true;
        } else {
            return false;
        }
//        return null;
    }

    //if o wins
    public Boolean isInFavorOfO() {
        if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O') { //1st horizontal
            return true;
        } else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') { //2nd horizontal
            return true;
        } else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') { //3rd horiz
            return true;
        } else if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') { //1st vert
            return true;
        } else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O') { //2nd vert
            return true;
        } else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') { //3rd vert
            return true;
        } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') { //diag \
            return true;
        } else if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O') { //diag/
            return true;
        } else {
            return false;
        }
//        return null;
    }

    //if no ones wins
    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        } else {
            return false;
        }
    }

    //who won
    public String getWinner() {
        String winnerIs = "";
        if (isInFavorOfX()) {
            winnerIs = "X";
        } else if (isInFavorOfO()) {
            winnerIs = "O";
        } else {
            winnerIs = "";
        }
        return winnerIs;
//        return null;
    }

}
