import java.util.List;
class Result {

    /*
     * Given a list of integers representing chocolate squares, count how many
     * contiguous segments of length m have a sum equal to d. Each segment
     * represents a way Lily can divide the chocolate for Ron based on his birth
     * month (m) and birth day (d).
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int split;
        int count = 0;
        for (int i = 0; i <= n - m; i++) {
            split = 0;
            for (int j = 0; j < m; j++) {
                split += s.get(i + j);
            }
            if (split == d) {
                count++;
            }
        }
        return count;
    }

}
