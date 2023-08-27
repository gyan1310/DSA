    public static void spiral_matrix(int mat[][]) {

        int start_row = 0;
        int start_col = 0;
        int end_row = mat.length -1 ;
        int end_col = mat[0].length-1 ;
        
        while( start_row <= end_row && start_col <= end_col){
            // top
            for ( int j = start_col; j <= end_col; j++){
                System.out.print(mat[start_row][j] + " ");
            }
            // right
            for (int i = start_row +1 ; i<= end_row; i++){
                System.out.print(mat[i][end_col] + " ");
            }
            // bottom
            for ( int j = end_col-1 ; j >=start_col; j--){
                if(start_row == end_row){
                    break;
                }
                System.out.print(mat[end_row][j] + " ");
            }
            // left
            for ( int i = end_row-1; i>= start_row+1; i--){

                if(start_col == end_col){
                    break;
                }
                System.out.print(mat[i][start_col] + " ");
            }

            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }
