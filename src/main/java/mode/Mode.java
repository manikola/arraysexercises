package mode;

import static java.util.Arrays.sort;

public class Mode {

    public int mode(int[] numbers){
        sort(numbers);
        if( numbers[0] < 0 || numbers[numbers.length-1] >100){
            throw new IllegalArgumentException("Invalid number");
        }
        int count = 1, tempCount;
        int popular = numbers[0];
        int temp = 0;
        popular = getPopular(numbers, count, popular);
        return popular;
    }

    private int getPopular(int[] numbers, int count, int popular) {
        int temp;
        int tempCount;
        for (int i = 0; i < (numbers.length - 1); i++) {
            temp = numbers[i];
            tempCount = 0;
            for (int j = 1; j < numbers.length; j++) {
                if (temp == numbers[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
