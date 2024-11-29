import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ristorante da Marco");
        System.out.println("Menu del Ristorante:");

        // Creazione del menu
        Menu menu = new Menu("cc", TipoMenuEnum.VEGETARIANO);

        // Aggiunta delle portate: Antipasti
        menu.aggiungiPortata(new Antipasti(  "Si","Bruschette con pomodorini ",12.00,
                "Ingredienti:pane casereccio, pomodorini, basilico, olio evo"));
        menu.aggiungiPortata(new Antipasti( "Si", " Tagliere di formaggi x2 persone ", 25.00,
                " Inredienti: gorgonzola, scagliette di parmiggiano, olive, mozzarella, stuzzichini misti "));
        menu.aggiungiPortata(new Antipasti( "Si", " Fritto misto x 2 persone ", 15.00,
                " Ingredienti: gamberi, triglie, sarde, calamari, pesciolini vari, moscardini "));
        menu.aggiungiPortata(new Antipasti("No, prodotto surgelato ", " Patatine fritte ", 6.00,
                " Patate surgelate, sale "));
        menu.aggiungiPortata(new Antipasti("Si", " Insalata di polpo ", 10.00,
                " polpo, prezzemolo, succo di limone, aglio "));


        // // Aggiunta delle portate: Primi piatti
        menu.aggiungiPortata(new PrimiPiatti("Linguine con vongole", 18.00,
                "Pasta, vongole fresche, prezzemolo, aglio, olio evo", "Linguine"));
        menu.aggiungiPortata(new PrimiPiatti("Carbonara", 16.00,
                "Pasta, guanciale, pecorino romano, tuorlo, pepe", "Rigatoni"));
        menu.aggiungiPortata(new PrimiPiatti("Spaghetti ai ricci di mare e gamberi", 18.00,
                "spaghetti, ricci di mare, gamberetti, prezzemolo, aglio, vino bianco," +
                        "olio extravergine d'oliva, pepe, peperoncino, sale", "spaghetti"));
        menu.aggiungiPortata(new PrimiPiatti("Farfalle Salmone e Panna", 15.00,
                "farfalle, salmone, panna fresca, vino bianco, cipolla, olio extravergine d'oliva, sale, pepe",
                "farfalle"));
        menu.aggiungiPortata(new PrimiPiatti("Risotto Speck e funghi", 12.00,
                "riso, speck, funghi porcini, brodo vegetale, cipolla, parmigiano, olio d'oliva, sale, pepe",
                "riso"));

        // Aggiunta delle portate: Secondi piatti
        menu.aggiungiPortata(new SecondiPiatti("Involtini al pesce spada gratinati al pistacchio", 18.50d,
                "fettine di pesce spada, pangrattato, pistacchi tritati, olio d'oliva, aglio, prezzemolo, sale, pepe, limone", "Al forno"));
        menu.aggiungiPortata(new SecondiPiatti("Spiedini di gamberi", 11.00,
                "gamberi, olio d'oliva, aglio, prezzemolo, limone, sale, pepe", "cottura su piastra"));
        menu.aggiungiPortata(new SecondiPiatti("Fiorentina al Kg", 43.00,
                "bistecca di manzo (T-bone), olio d'oliva, sale grosso, pepe nero", "alla brace"));
        menu.aggiungiPortata(new SecondiPiatti("Carne alla pizzaiola", 14.00,
                "fettine di carne di manzo, passata di pomodoro, aglio, origano, olio d'oliva, sale", "in pentola"));
        menu.aggiungiPortata(new SecondiPiatti("Cozze gratinate", 11.50,
                "cozze, pangrattato, aglio, prezzemolo, olio d'oliva, sale, pepe",  "al forno"));

        // Aggiunta delle portate: Dessert
        menu.aggiungiPortata(new Dessert("Cannolo Siciliano",8.00,
                "farina'00', burro, cacao, zucchero, sale, ricotta di mucca, " +
                        "amido di mais modificato, vanillina ", false));
        menu.aggiungiPortata(new Dessert("Tiramisu'", 8.00,"mascarpone, uova, savoiardi, " +
                "zucchero, caffè, cacao amaro in polvere",true));
        menu.aggiungiPortata(new Dessert("Torta al limone", 12.00," farina'00', zucchero, " +
                "uova, olio di semi, succo di limone, scorza di limone, lievito, burro, sale", true ));
        menu.aggiungiPortata(new Dessert("Torta della nonna ", 12.00," farina'00', burro," +
                " zucchero a velo, uova, scorza di limone, sale, lievito, latte intero, zucchero, amido di mais, amido di riso, pinoli", true));
        menu.aggiungiPortata(new Dessert("Sorbetto al cantalupo", 8.00,"acqua, succo di limone," +
                " scorza di limone, melone cantalupo, zucchero, sale", true));

        // Stampa del menu
        menu.stampaMenu();

        //prova stampa ristorante
        Ristorante ciccio = new Ristorante("Da ciccio", "Ciccio");

        ciccio.aggiungiMenu(menu);

        ciccio.stampaDettagliRistorante();



    }
}
