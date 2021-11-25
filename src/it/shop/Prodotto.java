package it.shop;

import java.util.Random;

public class Prodotto {
	
	
	//attributi
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva = (float) 0.22;
	
	
	//costruttore del prodotto
	public Prodotto(String nome, String descrizione, float prezzo) {
		this.codice = generaCodice();
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescrizione() {
		return descrizione;
	}



	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public float getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}



	public float getIva() {
		return iva;
	}



	public void setIva(float iva) {
		this.iva = iva;
	}



	public int getCodice() {
		return codice;
	}



	//metodo per valorizzare il codice con un metodo random
	public int generaCodice() {
		Random random = new Random();
		return random.nextInt(100);
	}
	
	//metodo genera prezzo con IVA
	public float generaPrezzoIva() {
		float generaPrezzoIva = prezzo + (prezzo * iva);
		return generaPrezzoIva;
	}
	
	//metodo genera nome esteso del prodotto
	public String nomeEsteso() {
		String nomeEsteso = getCodice() + " - " + nome;
		return nomeEsteso;
	}
	
	//metodo per stampare tutte le info del prodotto
	public void infoProdotto() {
		System.out.println("Codice ID prodotto: " + getCodice());
		System.out.println("Nome prodotto: " + getNome());
		System.out.println("Nome esteso prodotto: " + nomeEsteso());
		System.out.println("Descrizione prodotto: " + getDescrizione());
		System.out.println("Prezzo base prodotto: " + getPrezzo() + "€");
		System.out.println("Prezzo prodotto con IVA: " + generaPrezzoIva() + "€");
	}
	
}
