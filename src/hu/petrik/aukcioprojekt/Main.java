package hu.petrik.aukcioprojekt;

public class Main {
    public static void main(String[] args) {
        Festmeny festmeny = new Festmeny("Új festmény", "Gipsz Jakab", "futurizmus");
        //TODO: Konzol alkalmazás elkészítése!!
        for (int i = 0; i < 1000; i++) {
            festmeny.licit();
            System.out.println(festmeny.getLegmagasabbLicit());
        }
    }
}
