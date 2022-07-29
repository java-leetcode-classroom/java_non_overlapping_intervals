import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void eraseOverlapIntervalsExample1() {
    // [[1,2],[2,3],[3,4],[1,3]]
    assertEquals(1, sol.eraseOverlapIntervals(new int[][]{
        {1,2}, {2,3}, {3, 4}, {1,3}
    }));
  }
  @Test
  void eraseOverlapIntervalsExample2() {
    // [[1,2],[1,2],[1,2]]
    assertEquals(2, sol.eraseOverlapIntervals(new int[][]{
        {1,2}, {1,2}, {1,2}
    }));
  }
  @Test
  void eraseOverlapIntervalsExample3() {
    //  [[1,2],[2,3]]
    assertEquals(0, sol.eraseOverlapIntervals(new int[][]{
        {1,2}, {2,3}
    }));
  }
}