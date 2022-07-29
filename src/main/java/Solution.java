import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      int count = 0;
      Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
      int overlapEnd = intervals[0][1];
      int nIntervals = intervals.length;
      for (int pos = 1; pos < nIntervals; pos++) {
        if (overlapEnd > intervals[pos][0]) {
          overlapEnd = Math.min(overlapEnd, intervals[pos][1]);
          count++;
        } else {
          overlapEnd = intervals[pos][1];
        }
      }
      return count;
    }
}
