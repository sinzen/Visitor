public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Societe s1 = new SocieteSansFiliale("societe 1","info@societe1.com","rue de la societe 1");
        Societe s2 = new SocieteSansFiliale("societe 2","info@societe2.com","rue de la societe 2");
        Societe g1 = new SocieteMere("groupe 1","info@groupe1.com","rue du groupe 1");
        g1.ajouteFiliale(s1);
        g1.ajouteFiliale(s2);
        Societe s3 = new SocieteSansFiliale("societe 3","info@societe3.com","rue de la societe 3");
        Societe g2 = new SocieteMere("groupe 2","info@groupe2.com","rue du groupe 2");
        g2.ajouteFiliale(g1);
        g2.ajouteFiliale(s3);
        g2.accepteVisiteur(new VisiteurMailingCommercial());


    }
}
