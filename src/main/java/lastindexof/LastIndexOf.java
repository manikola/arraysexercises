package lastindexof;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LastIndexOf {

    public int lastIndexOf(int[] numbers, int value) {
        List<Integer> transformed = new ArrayList<>();
        for (Integer item : numbers){
            transformed.add(item);
            }
         return transformed.lastIndexOf(value);
        }

    }

