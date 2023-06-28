
import java.util.ArrayList;
import java.util.List;

import glaces.*;
import util.Clavier;

public class Commande {
   private List<CoupeGlacee> coupesGlacees;

   public Commande() {
       this.coupesGlacees = new ArrayList<>();
   }

   public void enregistrerCommande() {
        Clavier clavier = Clavier.getInstance();
        boolean continuer = true;

        while(continuer) {
            System.out.println("Choisissez votre coupe de glace :");
            System.out.println("1. Triple Chocolat");
            System.out.println("2. Fruits Rouges");
            System.out.println("3. Terminer la commande");

            int choix = clavier.lireInt();

            CoupeGlacee maCoupe = null;

            switch(choix) {
                case 1:
                    maCoupe = TripleChocolat.getInstance();
                    System.out.println("Vous avez choisi une coupe Triple Chocolat.");
                    break;
                case 2:
                    maCoupe = FruitsRouges.getInstance();
                    System.out.println("Vous avez choisi une coupe Fruits Rouges.");
                    break;
                case 3:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }

            if(maCoupe != null) {
                boolean topping = true;

                while(topping) {
                    System.out.println("Choisissez un topping :");
                    System.out.println("1. Chantilly");
                    System.out.println("2. Sauce Chocolat");
                    System.out.println("3. Coulis Fraise");
                    System.out.println("4. Pas de topping supplémentaire");

                    int choixTopping = clavier.lireInt();

                    switch(choixTopping) {
                        case 1:
                            maCoupe = new Chantilly(maCoupe);
                            System.out.println("Vous avez ajouté de la chantilly à votre coupe.");
                            break;
                        case 2:
                            maCoupe = new SauceChocolat(maCoupe);
                            System.out.println("Vous avez ajouté de la sauce chocolat à votre coupe.");
                            break;
                        case 3:
                            maCoupe = new CoulisFraise(maCoupe);
                            System.out.println("Vous avez ajouté du coulis de fraise à votre coupe.");
                            break;
                        case 4:
                            topping = false;
                            break;
                        default:
                            System.out.println("Choix invalide. Veuillez réessayer.");
                            break;
                    }
                }

                this.addCoupeGlacee(maCoupe);
            }
        }
   }

   public void editerFacture() {
        System.out.println("Facture :");
        double total = 0;
        for (int i = 0; i < this.coupesGlacees.size(); i++) {
            CoupeGlacee coupe = this.coupesGlacees.get(i);
            System.out.println("Coupe " + (i+1) + " : " + coupe.Description() + " - " + coupe.Prix() + " euros");
            total += coupe.Prix();
        }
        System.out.println("Total : " + total + " euros");
    }


   public void addCoupeGlacee(CoupeGlacee coupe) {
       this.coupesGlacees.add(coupe);
   }
}
