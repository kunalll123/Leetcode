 class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    
    }

    //Using recursion
       /*public int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        return countCommonFactors(a, b, min);
    }

    private int countCommonFactors(int a, int b, int i) {
        if (i == 0) {
            return 0;
        }
        if (a % i == 0 && b % i == 0) {
            return 1 + countCommonFactors(a, b, i - 1);
        } else {
            return countCommonFactors(a, b, i - 1);
        }
    }*/

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.commonFactors(12, 6));   // Output: 4
        System.out.println(sol.commonFactors(25, 30));  // Output: 2
    }
}

