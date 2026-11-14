public class Planete {
    
    public String nom;
    public int diametre;
    public String matiere;

    void revolution(){
        System.out.println("Je suis la planète "+ nom + " et je tourne autour de mon étoile." );
    }

    void rotation(){
        System.out.println("Je suis la planète "+ nom + " et je tourne sur moi-même.");
    }
    
}
