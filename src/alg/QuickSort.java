package alg;

/**
 * @author Marek
 */
public class QuickSort<T extends Comparable<T>> {
    String ret = "";
    private void swap(T[] a, int first, int second) {
        T temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    private int pivot(T[] a, int li, int re) {
        return(li + re) / 2;			//oder alternative Wahl
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

    public String sortQuick(T[] a) {
        String firstrow = printinmain(a);
         sortQuick(a, 0, a.length-1);
         return  "import java.util.*;\n" +
                 "public class Delivery {\n" +
                 "\n" +
                 "\n" +
                 "public static int[][] steps = \n" +
                 "{\n" + firstrow + ret.substring(0, ret.length()-2) + "\n};\n" +
                 "\n" +
                 "}";
    }
    private void sortQuick(T[] a, int li, int re) {

        if(li >= re) {						//max.einElement?
            return;							//dannfertig
        }
        int p = pivot(a,li,re);				//li<=p<=re

        swap(a, p, re);						//tauschePivotnachrechts
        int il = li;						//"Linksaussen"
        int ir = re-1;						//"Rechtsaussen"
        do{									//laufeaufeinanderzu
            while(il <= ir && a[il].compareTo(a[re]) < 0) {		//linkerWerto.k.
                ++il;						//laufenach"innen"
            }
            while(il < ir && a[ir].compareTo(a[re]) >= 0) {		//rechterWerto.k.
                --ir;						//laufenach"innen"
            }
            if(il < ir) {					//Fehlstandentdeckt?
                swap(a, il++, ir);			//tauschelinkenundrechtenWert
            }								//dannil,stetsirweiterruecken#
        }while(il <= --ir);p=il;			//PivotfolgtauflinkenTeil
        swap(a, p, re);						//tauschePivotnachinnen
        ret += "{";
        for(int i = 0; i < a.length; i++) {
            ret += a[i];
            if(i < a.length-1)
                ret += ",";
        }
        ret += "},\n";

        sortQuick(a, li, p-1);				//linkenTeilsortieren
        sortQuick(a, p+1, re);				//rechtenTeilsortieren}
    }

}