class Personne {

    String cin;
    String nom;
    String prenom;
    String email;
    int age;

    void initialiser(String cinPersonne, String nomPersonne, String prenomPersonne, String emailPersonne, int agePersonne) {
        cin = cinPersonne;
        nom = nomPersonne;
        prenom = prenomPersonne;
        email = emailPersonne;
        age = agePersonne;
    }

    void afficher() {
        System.out.println("Informations de la personne :");
        System.out.println("CIN : " + cin);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
    }
}

public class Exercice1 {

    public static void main(String[] args) {

        Personne personne1 = new Personne();

        personne1.initialiser("AB123", "Ali", "Karim", "ali@mail.com", 22);

        personne1.afficher();
    }

}