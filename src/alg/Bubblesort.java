package alg;

public class Bubblesort<T extends Comparable>{

    public String sortBubble(T[] a) {
        String anfangsarray = printinmain(a);
        String out ="";
        int p = a.length-1; // Position letzter Tausch
        while (p > 0) { // solange vertauscht wurde
            int re = p; // rechte Grenze fuer Iteration
            p = 0; // bisher keine Vertauschung
            for (int i = 0; i < re; ++i) {
                if (a[i].compareTo(a[i+1]) > 0) { // falls Tausch notwendig:
                    swap(a, i); // tausche und
                    p = i; // merke Position
                }
            }
            out += toString(a);
        }
        return "import java.util.*;\n" +
                "public class Delivery {\n" +
                "\n" +
                "\n" +
                "public static int[][] steps = \n" +
                "{\n" + anfangsarray + out + "};\n" +
                "\n" +
                "}";
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

    private String toString(T[] array) {
        String out = "{";
        for(int i = 0; i < array.length-1; i++) {
            out += array[i] + ",";
        }
        out += array[array.length-1] + "}, \n";
        return out;
    }

    private void swap(T[] a, int first) {
        T temp = a[first];
        a[first] = a[first+1];
        a[first+1] = temp;
    }
}

