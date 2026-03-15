class Point {

    String nomPoint;
    double position;

    Point(String nom, double pos) {
        nomPoint = nom;
        position = pos;
    }

    void afficher() {
        System.out.println("Le point " + nomPoint + " se trouve à l'abscisse : " + position);
    }

    void deplacer(double valeur) {
        position = position + valeur;
    }
}

public class Exercice3 {

    public static void main(String[] args) {

        Point point1 = new Point("A", 4.2);

        point1.afficher();

        point1.deplacer(2);

        point1.afficher();
    }
}