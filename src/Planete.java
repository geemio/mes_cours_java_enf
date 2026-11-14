public class Planete {
    
    public String nom;
    public int diametre;
    public String matiere;
    public int totalVisiteurs;
    public Atmosphere atmosphere;

    void revolution(int angle){
        int tour = angle / 360;
        System.out.println(nom + " a effectué "+ tour + " tours autour de son étoile." );
    }

    void rotation(int angle){
        int tour = angle / 360;
        System.out.println(nom + " a effectué "+ tour +" tours sur elle-même.");
    }

    void accueillirVaisseau(int nouveauxHumains){
        totalVisiteurs += nouveauxHumains;
    }

    void accueillirVaisseau(String vaisseau){
        int nouveauxHumains = 0;
        if (vaisseau.equals("CHASSEUR")){
            nouveauxHumains = 3;
            totalVisiteurs += nouveauxHumains;
        } else if (vaisseau.equals("FREGATE") ){
            nouveauxHumains = 12;
            totalVisiteurs += nouveauxHumains;
        } else if (vaisseau.equals("CROISEUR")) {
            nouveauxHumains = 50;
            totalVisiteurs += nouveauxHumains;
        }
    }
    
}
