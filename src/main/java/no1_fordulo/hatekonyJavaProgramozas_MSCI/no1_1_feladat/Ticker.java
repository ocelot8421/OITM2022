package no1_fordulo.hatekonyJavaProgramozas_MSCI.no1_1_feladat;
//Adott az alábbi Ticker osztály. Melyik kódrészlet ad
// helyes megvalósítást a hashcode és equals metódusokra?
import java.math.BigDecimal;
import java.util.Objects;

class Ticker extends StockPriceProvider {
    String symbol;
    BigDecimal tradedPrice;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(symbol);
        System.out.println(super.hashCode());
        System.out.println(Objects.hash(symbol));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!super.equals(obj))
            return false;
        if(getClass() != obj.getClass())
            return false;
        Ticker other = (Ticker) obj;
        return Objects.equals(symbol, other.symbol) && Objects.equals(tradedPrice, other.tradedPrice);
    }



}
