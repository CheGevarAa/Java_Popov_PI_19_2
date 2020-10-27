public class Field {
    private boolean turn = false;
    private boolean game = true;
    private char EMPTY = ' ';
    private  char[][] field;

    public Field(){
        field = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                field[i][j] = EMPTY;
            }
        }
    }

    private boolean checkWin(){
        boolean var = false;
        for (int i = 0; i < 3; i++){
            var = field[i][0] != EMPTY && field[i][0] == field[i][1] && field[i][1] == field[i][2];
            if(var)
                return true;
            var = field[0][i] != EMPTY && field[0][i] == field[1][i] && field[1][i] == field[2][i];
            if(var)
                return true;
        }
        return var;
    }
}
