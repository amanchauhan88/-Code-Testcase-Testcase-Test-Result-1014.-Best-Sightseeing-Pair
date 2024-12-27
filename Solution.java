class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int maxPrefix = values[0]; // Initialize with values[0] + 0
        
        for (int j = 1; j < values.length; j++) {
            // Calculate the score for the current pair
            maxScore = Math.max(maxScore, maxPrefix + values[j] - j);
            
            // Update maxPrefix for the next iteration
            maxPrefix = Math.max(maxPrefix, values[j] + j);
        }
        
        return maxScore;
    }
}
