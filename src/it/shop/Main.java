package it.shop;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("NUOVO PRODOTTO 1 DELLO SHOP");
		
		Prodotto prodottoScarpe = new Prodotto("Scarpe", "Da uomo taglia 44", 10);
		
		prodottoScarpe.infoProdotto();
		
		
//		System.out.println("\nNUOVO PRODOTTO 2 DELLO SHOP");
//		
//		Prodotto prodottoMaglietta = new Prodotto("Maglietta", "Da uomo taglia XXL", 40);
//		
//		prodottoMaglietta.infoProdotto();
	}

}
