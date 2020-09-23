public class Matrix {
    private int row;
    private int col;
    private double[][] matrix;

    public Matrix(int row, int col){
        this.row = row;
        this.col = col;

    }
    public double[][] cont(int row, int col){
        double[][] matrix = new double[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }
    public Matrix add_m(){

    }

}
