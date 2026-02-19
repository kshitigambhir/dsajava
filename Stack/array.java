package Stack;

import java.util.ArrayList;
import java.util.List;

public class array {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int idx = 0;

        for (int num = 1; num <= n && idx < target.length; num++) {
            ops.add("Push");

            if (num == target[idx]) {
                idx++; // keep it
            } else {
                ops.add("Pop"); // discard it
            }
        }
        return ops;
    }
}
