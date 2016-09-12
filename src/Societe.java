/**
 * Created by yassirhessane on 19/08/16.
 */
abstract class Societe {

    protected String nom;
    protected String email;
    protected String adresse;

    public Societe(String nom, String email, String adresse) {
        this.setNom(nom);
        this.setEmail(email);
        this.setAdresse(adresse);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public abstract boolean ajouteFiliale(Societe filiale);

    public abstract void accepteVisiteur(Visiteur visiteur);
}
