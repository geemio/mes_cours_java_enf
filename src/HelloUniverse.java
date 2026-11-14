public class HelloUniverse {

    public static void main(String[] args){
        
        // String phrase = "En %d, les planètes du système solaire étaient au nombre de : %d";
        // int nbPlanetes=0;
        // short annee=2000;
        // if (annee<2006) {
        //     nbPlanetes=9;
        // } else {
        //     nbPlanetes=8;
        // }

        // System.out.printf(phrase,annee,nbPlanetes);
        int mois = 12;
        switch (mois){
            case 1 : {
                System.out.println("Janvier");
                break;
            }
            case 2 : {
                System.out.println("Février");
                break;
            }
            case 3 : {
                System.out.println("Mars");
                break;
            }
            case 4 : {
                System.out.println("Avril");
                break;
            }
            case 5 : {
                System.out.println("Mai");
                break;
            }
            case 6 : {
                System.out.println("Juin");
                break;
            }
            case 7 : {
                System.out.println("Juillet");
                break;
            }
            case 8 : {
                System.out.println("Aout");
                break;
            }
            case 9 : {
                System.out.println("Septembre");
                break;
            }
            case 10 : {
                System.out.println("Octobre");
                break;
            }
            case 11 : {
                System.out.println("Novembre");
                break;
            }
            case 12 : {
                System.out.println("Decembre");
                break;
            }
            default:
                System.out.println("Ce mois n'existe pas !");
        }
        
    }
    
}
