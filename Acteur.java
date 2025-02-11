import java.util.ArrayList;
import java.util.List;


class Acteur {
    private String nom;
    private List<Personnage> duet;

    /**
     * Constructeur de la classe Acteur.
     *
     * @param nom Le nom de l'acteur
     */
    public Acteur(String nom) {
        this.nom = nom;
        this.duet = new ArrayList<>(); // Initialisation de la collection de personnages
    }

    /**
     * Ajoute un personnage incarné par l'acteur.
     *
     * @param personnage Le personnage à ajouter
     */
    public void ajouterPersonnage(Personnage personnage) {
        duet.add(personnage);
    }

    //Méthode pour retourner le nombre de personnages incrnés par l'acteur
    public int nbPersonnages(){
        return duet.size();
    }

    

    /**
     * Retourne une représentation textuelle de l'objet Acteur.
     */
    @Override
    public String toString() {
        return "Acteur{" +
                "nom='" + nom + '\'' +
                ", duet=" + duet +
                '}';
    }
}

