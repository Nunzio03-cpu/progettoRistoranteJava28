public class Main {
    public static void main(String[] args) {

        System.out.println("Ristorante da Marco");


        Portate secondoSpada = new SecondiPiatti("Involtini al pesce spada", 18.50d, " cotto al forno");

        secondoSpada.aggiungiIngredienti("fettine di pesce spada, ");
        secondoSpada.aggiungiIngredienti("panGrattato, ");
        secondoSpada.aggiungiIngredienti("pistacchi tritati, ");
        secondoSpada.aggiungiIngredienti("olio d'oliva, ");
        secondoSpada.aggiungiIngredienti("aglio, ");
        secondoSpada.aggiungiIngredienti("prezzemolo, ");
        secondoSpada.aggiungiIngredienti("sale, ");
        secondoSpada.aggiungiIngredienti("pepe, ");
        secondoSpada.aggiungiIngredienti("limone");
        secondoSpada.rimuoviIngredienti("");

        secondoSpada.stampaDettagliPortata();

        Portate secondoSpiedini = new SecondiPiatti("Spiedini di gamberi", 11.00d, "cottura su piastra");

        secondoSpiedini.aggiungiIngredienti("gamberi, ");
        secondoSpiedini.aggiungiIngredienti("olio d'oliva, ");
        secondoSpiedini.aggiungiIngredienti("aglio, ");
        secondoSpiedini.aggiungiIngredienti("prezzemolo, ");
        secondoSpiedini.aggiungiIngredienti("sale, ");
        secondoSpiedini.aggiungiIngredienti("pepe, ");
        secondoSpiedini.aggiungiIngredienti("limone");
        secondoSpiedini.rimuoviIngredienti("");

        secondoSpiedini.stampaDettagliPortata();

        Portate secondoFiorentina = new SecondiPiatti("Fiorentina", 43.00d,"alla brace");

        secondoFiorentina.aggiungiIngredienti("bistecca di manzo (T-bone), ");
        secondoFiorentina.aggiungiIngredienti("olio d'oliva, ");
        secondoFiorentina.aggiungiIngredienti("sale grosso, ");
        secondoFiorentina.aggiungiIngredienti("pepe nero");
        secondoFiorentina.rimuoviIngredienti("");

        secondoFiorentina.stampaDettagliPortata();

        Portate secondoCarnePizzaiola = new SecondiPiatti("Carne alla pizzaiola", 14.00d, "in pentola");
        secondoCarnePizzaiola.aggiungiIngredienti("carne di manzo, ");
        secondoCarnePizzaiola.aggiungiIngredienti("passata di pomodoro, ");
        secondoCarnePizzaiola.aggiungiIngredienti("aglio, ");
        secondoCarnePizzaiola.aggiungiIngredienti("origano, ");
        secondoCarnePizzaiola.aggiungiIngredienti("olio d'oliva, ");
        secondoCarnePizzaiola.aggiungiIngredienti("sale");
        secondoCarnePizzaiola.rimuoviIngredienti("");

        secondoCarnePizzaiola.stampaDettagliPortata();

        Portate secondoCozze = new SecondiPiatti("Cozze gratinate", 11.50d, "al forno");
        secondoCozze.aggiungiIngredienti("cozze, ");
        secondoCozze.aggiungiIngredienti("pangrattato, ");
        secondoCozze.aggiungiIngredienti("aglio, ");
        secondoCozze.aggiungiIngredienti("prezzemolo, ");
        secondoCozze.aggiungiIngredienti("olio d'oliva, ");
        secondoCozze.aggiungiIngredienti("sale, ");
        secondoCozze.aggiungiIngredienti("pepe, ");
        secondoCozze.rimuoviIngredienti("");

        secondoCozze.stampaDettagliPortata();






        System.out.println("Coperto a persona: 2.50 €");



        }
    }
