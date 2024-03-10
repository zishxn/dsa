class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> iC = new ArrayList<>();
        List<Integer> jC = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++ ){
                if(matrix[i][j] == 0){
                    iC.add(i);
                    jC.add(j);
                }
            }
        } 
        System.out.println(iC);
        System.out.println(jC);
       
        for(int a = 0; a < iC.size(); a++ ){
            for(int i = 0; i < matrix.length; i++){
                if(iC.get(a) == i){
                    for(int j = 0; j < matrix[i].length; j++ ){
                    matrix[i][j] = 0;
                    }
                }
            } 
        }
        
        for(int a = 0; a < jC.size(); a++ ){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++ ){
                    if(jC.get(a) == j){
                     matrix[i][j] = 0;
                    }
                }
            } 
        }
        
    }
    
}