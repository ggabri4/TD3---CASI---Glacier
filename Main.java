import glaces.*;
import util.Clavier;

public class Main {
    public static void main(String[] args) {
        Commande maCommande = new Commande();

        maCommande.enregistrerCommande();
        // Edition de la facture
        maCommande.editerFacture();
    }
}
