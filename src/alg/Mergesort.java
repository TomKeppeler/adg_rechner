package alg;

public class Mergesort {

    public String sortMerge(Integer[] a) {
        return "import java.util.*;\n" +
                "public class Delivery {\n" +
                "\n" +
                "\n" +
                "public static int[][] steps = \n" +
                "{\n" + toString(a, 0, a.length) + sortMerge( a, 0, a.length) + "\n};\n" +
                "\n" +
                "}";
    }
    /* Sortiere den Bereich des Feldes a von �li� bis vor �re�
     * �li� ist erste Position des zu sortierenden Bereichs
     * �re� ist erste Position nach dem Bereich
     */
    private String sortMerge(Integer[] a, int li, int re) {
        String out = "";
        if (re - li <= 1) { // hoechstens ein Wert
            return out; // => Bereich ist schon sortiert
        }
        int m = (li + re + 1) / 2; // Ende links / Anfang rechts
        out += sortMerge(a, li, m); // sortiere linken Teil
        out += sortMerge(a, m, re); // sortiere rechten Teil
        int[] tmp = new int[re-li];// Hilfsfeld zum Mischen
        int i = 0; // Index fuer Hilfsfeld
        int jl = li; // Index fuer linken Teil
        int jr = m; // Index fuer rechten Teil
        while (jl < m && jr < re) {// solange noch Werte
            if (a[jl] <= a[jr]) { // kleinerer Wert links
                tmp[i++] = a[jl++]; // uebertrage nach tmp, ruecke jeweils vor
            } else { // kleinerer Wert rechts
                tmp[i++] = a[jr++]; // uebertrage nach tmp, ruecke jeweils vor
            }
        } // jetzt ist links oder rechts kein Wert mehr uebrig
        while (jl < m) { tmp[i++] = a[jl++];} // uebertrage Rest von links nach tmp
        while (jr < re) { tmp[i++] = a[jr++];} // oder Rest von rechts nach tmp
        //in tmp liegt sortierte Teilfolge; kopiere tmp nach a
        for (int k = 0; k < tmp.length; ++k) {
            a[li + k] = tmp[k];
        }
        out += toString(a,li,re);
        return out;
    }

    private static String toString(Integer[] array, int startI, int endI) {
        String out = "{";
        for(int i = startI; i < endI-1; i++) {
            out += array[i] + ",";
        }
        out +=  array[endI-1] + "}, \n";
        return out;
    }
}
