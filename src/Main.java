import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //prova stampa ristorante
        System.out.println();
        Ristorante ristorante = new Ristorante("Da Chef Marco", "Marco Brazorf");
        System.out.println("Nome ristorante: " + ristorante.getNomeRistorante() + ", nome dello chef: " + ristorante.getChef());
        System.out.println();
        System.out.println("Menù che offre il ristorante:");

        // Creazione del menu
        Menu menuVegetariano = new Menu("Menu Vegetariano", TipoMenuEnum.VEGETARIANO);

        //Aggiunti gli antipasti vegetariani
        menuVegetariano.aggiungiPortata(new Antipasti("Si", " Tagliere di formaggi x2 persone ", 25.00,
                " Inredienti: gorgonzola, scagliette di parmiggiano, olive, mozzarella, stuzzichini misti "));
        menuVegetariano.aggiungiPortata(new Antipasti("Si","Bruschette con pomodorini ",12.00,
                "Ingredienti:pane casereccio, pomodorini, basilico, olio evo"));
        menuVegetariano.aggiungiPortata(new Antipasti("Si", "Caprese con mozzarella di bufala", 15.00,
                "Fette di pomodoro fresco, mozzarella di bufala, basilico, olio d'oliva, sale"));

        //Aggiunta primi piatti vegetariani
        menuVegetariano.aggiungiPortata(new PrimiPiatti("Risotto agli asparagi",10.00,
                "Riso, asparagi freschi, scalogno, un tocco di parmiggiano", "Riso"));
        menuVegetariano.aggiungiPortata(new PrimiPiatti("Trofie al pesto di pistacchio", 13.00,
                "Trofie, pesto di pistacchio DOP di Bronte, pinoli tostati", "Trofie"));
        menuVegetariano.aggiungiPortata(new PrimiPiatti("Penne alla boscaiola", 8.00,"Pasta, " +
                "funghi, panna fresca, salsa di pomodoro, sale, olio","Penne"));

        //Aggiunti i secondi piatti
        menuVegetariano.aggiungiPortata(new SecondiPiatti("Involtini di melanzane al forno", 10.00,
                "Melanzane, pane grattato, parmiggiano, olio, sale, salsa fresca di pomodoro", "Forno"));
        menuVegetariano.aggiungiPortata(new SecondiPiatti("Frittata di zucchine", 7.00,
                "Preparato di uovo, zucchine grattuggiate, sale, menta fresca", "Fritta con olio di semi" ));
        menuVegetariano.aggiungiPortata(new SecondiPiatti("Burger vegetariano con patate", 14.00,
                " Hamburger di ceci e verdure, patate, pomodoro, sale, pepe, rosmarino", "Hamburger alla piastra, patate al forno"));

        //Aggiunti dessert
        menuVegetariano.aggiungiPortata(new Dessert("Tiramisu'", 8.00,"mascarpone, uova, savoiardi, " +
                "zucchero, caffè, cacao amaro in polvere",true));
        menuVegetariano.aggiungiPortata(new Dessert("Torta al limone", 12.00," farina'00', zucchero, " +
                "uova, olio di semi, succo di limone, scorza di limone, lievito, burro, sale", true ));
        menuVegetariano.aggiungiPortata(new Dessert("Cannolo Siciliano",8.00,
                "farina'00', burro, cacao, zucchero, sale, ricotta di mucca, " +
                        "amido di mais modificato, vanillina ", true));


        //Creazione menu vegano
        Menu menuVegano = new Menu("Menu Vegano", TipoMenuEnum.VEGANO);

        //Aggiunti gli antipasti
        menuVegano.aggiungiPortata(new Antipasti("Si", "Hummus di ceci e verdure crude", 8.00,
                " crema di ceci, paprika, olio d'oliva, bastoncini di carota, cetriolo, sedano"));
        menuVegano.aggiungiPortata(new Antipasti("No, prodotto surgelato ", " Patatine fritte ", 6.00,
                " Patate surgelate, sale "));
        menuVegano.aggiungiPortata(new Antipasti("Si", "Zucca in agrodolce", 8.00,
                "Zucca, olio, aceto, zucchero, aglio, sale"));

        //Aggiunti primi piatti
        menuVegano.aggiungiPortata(new PrimiPiatti("Risotto allo zafferano", 13.00,
                "Riso cremoso mantecato senza burro, zafferano, sale, pepe", "Riso"));
        menuVegano.aggiungiPortata(new PrimiPiatti("Pasta e fagioli", 10.00,
                "Pasta, fagioli, cipolla, olio, sale, salsa di pomodoro", "Orecchiette"));
        menuVegano.aggiungiPortata(new PrimiPiatti("Linguine con cavolini di Bruxelles e limone", 12.00,
                "Pasta, cavolini di Bruxelles, limone, panna di soia, senape, rosmarino tritato, sale, pepe", "Linguine"));

        //Aggiunti secondi piatti
        menuVegano.aggiungiPortata(new SecondiPiatti("Burger di ceci con maionese vegana", 14.00,
                "Burger di ceci, panino integrale, lattuga, pomodoro, maionese a base di latte di soia","Alla piastra"));
        menuVegano.aggiungiPortata(new SecondiPiatti("Tofu marinato con verdure grigliate", 15.00,
                "Fette di tofu marinato con salsa di soia, zenzero, limone, accompagnato da zucchine, peperoni, melanzane",
                "Al vapore"));
        menuVegano.aggiungiPortata(new SecondiPiatti("Seitan al vino bianco con funghi", 16.50,
                "Fette di Seitan saltate in padella, funghi, sfumatura di vino bianco", "In padella"));

        //Aggiunti dessert
        menuVegano.aggiungiPortata(new Dessert("Sorbetto al cantalupo", 8.00,"acqua, succo di limone," +
                " scorza di limone, melone cantalupo, zucchero, sale", true));


        //Creazione del menu carnivoro
        Menu menuCarnivoro = new Menu("Menu Carnivoro", TipoMenuEnum.CARNIVORO);

        //Aggiunti antipasti
        menuCarnivoro.aggiungiPortata(new Antipasti("Si", " Fritto misto x 2 persone ", 15.00,
                " Ingredienti: gamberi, triglie, sarde, calamari, pesciolini vari, moscardini"));
        menuCarnivoro.aggiungiPortata(new Antipasti("Si", " Insalata di polpo ", 10.00,
                " polpo, prezzemolo, succo di limone, aglio "));
        menuCarnivoro.aggiungiPortata(new Antipasti("No", "Carpaccio di manzo", 11.50,
                "Fettine sottili di manzo, rucola, scaglie di parmiggiano, olio d'oliva, sale"));

        //Aggiunti primi piatti
        menuCarnivoro.aggiungiPortata(new PrimiPiatti("Linguine con vongole", 18.00,
                "Pasta, vongole fresche, prezzemolo, aglio, olio evo", "Linguine"));
        menuCarnivoro.aggiungiPortata(new PrimiPiatti("Carbonara", 16.00,
                "Pasta, guanciale, pecorino romano, tuorlo, pepe", "Rigatoni"));
        menuCarnivoro.aggiungiPortata(new PrimiPiatti("Risotto Speck e funghi", 12.00,
                "riso, speck, funghi porcini, brodo vegetale, cipolla, parmigiano, olio d'oliva, sale, pepe",
                "riso"));

        //Aggiunti secondi piatti
        menuCarnivoro.aggiungiPortata(new SecondiPiatti("Involtini al pesce spada gratinati al pistacchio", 18.50d,
                "fettine di pesce spada, pangrattato, pistacchi tritati, olio d'oliva, aglio, prezzemolo, sale, pepe, limone", "Al forno"));
        menuCarnivoro.aggiungiPortata(new SecondiPiatti("Fiorentina al Kg", 43.00,
                "bistecca di manzo (T-bone), olio d'oliva, sale grosso, pepe nero", "alla brace"));
        menuCarnivoro.aggiungiPortata(new SecondiPiatti("Cozze gratinate", 11.50,
                "cozze, pangrattato, aglio, prezzemolo, olio d'oliva, sale, pepe",  "al forno"));

        //Aggiunti Dessert


        //Aggiunge menu al ristorante
        ristorante.aggiungiMenu(menuVegetariano);
        ristorante.aggiungiMenu(menuVegano);
        ristorante.aggiungiMenu(menuCarnivoro);



        ristorante.stampaDettagliRistorante(TipoMenuEnum.VEGETARIANO);
        ristorante.stampaDettagliRistorante(TipoMenuEnum.VEGANO);
        ristorante.stampaDettagliRistorante(TipoMenuEnum.CARNIVORO);

        System.out.printf("%-151s %s"," ", "Coperto a persona: 2,50 €");
    }
}
