package alg;

/**
 * @author Marek
 */
public class QuickSort {
    String ret = "";
    private void swap(Integer[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    private int pivot(Integer[] a, int li, int re) {
        return(li + re) / 2;			//oder alternative Wahl
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

    public String sortQuick(Integer[] a) {
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
    private void sortQuick(Integer[] a, int li, int re) {

        if(li >= re) {						//max.einElement?
            return;							//dannfertig
        }
        int p = pivot(a,li,re);				//li<=p<=re

        swap(a, p, re);						//tauschePivotnachrechts
        int il = li;						//"Linksaussen"
        int ir = re-1;						//"Rechtsaussen"
        do{									//laufeaufeinanderzu
            while(il <= ir && a[il] < a[re]) {		//linkerWerto.k.
                ++il;						//laufenach"innen"
            }
            while(il < ir && a[ir] >= a[re]) {		//rechterWerto.k.
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