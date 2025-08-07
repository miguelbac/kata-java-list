package com.miguelbac;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Week myWeek = new Week();

        myWeek.createList();
        System.out.println("Lista creada:");
        printList(myWeek.getWeek());

        System.out.println("Número de días: " + myWeek.getLength());

        myWeek.removeDayByIndex(2);
        System.out.println("Después de eliminar por índice:");
        printList(myWeek.getWeek());

        myWeek.createList();

        myWeek.removeDayByName("Domingo");
        System.out.println("Después de eliminar por nombre:");
        printList(myWeek.getWeek());

        myWeek.createList();

        System.out.println("¿Contiene 'Martes'? " + myWeek.containsDay("Martes"));
        System.out.println("¿Contiene 'Monday'? " + myWeek.containsDay("Monday"));

        myWeek.sortAlphabetically();
        System.out.println("Lista ordenada alfabéticamente:");
        printList(myWeek.getWeek());

        myWeek.clear();
        System.out.println("Lista después de vaciar:");
        printList(myWeek.getWeek());
        System.out.println("Número de días ahora: " + myWeek.getLength());
    }

    private static void printList(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("(Lista vacía)");
            return;
        }
        for (String day : list) {
            System.out.println("- " + day);
        }
    }
}
