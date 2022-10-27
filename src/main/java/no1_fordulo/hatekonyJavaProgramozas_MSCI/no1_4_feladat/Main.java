package no1_fordulo.hatekonyJavaProgramozas_MSCI.no1_4_feladat;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Wrapper osztályok esetében mint a Byte, Integer, Long, Boolean, Short
//        a valueOf metódus egy cache-ből adja vissza a példányokat.
//        Integer/Long/Short esetében alapértelmezetten csak a -128-tól 127-ig tartó értéktartomány van a cache-ben.
        System.out.println( "Integer.valueOf(255) == Integer.valueOf(255)");
        System.out.println( Integer.valueOf(255) == Integer.valueOf(255));
        System.out.println("Byte.valueOf((byte) 97) == Byte.valueOf((byte) 97)");
        System.out.println(Byte.valueOf((byte) 97) == Byte.valueOf((byte) 97));
        System.out.println("Integer.valueOf(8) == Integer.valueOf(8)");
        System.out.println(Integer.valueOf(8) == Integer.valueOf(8));
        System.out.println();

//        Ha direkt a konstruktort hívjuk, akkor mindig új példány keletkezik.
        System.out.println("new Integer(127) == new Integer(127)");
        System.out.println(new Integer(127) == new Integer(127));
        System.out.println("new Long(103) == new Long(103)");
        System.out.println(new Long(103) == new Long(103));
        System.out.println("\"200\" == new String(\"2\") + \"0\" + \"0\"");
        System.out.println("200" == new String("2") + '0' + '0');
        System.out.println("new Object().equals(new Object())");
        System.out.println(new Object().equals(new Object()));
        System.out.println();

//        Egy additív operátor (+ és -) primitívvé konvertálja az argumentumokat,
//        ezért a Integer.valueOf(200) == Integer.valueOf(199) + 1 primitív értékeket hasonlít össze.
        System.out.println("Integer.valueOf(200) == Integer.valueOf(199) + 1");
        System.out.println(Integer.valueOf(200) == Integer.valueOf(199) + 1);
        System.out.println("Byte.valueOf(\"2\") == Byte.valueOf(\"1\") + 1");
        System.out.println(Byte.valueOf("2") == Byte.valueOf("1") + 1);

    }
}
