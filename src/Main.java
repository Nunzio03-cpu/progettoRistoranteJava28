import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ristorante da Marco");

        // Creazione della lista di portate
        List<Portate> menu = new ArrayList<>();
        System.out.println("Menu del Ristorante:");

        Portate linguineVongole = new PrimiPiatti("Linguine alle vongole", 18.00d, "linguine");

        linguineVongole.aggiungiIngredienti("pasta, ");
        linguineVongole.aggiungiIngredienti("vongole fresche, ");
        linguineVongole.aggiungiIngredienti("prezzemolo, ");
        linguineVongole.aggiungiIngredienti("aglio, ");
        linguineVongole.aggiungiIngredienti("olio evo.");
        linguineVongole.aggiungiIngredienti("");

        linguineVongole.stampaDettagliPortata();

        Portate carbonara = new PrimiPiatti("Carbonara", 16.00d, "rigatoni");

        carbonara.aggiungiIngredienti("pasta,");
        carbonara.aggiungiIngredienti("guanciale, ");
        carbonara.aggiungiIngredienti("pecorino romano, ");
        carbonara.aggiungiIngredienti("tuorlo d'uovo, ");
        carbonara.aggiungiIngredienti("pepe.");
        carbonara.aggiungiIngredienti("");

        carbonara.stampaDettagliPortata();

        Portate spaghettiRicciEGamberi = new PrimiPiatti("Spaghetti ricci di mare e gamberi", 18.00d, "spaghetti");

        spaghettiRicciEGamberi.aggiungiIngredienti("pasta, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("ricci di mare, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("gamberi, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("aglio, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("prezzemolo, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("vino bianco.");
        spaghettiRicciEGamberi.aggiungiIngredienti("sale, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("olio extravergine d'oliva, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("pepe, ");
        spaghettiRicciEGamberi.aggiungiIngredienti("peperoncino.");
        spaghettiRicciEGamberi.aggiungiIngredienti("");

        spaghettiRicciEGamberi.stampaDettagliPortata();

        Portate farfallePannaESalmone = new PrimiPiatti("Farfalle panna e salmone", 15.00d, "farfalle");

        farfallePannaESalmone.aggiungiIngredienti("pasta, ");
        farfallePannaESalmone.aggiungiIngredienti("salmone, ");
        farfallePannaESalmone.aggiungiIngredienti("panna fresca, ");
        farfallePannaESalmone.aggiungiIngredienti("vino bianco, ");
        farfallePannaESalmone.aggiungiIngredienti("cipolla.");
        farfallePannaESalmone.aggiungiIngredienti("olio extravergine d'oliva, ");
        farfallePannaESalmone.aggiungiIngredienti("sale, ");
        farfallePannaESalmone.aggiungiIngredienti("pepe.");
        farfallePannaESalmone.aggiungiIngredienti("");

        spaghettiRicciEGamberi.stampaDettagliPortata();

        Portate risottoSpeckEFunghi = new PrimiPiatti("Risotto speck e funghi", 12.00d, "riso parbloid");

        risottoSpeckEFunghi.aggiungiIngredienti("riso, ");
        risottoSpeckEFunghi.aggiungiIngredienti("speck, ");
        risottoSpeckEFunghi.aggiungiIngredienti("funghi porcini, ");
        risottoSpeckEFunghi.aggiungiIngredienti("brodo vegetale, ");
        risottoSpeckEFunghi.aggiungiIngredienti("cipolla, ");
        risottoSpeckEFunghi.aggiungiIngredienti("parmigiano, ");
        risottoSpeckEFunghi.aggiungiIngredienti("olio d'oliva, ");
        risottoSpeckEFunghi.aggiungiIngredienti("sale, ");
        risottoSpeckEFunghi.aggiungiIngredienti("pepe.");
        risottoSpeckEFunghi.aggiungiIngredienti("");

        risottoSpeckEFunghi.stampaDettagliPortata();



        System.out.println("Secondi Piatti: ");

        Portate secondoSpada = new SecondiPiatti("Involtini al pesce spada gratinati al pistacchio", 18.50d,
                "fettine di pesce spada, pangrattato, pistacchi tritati," +
                        " olio d'oliva, aglio, prezzemolo, sale, pepe, limone","Al forno");

        Portate secondoSpiedini = new SecondiPiatti("Spiedini di gamberi", 11.00d,
                "gamberi, olio d'oliva, aglio, prezzemolo, limone, sale, pepe",  "cottura su piastra");

        Portate secondoFiorentina = new SecondiPiatti("Fiorentina", 43.00d,
                "bistecca di manzo (T-bone), olio d'oliva, sale grosso, pepe nero","alla brace");

        Portate secondoCarnePizzaiola = new SecondiPiatti("Carne alla pizzaiola", 14.00d,
                "fettine di carne di manzo, passata di pomodoro, aglio, origano, olio d'oliva, sale","in pentola");


        Portate secondoCozze = new SecondiPiatti("Cozze gratinate", 11.50d,
                "cozze, pangrattato, aglio, prezzemolo, olio d'oliva, sale, pepe", "al forno");

        menu.add(secondoSpada);
        menu.add(secondoSpiedini);
        menu.add(secondoFiorentina);
        menu.add(secondoCarnePizzaiola);
        menu.add(secondoCozze);


        for (Portate portata : menu) {
            if (portata instanceof SecondiPiatti) {
                portata.stampaDettagliPortata(); // Stampa dettagli per le portate di tipo SecondiPiatti
            }
        }









        System.out.println("Coperto a persona: 2.50 €");



        }
    }
