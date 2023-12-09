package macchinettaCaffe;

public class Runner {

	public static void main(String[] args) {

		MacchinettaErogatrice macchinetta1 = new MacchinettaErogatrice("IKAJS4444WQ", 10, 10, 1, 2);
		MacchinettaErogatrice macchinetta2 = new MacchinettaErogatrice("P1QQ77852AS", 10, 0, 2, 4);
		
		MacchinettaErogatrice macchinettaCopia = new MacchinettaErogatrice("BBNQ77852AS", macchinetta2);
		
		Chiavetta chiavetta1 = new Chiavetta("Glenda", "TT158721", 0);
		Chiavetta chiavetta2 = new Chiavetta("Gustavo", "KK778811", 0);
		
		// stampo il resoconto della macchinetta copia per confermare che è stata copiata di forma giusta
		macchinettaCopia.stampaResoconto();

		// provo a erogare un caffè senza aver credito nella chiavetta
		macchinetta1.erogaCaffe(chiavetta1);

		// aggiungo credito alla mia chiavetta
		chiavetta1.aggiungiCredito(8);
		
		// stampo il resoconto per vedere se è andato a buon fine
		chiavetta1.stampaResoconto();
		
		// provo nuovamente a erogare un caffè, adesso avendo credito
		macchinetta1.erogaCaffe(chiavetta1);
		
		// stampo il resoconto della mia chiavetta per vedere quanto ho di credito
		chiavetta1.stampaResoconto();

		// aggiungo credito alla mia chiavetta
		chiavetta2.aggiungiCredito(8);
		
		// stampo il resoconto per vedere se è andato a buon fine
		chiavetta2.stampaResoconto();

		// provo a erogare un tè in una macchinetta senza cialde
		macchinetta2.erogaTe(chiavetta2);

		// faccio la ricarica delle cialde di tè 
        MacchinettaErogatrice.caricaMacchinetta(macchinetta2,"te", 12);
        
		// stampo il resoconto per vedere se la ricarica è stata fatta
        macchinetta2.stampaResoconto();
        
		// provo nuovamente a erogare un tè, adesso avendo cialde
		macchinetta2.erogaTe(chiavetta2);

		// provo a ricaricare le cialde e aggiornare il costo
        MacchinettaErogatrice.caricaMacchinettaAggiornandoCosto(macchinetta2,"te",8,3);

		// stampo il resoconto per vedere se la ricarica e l'aggiornamento sono stati effettuati
        macchinetta2.stampaResoconto();
	}

}
