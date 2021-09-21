package alg;

import alg.SelectionSort;

import java.util.Arrays;
/**
 * @author https://www.geeksforgeeks.org/insertion-sort/ und Tom Keppeler
 */
public class InsertSort<T extends Comparable>{
    /*Function to sort array using insertion sort*/
    private String sort(T[] arr)
    {
        String ret = "";
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            if(i==n-1){
                ret = printArray(arr, false, ret);
            }else{
                ret = printArray(arr, true, ret);
            }
        }
        return ret;
    }
 
    /* A utility function to print array of size n*/
    private String printArray(T[] arr, boolean last, String ret)
    {
        int n = arr.length;
        ret += "{";
        if(last){
        for (int i = 0; i < n; ++i){
            if(i!=n-1)
                ret += arr[i] + ",";
            else
                ret += arr[i] + "},";
        }
        }else{
            for (int i = 0; i < n; ++i){
                if(i!=n-1)
                    ret += arr[i] + ",";
                else
                    ret += arr[i] + "}";
            }
        }
        return ret + "\n";
    }
    private String printinmain(T[] arr){
        String ret = "{";
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1) {
                ret += arr[i] + ",";
            }else{
                ret += arr[i] + "},\n";
            }
        }
        return ret;
    }
    // Driver method
    public String call(T[] arr)
    {
        return "import java.util.*;\n" +
                "public class Delivery {\n" +
                "\n" +
                "\n" +
                "public static int[][] steps = \n" +
                "{\n" + printinmain(arr) + sort(arr) + "};\n" +
                "\n" +
                "}";
    }
} /* This code is contributed by Rajat Mishra. */