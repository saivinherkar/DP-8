//TC = O(n^2)
//SC = O(n)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> prevRow = triangle.get(0);
        for (int row = 1; row < triangle.size(); row++) {
            List<Integer> currRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                int smallestAbove = Integer.MAX_VALUE;           
                if (col > 0) {
                    smallestAbove = prevRow.get(col - 1);
                } 
                if (col < row) {
                    smallestAbove = Math.min(smallestAbove, prevRow.get(col));
                }
                currRow.add(smallestAbove + triangle.get(row).get(col));
            }
            prevRow = currRow;
        }
        return Collections.min(prevRow);
    }
}