/**
 * Classe représentant un personnage de la saga Star Wars.
 */
class Personnage {
    private String nom;
    private String cote; // "Côté obscur" ou "Force"

    // Constructeur
    public Personnage(String nom, String cote) {
        this.nom = nom;
        this.cote = cote;
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", cote='" + cote + '\'' +
                '}';
    }
}


