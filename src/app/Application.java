package app;

import models.Personne;

public class Application {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Guenaud", "Ephram");
        Personne personne2 = new Personne("Mao", "Thomas");
        Personne personne3 = new Personne("Das Silva", "Alex");
        boolean aReussis = personne1.ajouteCopain(personne3);
        System.out.println(aReussis);
        System.out.println(personne1.toString());
        System.out.println(personne2.toString());
        System.out.println(personne3.toString());
    }
}
