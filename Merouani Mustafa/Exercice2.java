class Point {

    char nomPoint;
    double x;

    void initialiser(char nom, double absc) {
        nomPoint = nom;
        x = absc;
    }

    void initialiser(Point autrePoint) {
        nomPoint = autrePoint.nomPoint;
        x = autrePoint.x;
    }

    void afficher() {
        System.out.println("Le point " + nomPoint + " a pour abscisse : " + x);
    }

    void deplacer(double valeur) {
        x = x + valeur;
    }
}

public class Exercice2 {

    public static void main(String[] args) {

        Point point1 = new Point();

        point1.initialiser('A', 2.5);

        point1.afficher();

        point1.deplacer(3);

        point1.afficher();

        // Use initialiser(Point autrePoint)
        Point point2 = new Point();
        point2.initialiser(point1);
        point2.afficher();
    }
}