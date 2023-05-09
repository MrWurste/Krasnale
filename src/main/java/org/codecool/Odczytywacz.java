package org.codecool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odczytywacz {
    static List<Krasnal> krasnale = new ArrayList<>();
    static Krasnal k = new Krasnal();
    public static List<Krasnal> OdczytKalorie() throws FileNotFoundException {
        String line = "a";
        Scanner scanner = new Scanner(new File("src/main/resources/Krasnale.txt"));
        int i = 0;
        while (i != 1) {
            if (!scanner.hasNextLine()) { i = 1; }
            else {
                line = scanner.nextLine();
                //System.out.println(line);
                if (line.isBlank()) {
                    DodajKrasnala(k);
                    //System.out.println("Krasnal added: " + krasnale.size());
                    k = new Krasnal();
                } else {
                    k.posiki.add(Integer.parseInt(line));
                    //System.out.println("Meal added: " + line);
                }
            }
        } DodajKrasnala(k);
        /*for (int j = 0; j < krasnale.size(); j++) {
            //System.out.println("Krasnal: " +krasnale.get(j).posiki.toString() + "\nSUMA: " + krasnale.get(j).suma);
        }*/
        return krasnale;
    }
    static int l = 0;
    private static void DodajKrasnala(Krasnal k) {
        k.Sumuj();
        l++;
        k.id = l;
        krasnale.add(k);
    }
    static List<String> lines = new ArrayList<>();
    public static List<String> OdczytBłędy() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/main/resources/Błędy.txt"));
        int i = 0;
        while (i != 1) {
            if (!scanner.hasNextLine()) { i = 1; }
            else {
                lines.add(scanner.nextLine());
            }
        }
        return lines;
    }
}
