import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ristorante da Marco");

        // Creazione della lista di portate
        List<Portate> menu = new ArrayList<>();
        System.out.println("Menu del Ristorante:");

        //Creazione oggetti antipasti
        Portate bruschetteConPomodorini = new Antipasti(false, true, " Bruschette con pomodorini ", 12.00,
                " (Ingredienti:pane casereccio, pomodorini, basilico, olio evo) ");

        Portate mistoDiFormaggi = new Antipasti(false, true, " Tagliere di formaggi x2 persone ", 25.00,
                " (Inredienti: gorgonzola, scagliette di parmiggiano, olive, mozzarella, stuzzichini misti) ");

        Portate frittoMisto = new Antipasti(true, false, " Fritto misto x 2 persone ", 15.00,
                " (Ingredienti: gamberi, triglie, sarde, calamari, pesciolini vari, moscardini) ");

        Portate patateFritte = new Antipasti(true, false, " Patatine fritte ", 6.00,
                " Patate surgelate, sale ");

        Portate insalataDiPolipo = new Antipasti(true, false, " Insalata di polpo ", 10.00,
                " polpo surgelato, prezzemolo, succo di limone, aglio");

        //Aggiungo gli antipasti al menu
        menu.add(bruschetteConPomodorini);
        menu.add(mistoDiFormaggi);
        menu.add(frittoMisto);
        menu.add(patateFritte);
        menu.add(insalataDiPolipo);
        //Utilizzo il for per attraversare l'arraylist
        for (Portate portata : menu) {
            if (portata instanceof Antipasti) {
                // Stampo i dettagli specifici dell'antipasto utilizzando il metodo della classe
                portata.stampaDettagliPortata(); //
            }
        }

        System.out.println("Primi piatti: ");

        Portate linguineConVongole = new PrimiPiatti("Linguine con vongole", 18.00,
                "Pasta, vongole fresche, prezzemolo, aglio, olio evo", "Linguine");

        Portate carbonara = new PrimiPiatti("Carbonara", 16.00,
                "Pasta, guanciale, pecorino romano, tuorlo, pepe", "Rigatoni");

        Portate spaghettiAiRicciDiMareEGamberi = new PrimiPiatti("Spaghetti ai ricci di mare e gamberi", 18.00,
                "spaghetti, ricci di mare, gamberetti, prezzemolo, aglio, vino bianco," +
                        "olio extravergine d'oliva, pepe, peperoncino, sale", "spaghetti");

        Portate farfalleSalmoneEPanna = new PrimiPiatti("Farfalle Salmone e Panna", 15.00,
                "farfalle, salmone, panna fresca, vino bianco, cipolla, olio extravergine d'oliva, sale, pepe",
                "farfalle");

        Portate risottoSpeckEFunghi = new PrimiPiatti("Risotto Speck e funghi", 12.00,
                "riso, speck, funghi porcini, brodo vegetale, cipolla, parmigiano, olio d'oliva, sale, pepe",
                "riso");

        menu.add(linguineConVongole);
        menu.add(carbonara);
        menu.add(spaghettiAiRicciDiMareEGamberi);
        menu.add(farfalleSalmoneEPanna);
        menu.add(risottoSpeckEFunghi);
        for (Portate portata : menu){
            if (portata instanceof PrimiPiatti) {
                portata.stampaDettagliPortata();
            }
        }


        System.out.println("Secondi Piatti: ");

        Portate secondoSpada = new SecondiPiatti("Involtini al pesce spada gratinati al pistacchio", 18.50d,
                "fettine di pesce spada, pangrattato, pistacchi tritati," +
                        " olio d'oliva, aglio, prezzemolo, sale, pepe, limone", "Al forno");

        Portate secondoSpiedini = new SecondiPiatti("Spiedini di gamberi", 11.00d,
                "gamberi, olio d'oliva, aglio, prezzemolo, limone, sale, pepe", "cottura su piastra");

        Portate secondoFiorentina = new SecondiPiatti("Fiorentina", 43.00d,
                "bistecca di manzo (T-bone), olio d'oliva, sale grosso, pepe nero", "alla brace");

        Portate secondoCarnePizzaiola = new SecondiPiatti("Carne alla pizzaiola", 14.00d,
                "fettine di carne di manzo, passata di pomodoro, aglio, origano, olio d'oliva, sale", "in pentola");


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
