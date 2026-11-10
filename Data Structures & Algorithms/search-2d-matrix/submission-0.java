class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> fullMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                fullMatrix.add(matrix[i][j]);
            }
        }
        
        int start = 0;
        int end = fullMatrix.size() - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (fullMatrix.get(mid) == target) return true;

            if (fullMatrix.get(mid) > target){
                end--;
            } else {
                start++;
            }
        }
        return false;
        
    }
}
