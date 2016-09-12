import java.util.ArrayList;
import java.util.List;

/**
 * Created by yassirhessane on 19/08/16.
 */
public class SocieteMere extends Societe {

    protected List<Societe> societeArrayList = new ArrayList<>();


    public SocieteMere(String nom, String email, String adresse) {
        super(nom, email, adresse);
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return this.societeArrayList.add(filiale);
    }

    @Override
    public void accepteVisiteur(Visiteur visiteur) {
        visiteur.visiteSocieteMere(this);
        for (Societe s: this.societeArrayList)
        {
            s.accepteVisiteur(visiteur);
        }
    }
}
