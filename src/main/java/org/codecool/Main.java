package org.codecool;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ZarządcaKrasnali zarządcaKrasnali;
    static List<Krasnal> krasnals = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            ZarządcaKrasnali.ŁogarnijStringi(Odczytywacz.OdczytBłędy());
            OgranijKalorie();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void OgranijKalorie() {
        try {
            krasnals = ZarządcaKrasnali.Sortuj(Odczytywacz.OdczytKalorie());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (!krasnals.isEmpty()) {
            System.out.println("Krasnal z największą liczbą kalorii to:\n\t" + krasnals.get(krasnals.size() - 1).id
                    + "\n\tMa on w plecaku " + krasnals.get(krasnals.size() - 1).GetSuma() + " kalorii.");
            System.out.println("3 Krasnale z największą liczbą kalorii to:\n\t"
                    + krasnals.get(krasnals.size() - 1).id + ", kalorii w plecaku: " + krasnals.get(krasnals.size() - 1).GetSuma() + "\n\t"
                    + krasnals.get(krasnals.size() - 2).id + ", kalorii w plecaku: " + krasnals.get(krasnals.size() - 2).GetSuma() + "\n\t"
                    + krasnals.get(krasnals.size() - 3).id + ", kalorii w plecaku: " + krasnals.get(krasnals.size() - 3).GetSuma() + "\n"
            );
            /*Testowanie poprawności działania programu*/
            /*
            System.out.println(krasnals.stream().anyMatch(o -> o.GetSuma() == 68442));
            System.out.println(krasnals.stream().anyMatch(o -> o.GetSuma() == 68218));
            System.out.println(krasnals.stream().anyMatch(o -> o.GetSuma() == 68177));
             */
        }
    }
}