package org.codecool;

import java.util.*;

public class ZarządcaKrasnali {

    public static List<Krasnal> Sortuj(List<Krasnal> k) {
        Collections.sort(k, new Comparator<Krasnal>() {
            @Override
            public int compare(Krasnal o1, Krasnal o2) {
                return o1.GetSuma() - o2.GetSuma();
            }
        });
        return k;
    }
    private static int ajks;
    public static void ŁogarnijStringi(List<String> s) {
        for (String ss:
             s) {
            ajks++;
            String zakazane = "";
            System.out.println("\n"+ajks+": ");
            int size = ss.length();
            String a = ss.substring(0, size/2);
            String b = ss.substring((size/2)+1,size);
            for (int i = 0; i < size/2; i++) {
                String letter = a.substring(i,i+1);
                if (b.contains(letter) && !zakazane.contains(letter)) {
                    zakazane = zakazane+letter;
                    System.out.println(letter + " Priorytet: " + PrzypiszPriorytet(letter));
                }
            }
            System.out.println(zakazane);
            System.out.println(suma);
        }
        System.out.println(suma);
        if(suma == 7795) {System.out.println(true);} else {System.out.println(false);}
    }
    private static int suma;
    public static int PrzypiszPriorytet(String s) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = lower.toUpperCase();
        int prior;
        if (lower.contains(s)) {
            prior = lower.indexOf(s) + 1;
        } else {
            prior = upper.indexOf(s) + 27;
        }
        suma += prior;
        return prior;
    }
}
