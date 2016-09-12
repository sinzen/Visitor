/**
 * Created by yassirhessane on 19/08/16.
 */
public class SocieteSansFiliale extends Societe {


    public SocieteSansFiliale(String nom, String email, String adresse) {
        super(nom, email, adresse);
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }

    @Override
    public void accepteVisiteur(Visiteur visiteur) {
        visiteur.visiteSocieteSansFiliale(this);
    }
}
