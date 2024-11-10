public class Main {
    public static void main(String[] args) {

        System.out.println("Ristorante da Marco");

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
