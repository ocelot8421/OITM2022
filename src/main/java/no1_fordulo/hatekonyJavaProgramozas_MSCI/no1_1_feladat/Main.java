package no1_fordulo.hatekonyJavaProgramozas_MSCI.no1_1_feladat;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Ticker a = new Ticker();
        Ticker b = new Ticker();

        a.symbol = "abc";
        b.symbol = "abc";
        a.tradedPrice = BigDecimal.valueOf(200);
        b.tradedPrice = BigDecimal.valueOf(200);

        a.hashCode();
        b.hashCode();

        System.out.println(a.equals(b));
    }

}
