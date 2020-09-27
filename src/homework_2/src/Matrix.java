public class Matrix {

    private int col;
    private int rows;
    private double[][] matrix;

    public Matrix(double[][] matrix){
        this.matrix = matrix;
        this.rows = matrix.length;
        this.col = matrix[0].length;
    }

    public int getColumns() {
        return col;
    }

    public int getRows() {
        return rows;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public Matrix sum(Matrix other){
        if (rows == other.rows & col == other.col){
            double[][] res = new double[rows][col];
            for (int i=0; i < rows; i++){
                for (int j=0; j < col; j++){
                    res[i][j] = matrix[i][j] + other.matrix[i][j];
                }
            }
            Matrix res_matrix = new Matrix(res);
            return res_matrix;
        }

        else{
            System.out.println("incorrect data");
            return other;
        }
    }

    public Matrix sub(Matrix other){
        if (rows == other.rows & col == other.col){
            double[][] res = new double[rows][col];
            for (int i=0; i < rows; i++){
                for (int j=0; j < col; j++){
                    res[i][j] = matrix[i][j] - other.matrix[i][j];
                }
            }
            Matrix res_matrix = new Matrix(res);
            return res_matrix;
        }

        else{
            System.out.println("incorrect data");
            return other;
        }
    }

    public Matrix num_multy(int num){
        double[][] res = new double[rows][col];
        for (int i=0; i < rows; i++){
            for (int j=0; j < col; j++){
                res[i][j] = matrix[i][j]*num;
            }
        }
        Matrix res_matrix = new Matrix(res);
        return res_matrix;
    }

    public Matrix mat_multy(Matrix other) {
        if (col == other.rows) {
            double[][] res = new double[rows][col];
            for (int i = 0; i < rows; i++) {
                for (int k = 0; k < col; k++) {
                    double a = 0;
                    for (int j = 0; j < col; j++) {
                        a = a + matrix[i][j] * other.matrix[j][k];
                    }
                    res[i][k] = a;
                }
            }
            Matrix res_matrix = new Matrix(res);
            return res_matrix;
        } else {
            System.out.println("incorrect data");
            return other;
        }
    }

    public Matrix transp(){
        double[][] res = new double[col][rows];
        for (int i=0; i < rows; i++){
            for (int j=0; j < col; j++){
                res[j][i] = matrix[i][j];
            }
        }
        Matrix res_matrix = new Matrix(res);
        return res_matrix;
    }

    public Matrix pow(int num){
        if (num == 1){
            return this;
        }
        else {
            Matrix res = new Matrix(matrix);
            for (int i = 0; i < num-1; i++) {
                res = res.mat_multy(this);
            }
            return res;
        }
    }