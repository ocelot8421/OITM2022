package no1_fordulo.hatekonyJavaProgramozas_MSCI.no1_3_feladat;

import java.util.ArrayList;
import java.util.List;

public class Listener {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
    }
}
