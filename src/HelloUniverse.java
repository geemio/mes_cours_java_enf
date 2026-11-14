

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
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";
        System.out.println(jupiter.nom + " est une planète "+ jupiter.matiere + " avec un diamètre de "+ jupiter.diametre + " kilomètres.");
        neptune.revolution(-3542);
        mars.rotation(-684);
        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.printf("Le nombre d'humains ayant déja séjourné sur %s est actuellement de %d.", mars.nom, mars.totalVisiteurs);
    }

}