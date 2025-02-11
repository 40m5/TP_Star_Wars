import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un film de la saga Star Wars.
 */
class Film {
    private String titre;
    private int annee;
    private String realisateur;
    private double cout;
    private double recette;
    private List<Acteur> acteurs; //Collection d'acteurs

    // Constructeur
    public Film(String titre, int annee, String realisateur, double cout, double recette) {
        this.titre = titre;
        this.annee = annee;
        this.realisateur = realisateur;
        this.cout = cout;
        this.recette = recette;
        this.acteurs = new ArrayList<>(); // Initialisation de collection d'acteur
    }

    //Méthode pour ajouter n acteur au film
    public void ajouterActeur(Acteur acteur){
        acteurs.add(acteur);
    }

    // Méthode toString pour afficher les informations du film
    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", annee=" + annee +
                ", realisateur='" + realisateur + '\'' +
                ", cout=" + cout +
                ", recette=" + recette +
                ", acteurs=" + acteurs +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        // Création d'une collection de personnages (ArrayList)
        List<Personnage> personnages = new ArrayList<>();

        // 1. Création d'un film avec des attributs en dur
        Film film1 = new Film("Star Wars: Un nouvel espoir", 1977, "George Lucas", 11000000, 775000000);
        System.out.println("Film 1 (attributs en dur) :");
        System.out.println(film1);

        // 2. Création d'un film avec des attributs saisis par l'utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEntrez les détails du film 2 :");
        System.out.print("Titre du film : ");
        String titre = scanner.nextLine();

        System.out.print("Année de sortie : ");
        int annee = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne après nextInt()

        System.out.print("Réalisateur : ");
        String realisateur = scanner.nextLine();

        System.out.print("Coût du film : ");
        double cout = scanner.nextDouble();

        System.out.print("Recette du film : ");
        double recette = scanner.nextDouble();

        // Création du film 2 avec les informations saisies par l'utilisateur
        Film film2 = new Film(titre, annee, realisateur, cout, recette);

        // Affichage du film 2
        System.out.println("\nFilm 2 (attributs saisis par l'utilisateur) :");
        System.out.println(film2);


        // Fermeture du scanner
        scanner.close();

        //Création d'acteurs
        Acteur markHamill = new Acteur("Mark Hamill");
        Acteur harrisonFord = new Acteur("Harrison Ford");
        Acteur carrieFisher = new Acteur("Carrie Fisher");
        Acteur sylvesterStallone = new Acteur("Sylvester Stallone");

        
        // Création d'un personnage
        Personnage lukeSkywalker = new Personnage("Luke Skywalker", "Force");
        Personnage hanSolo = new Personnage("Han Solo", "Force");
        Personnage leiaSkywalker = new Personnage("Leia Skywalker", "Force");
        Personnage yoda = new Personnage("Yoda", "Force");
        Personnage palpatine = new Personnage("Palpatine", "Obscur");


        //Ajout des personnages aux acteurs
        markHamill.ajouterPersonnage(lukeSkywalker);
        harrisonFord.ajouterPersonnage(hanSolo);
        carrieFisher.ajouterPersonnage(leiaSkywalker);
        sylvesterStallone.ajouterPersonnage(yoda);
        sylvesterStallone.ajouterPersonnage(palpatine);

        System.out.println(sylvesterStallone);

        //Ajout des acteurs au film
        film1.ajouterActeur(markHamill);
        film1.ajouterActeur(harrisonFord);
        film1.ajouterActeur(carrieFisher);


        // Affichage du personnage
        System.out.println("Affichage de la collection de personnages :");
        parcourirCollection(personnages);
        System.out.println(film1);
        System.out.println("Nombre de personnages incarnés par " + sylvesterStallone + " : " + sylvesterStallone.nbPersonnages());
        System.out.println("Nombre de personnages incarnés par " + markHamill + " : " + markHamill.nbPersonnages());
        System.out.println("Nombre de personnages incarnés par " + harrisonFord + " : " + harrisonFord.nbPersonnages());
        System.out.println("Nombre de personnages incarnés par " + carrieFisher + " : " + carrieFisher.nbPersonnages());



        
    }

    public static void parcourirCollection(List<?>collection) {
        for (Object objet : collection){
            System.out.println(objet.toString());
            
        }
    }

}
        

