

public class HelloUniverse {

    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "tellurique";
        Planete terre = new Planete();
        terre.nom = "La Terre";
        terre.diametre = 12756;
        terre.matiere = "tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        uranus.atmosphere = new Atmosphere();
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";
        System.out.println(jupiter.nom + " est une planète "+ jupiter.matiere + " avec un diamètre de "+ jupiter.diametre + " kilomètres.");
        neptune.revolution(-3542);
        mars.rotation(-684);
        // mars.accueillirVaisseau(8);
        // mars.accueillirVaisseau("FREGATE");
        System.out.printf("Le nombre d'humains ayant déja séjourné sur %s est actuellement de %d.", mars.nom, mars.totalVisiteurs);
        uranus.atmosphere.tauxHydrogene = 83F;
        uranus.atmosphere.tauxHelium = 15F;
        uranus.atmosphere.tauxMethane = 2.5F;
        System.out.println("L'atmosphère de "+ uranus.nom + " est composée : ");
        System.out.println("A "+ uranus.atmosphere.tauxHydrogene + "% d'hydrogène" );
        System.out.println("A "+ uranus.atmosphere.tauxArgon + "% d'argon" );
        System.out.println("A "+ uranus.atmosphere.tauxDyoxydeDeCarbone + "% de dioxyde de carbone" );
        System.out.println("A "+ uranus.atmosphere.tauxAzote + "% d'azote" );
        System.out.println("A "+ uranus.atmosphere.tauxHelium + "% d'helium" );
        System.out.println("A "+ uranus.atmosphere.tauxMethane + "% de méthane" );
        System.out.println("A "+ uranus.atmosphere.tauxSodium + "% de sodium" );

        Vaisseau fregate = new Vaisseau();
        fregate.type = "FREGATE";
        fregate.nbPassagers = 9;
        Vaisseau croiseur = new Vaisseau();
        croiseur.type = "CROISEUR";
        croiseur.nbPassagers = 42;
        mars.accueillirVaisseau(fregate);
        mars.accueillirVaisseau(croiseur);

    }

}