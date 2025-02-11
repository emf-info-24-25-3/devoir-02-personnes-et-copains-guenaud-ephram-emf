package models;

public class Personne {
        private final static int MAX_COPAINS = 10;
        private String nom;
        private String prenom;
        private Personne[] copains;

        public Personne(String nom, String prenom) {
                this.nom = nom;
                this.prenom = prenom;
                this.copains = new Personne[MAX_COPAINS];
        }

        public final String getNom() {
                return this.nom;
        }

        public final String getPrenom() {
                return this.prenom;
        }

        public String toString() {
                String copainsTexte = "";
                int compteur = 0;
                for (int i = 0; i < this.copains.length; i++) {
                        if (copains[i] != null) {
                                copainsTexte = copainsTexte + copainsComplet()[compteur];
                                compteur++;
                        }
                }
                String texte = "";
                if (nombreDeCopain() == 0) {
                        texte = getPrenom() + " " + getNom().toUpperCase() + " et ses copains ()";
                } else if (nombreDeCopain() > 0) {
                        texte = getPrenom() + " " + getNom().toUpperCase() + " et ses copains (" + copainsTexte + ")";
                }
                return texte;
        }

        public boolean ajouteCopain(Personne copain) {
                boolean aReussis = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == null) {
                                copains[i] = copain;
                                aReussis = true;
                                break;
                        }
                }
                return aReussis;
        }

        public boolean retireCopain(Personne copain) {
                boolean aReussis = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain) {
                                copains[i] = null;
                                aReussis = true;
                                break;
                        }
                }
                return aReussis;
        }

        public int nombreDeCopain() {
                int compteur = 0;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] != null) {
                                compteur++;
                        }
                }
                return compteur;
        }

        public Personne[] copainsComplet() {
                Personne[] copainsComplet = new Personne[nombreDeCopain()];
                int compteur = 0;
                for (int i = 0; i < this.copains.length; i++) {
                        if (copains[i] != null) {
                                copainsComplet[compteur] = copains[i];
                                compteur++;
                        }
                }
                return copainsComplet;
        }
}
