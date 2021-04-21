package issorted;

public class Sorter {

    public static boolean isSorted(double[] doubles){
        for( int i = 0; i< doubles.length-1; i++){
            if(doubles[i+1] < doubles[i]){
                return false;
            }
        }
        return true;

    }
}
