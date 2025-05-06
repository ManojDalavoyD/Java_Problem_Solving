import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        int s = ar.size();
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

// Count the number of pairs (i, j) where i < j and (ar[i] + ar[j]) is divisible by k.
// Input: array of integers and integer k; Output: total valid pairs.



