package Medium;

public class NumMatrix2D {
    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int [][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}});
//        System.out.println(numMatrix.sumRegion(2, 1, 4, 3)); // return 8 (i.e sum of the red rectangle)
//        System.out.println(numMatrix.sumRegion(1, 1, 2, 2)); // return 11 (i.e sum of the green rectangle)
//        System.out.println(numMatrix.sumRegion(1, 2, 2, 4)); // return 12 (i.e sum of the blue rectangle)
//
        int l = 5;
        //int k = l/2;
        //int m = 1/2 + l/2;
        int sum = (l * (l+1))/2;

        System.out.println(sum);

    }
}

//O(nm) + O(n)
//class NumMatrix{
//    int [][] matrix;
//    public NumMatrix(int[][] matrix) {
//
//        int colL = matrix[0].length;
//        int rowL = matrix.length;
//
//        System.out.println(rowL);
//        System.out.println(colL);
//
//        for(int i = 0; i < rowL; i++){
//            System.out.print("{");
//            for(int j = 1; j < colL; j++){
//                matrix[i][j] += matrix[i][j-1];
//                System.out.print(matrix[i][j] + ", ");
//            }
//            System.out.print("}");
//            System.out.println();
//        }
//        this.matrix = matrix;
//    }
//
//    public int sumRegion(int row1, int col1, int row2, int col2) {
//        int sum = 0;
//        for(int i = row1; i <= row2; i++){
//            if(col1 == 0){
//                sum += matrix[i][col2];
//            }else{
//                sum += matrix[i][col2] - matrix[i][col1-1];
//            }
//        }
//        return sum;
//    }
//
//
//}

//O(nm) + O(1)
class NumMatrix {

    int [][] matrix;
    public NumMatrix(int[][] matrix) {

        int rowL = matrix.length;
        int colL = matrix[0].length;


        for(int i = 0; i < rowL; i++){
            for(int j = 1; j < colL; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        for(int i = 1; i < rowL; i++){
            for(int j = 0; j < colL; j++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = matrix[row2][col2];
        int extra = (col1!=0?matrix[row2][col1-1]:0) + (row1!=0?matrix[row1-1][col2]:0) - ((row1!=0 && col1!=0)?matrix[row1 - 1][col1-1]:0);

        return total - extra;
    }
}
