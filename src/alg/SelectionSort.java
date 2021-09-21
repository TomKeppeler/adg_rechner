package alg;

import java.util.ArrayList;

/**
 * @author https://www.geeksforgeeks.org/selection-sort/ und Tom Keppeler
 */
public class SelectionSort
{
   // private String ret = "";
    private String sort(Integer arr[])
    {
        String ret="";
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            if(i != n-2){
                ret = printArray(arr, true, ret);
            }else{
                ret = printArray(arr, false, ret);
            }
        }
        return ret;
    }
 
    private String printArray(Integer arr[], boolean last, String ret)
    {
        int n = arr.length;
        ret +=  "{";
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
    public String printinmain(Integer[] arr){
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
    // Driver code to test above
    public String call(Integer[] arr)
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
}
/* This code is contributed by Rajat Mishra*/