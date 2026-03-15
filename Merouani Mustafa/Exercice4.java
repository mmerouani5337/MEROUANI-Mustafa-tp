class Livre {

    String titreLivre;
    String auteurLivre;
    int nbPages;
    double prixLivre;
    boolean prixDefini;

    Livre(String titre, String auteur, int pages) {
        titreLivre = titre;
        auteurLivre = auteur;
        nbPages = pages;
        prixLivre = -1;
        prixDefini = false;
    }

    Livre(String titre, String auteur, int pages, double prix) {
        titreLivre = titre;
        auteurLivre = auteur;
        nbPages = pages;
        prixLivre = prix;
        prixDefini = true;
    }

    String getTitre() {
        return titreLivre;
    }

    String getAuteur() {
        return auteurLivre;
    }

    int getPages() {
        return nbPages;
    }

    double getPrix() {
        return prixLivre;
    }

    void setPrix(double p) {
        if (prixDefini) {
            System.out.println("Le prix est deja fixe !");
        } else {
            prixLivre = p;
            prixDefini = true;
        }
    }

    boolean prixEstFixe() {
        return prixDefini;
    }

    public String toString() {

        if (prixLivre == -1) {
            return titreLivre + " - " + auteurLivre + " - " + nbPages + " pages - Prix non defini";
        } else {
            return titreLivre + " - " + auteurLivre + " - " + nbPages + " pages - Prix : " + prixLivre;
        }
    }

    int comparer(Livre autreLivre) {

        if (nbPages == autreLivre.nbPages) {
            return 0;
        }

        if (nbPages > autreLivre.nbPages) {
            return 1;
        }

        return -1;
    }
}

class Etagere {

    Livre[] tableauLivres;
    int nombre;

    Etagere(int capacite) {
        tableauLivres = new Livre[capacite];
        nombre = 0;
    }

    int getCapacite() {
        return tableauLivres.length;
    }

    int getNombreLivres() {
        return nombre;
    }

    void ajouterLivre(Livre l) {

        if (nombre == tableauLivres.length) {
            System.out.println("Impossible d'ajouter : etagere pleine");
            return;
        }

        tableauLivres[nombre] = l;
        nombre++;
    }

    Livre obtenirLivre(int position) {

        if (position < 1 || position > nombre) {
            return null;
        }

        return tableauLivres[position - 1];
    }

    int rechercher(String titre, String auteur) {

        for (int i = 0; i < nombre; i++) {

            if (tableauLivres[i].getTitre().equals(titre)
                    && tableauLivres[i].getAuteur().equals(auteur)) {

                return i + 1;
            }
        }

        return 0;
    }

    void supprimerLivre(int position) {

        if (position < 1 || position > nombre) {
            System.out.println("Position invalide");
            return;
        }

        for (int i = position - 1; i < nombre - 1; i++) {
            tableauLivres[i] = tableauLivres[i + 1];
        }

        tableauLivres[nombre - 1] = null;
        nombre--;
    }
}

public class Exercice4 {

    public static void main(String[] args) {

        Livre livre1 = new Livre("Java", "Ali", 200);
        Livre livre2 = new Livre("POO", "Karim", 150, 50);

        Etagere etagere = new Etagere(5);

        etagere.ajouterLivre(livre1);
        etagere.ajouterLivre(livre2);

        System.out.println(etagere.obtenirLivre(1));
        System.out.println(etagere.obtenirLivre(2));
    }
}