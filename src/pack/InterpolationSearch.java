package pack;

import java.util.Arrays;

public class InterpolationSearch {
    public static int interpolationSearch(int arr[], int lo, int hi, int x) {
        int pos;

        if (lo <= hi && x >= arr[lo] &&
                x <= arr[hi]) {

            pos = lo + (((hi - lo) /
                    (arr[hi] - arr[lo])) *
                    (x - arr[lo]));

            if (arr[pos] == x)
                return pos;

            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1,
                        hi, x);

            if (arr[pos] > x)
                return interpolationSearch(arr, lo,
                        pos - 1, x);
        }
        return -1;
    }

}
