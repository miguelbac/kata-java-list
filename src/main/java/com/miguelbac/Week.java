package com.miguelbac;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Week {

    private List<String> week = new ArrayList<>();

    public void createList() {
        week.clear();
        week.add("Lunes");
        week.add("Martes");
        week.add("Miércoles");
        week.add("Jueves");
        week.add("Viernes");
        week.add("Sábado");
        week.add("Domingo");
    }

    public List<String> getWeek() {
        return week;
    }

    public int getLength() {
        return week.size();
    }

    public void removeDayByIndex(int index) {
        if (index >= 0 && index < week.size()) {
            week.remove(index);
        } else {
            System.out.println("Índice fuera de rango: " + index);
        }
    }

    public void removeDayByName(String name) {
        if (week.contains(name)) {
            week.remove(name);
        } else {
            System.out.println("El día '" + name + "' no existe en la lista.");
        }
    }

    public boolean containsDay(String name) {
        return week.contains(name);
    }

    public void sortAlphabetically() {
        Collections.sort(week);
    }

    public void clear() {
        week.clear();
    }
}
