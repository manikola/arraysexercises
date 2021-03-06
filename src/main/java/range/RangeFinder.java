package range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RangeFinder {

    public static int range(int[] numbers){
        List<Integer> integers = new ArrayList<>();
        for(Integer item : numbers){
            integers.add(item);
        }
        integers.sort(Comparator.naturalOrder());
        return Math.abs(integers.get(integers.size()-1) - integers.get(0)) + 1;

    }
}
