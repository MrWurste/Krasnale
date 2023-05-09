package org.codecool;

import java.util.ArrayList;
import java.util.List;

public class Krasnal {
    int id;
    List<Integer> posiki = new ArrayList<>();
    int suma;

    public int GetSuma () { return suma;}

    public void Sumuj() {
        for (int i = 0; i < posiki.size(); i++) {
            suma += posiki.get(i);
        }
    }
}
