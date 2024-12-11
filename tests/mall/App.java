public class App {

    public static void main(String[] args) {
        
        ArtStore artemis = new ArtStore("Artemis", 5000, 350);
        GameStore freak = new GameStore("Freak", 1000, 150);
        Cinema ritz = new Cinema("CineRitz", 5000, 15);

        artemis.addPainting("Mona Lisa", 198.30f);
        artemis.addPainting("De sterrennacht", 292.53f);

        freak.addGames("LEGO Star Wars the Complete Saga", 199.90f);
        freak.addGames("Don't Starve Together", 24.90f);
        freak.addGames("Minecraft", 89.90f);

        ritz.buyMovie("Megalopolis", 5.50f);
        ritz.buyMovie("The Last Dance", 453.30f);
        ritz.buyMovie("Wicked", 10.25f);

        Costumer joao = new Costumer("João Paulo", 15063.86f);
        Costumer eduardo = new Costumer("Eduardo", 375f);
        Costumer gabriel = new Costumer("Gabriel", 700f);

        ritz.sellTicket(2, gabriel);
        ritz.sellTicket(1, eduardo);

        artemis.sellPainting("De sterrennacht", joao);
        artemis.sellPainting("Mona Lisa", joao);
        artemis.addPainting("Nascita di Venere", 221.47f);
        
        freak.sellGames("Minecraft", gabriel);
        freak.sellGames("LEGO Star Wars the Complete Saga", joao);
        freak.sellGames("Don't Starve Together", eduardo);

        ritz.sellTicket(1, gabriel);
        ritz.sellTicket(4, joao);
        
        freak.addGames("Stardew Valley", 32.50f);

        ritz.sellTicket(300, joao);

        System.out.println(artemis.getProfit());
        System.out.println(freak.getProfit());
        System.out.println(ritz.getProfit());

    }

}