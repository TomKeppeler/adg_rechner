package alg;

// Java program for implementation of Heap Sort
public class Heapsort {
    public String maxSort(Integer arr[])
    {
        int n = arr.length;
        String maxheapret = "";
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);
        String tmp = printinmain(arr);
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            maxHeapify(arr, i, 0);
            if (i != 1) {
                maxheapret += printArray(arr, true);
            } else {
                maxheapret += printArray(arr, false);
            }
        }
        return "public int[][] ascSort = {\n" + maxheapret + "\n};"
                +  "\npublic int[] maxHeap =" + tmp.substring(0,tmp.length()-2) + ";\n";
    }
    private void maxHeapify(Integer arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            maxHeapify(arr, n, largest);
        }
    }

    private void minHeapify(Integer arr[], int n, int i)
    {
        int smallest = i; // Initialize smalles as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is smaller than root
        if (l < n && arr[l] < arr[smallest])
            smallest = l;

        // If right child is smaller than smallest so far
        if (r < n && arr[r] < arr[smallest])
            smallest = r;

        // If smallest is not root
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively heapify the affected sub-tree
            minHeapify(arr, n, smallest);
        }
    }

    // main function to do heap sort
    private String minHeapSort(Integer arr[])
    {
        int n = arr.length;
        String minHeapSort = "";
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            minHeapify(arr, n, i);
        String tmp = printinmain(arr);
        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            minHeapify(arr, i, 0);
            if (i != 0) {
                minHeapSort += printArray(arr, true);
            } else {
                minHeapSort += printArray(arr, false);
            }
        }
        return "public int[][] descSort = {\n" + minHeapSort + "\n};"
                + "\npublic int[] minHeap =" + tmp.substring(0, tmp.length()-2) + ";\n";
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap


    /* A utility function to print array of size n */
    private String printArray(Integer[] arr, boolean notlast)
    {
        int n = arr.length;
        String ret = "{";
        if(notlast){
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
    private String printinmain(Integer[] arr){
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
    public String call(Integer[] arr){
        return "import java.util.*;\n" +
                "public class Delivery {\n\n" + maxSort(arr) + minHeapSort(arr) + "\n}";
    }
}