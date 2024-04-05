package Grammars;

import Data.Index.BPlusIndex;

import java.util.Arrays;
import java.util.Comparator;

public class SQLBonus {
    public static void main(String[] args){
        Integer[] a = {4, null,2,5,null, 1,null, 8};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == null && o2 == null) { return 0; }
                if (o1 == null) { return 1; }
                if (o2 == null) { return -1; }
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(a));
    }

}
