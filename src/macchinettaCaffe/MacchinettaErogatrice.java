package macchinettaCaffe;

public class MacchinettaErogatrice {

	private String identificativoMacchinetta; // univoco

	private int cialdeCaffe, cialdeTe, costoCaffe, costoTe, bevandeErogate; // bevandeErogate = contatore delle bevande erogate (caffe e te)

	public MacchinettaErogatrice(String identificativoMacchinetta, int cialdeCaffe, int cialdeTe, int costoCaffe,
			int costoTe) {
		this.identificativoMacchinetta = identificativoMacchinetta;
		this.cialdeCaffe = cialdeCaffe;
		this.cialdeTe = cialdeTe;
		this.costoCaffe = costoCaffe;
		this.costoTe = costoTe;
		this.bevandeErogate = 0;
	}
	
	/*In fase di installazione iniziale le macchinette hanno tutte la stessa configurazione, deve essere pertanto 
	 * possibile crearne nuove partendo da una prima iniziale */
	public MacchinettaErogatrice(String idNuovaMacchinetta, MacchinettaErogatrice macchinettaModelo) {
        this.identificativoMacchinetta = idNuovaMacchinetta;
        this.cialdeCaffe = macchinettaModelo.cialdeCaffe;
        this.cialdeTe = macchinettaModelo.cialdeTe;
        this.costoCaffe = macchinettaModelo.costoCaffe;
        this.costoTe = macchinettaModelo.costoTe;
        this.bevandeErogate = 0;
	}

	/* Metodo erogaCaffe -> in ingresso accetterà una chiavetta e ritorna vero o falso a seconda che sia riuscita ad
	 * erogare il caffè. Un caffè può essere erogato se il credito nella chiavetta è disponibile e se ci sono cialde
	 * disponibili. Al termine di ogni operazione deve essere stampato un messaggio informando all'utente lo status */
	public boolean erogaCaffe(Chiavetta chiavettaInserita) {
		// verifico se ci sono cialde nella macchinetta
		if (cialdeCaffe > 0) {
			// chiamo il metodo acquistaBevanda per verificare se esiste credito sufficiente nella chiavetta
			boolean caffeErogato = chiavettaInserita.acquistaBevanda(costoCaffe);
			if (caffeErogato == true) {
				// se sì, incremento la variabile di bevandeErogate
				bevandeErogate++;
				// faccio sapere all'utente che la bevanda è stata erogata
				System.out.println("Caffè erogato!");
				// e ritorno il valore 
				return caffeErogato;
			} else {
				// faccio sapere all'utente che non ha credito sufficiente
				System.out.println("Credito NON sufficiente - Disponibile: " + chiavettaInserita.getCreditoResiduo()
						+ " - Costo caffè: " + costoCaffe);
			}
		} else {
			// faccio sapere all'utente che non ci sono cialde
			System.out.println("Cialde di caffè NON disponibile!");
		}
		return false;
	}

	public boolean erogaTe(Chiavetta chiavettaInserita) {
		// verifico se ci sono cialde nella macchinetta
		if (cialdeTe > 0) {
			// chiamo il metodo acquistaBevanda per verificare se esiste credito sufficiente nella chiavetta
			boolean teErogato = chiavettaInserita.acquistaBevanda(costoTe);
			if (teErogato == true) {
				// se sì, incremento la variabile di bevandeErogate
				bevandeErogate++;
				// faccio sapere all'utente che la bevanda è stata erogata
				System.out.println("Tè erogato!");
				// e ritorno il valore 
				return teErogato;
			} else {
				// faccio sapere all'utente che non ha credito sufficiente
				System.out.println("Credito NON sufficiente - Disponibile: " + chiavettaInserita.getCreditoResiduo()
						+ " - Costo tè: " + costoTe);
			}
		} else {
			// faccio sapere all'utente che non ci sono cialde
			System.out.println("Cialde di tè NON disponibile!");
		}
		return false;
	}

	/* Metodo StampaResoconto -> stampa il resoconto dei dati della macchinetta */
	public void stampaResoconto() {
		System.out.println("=================================== \n"
				+ "Resoconto macchinetta: " + identificativoMacchinetta + "\n"
				+ " \n"
				+ "Costo caffè: " + costoCaffe + "€\n"
				+ "Costo tè: " + costoTe + "€\n"
				+ " \n"
				+ "Cialde caffè residue: " + cialdeCaffe + "\n"
				+ "Cialde tè residue: " + cialdeTe + "\n"
				+ " \n"
				+ "Totale bevande erogate: " + bevandeErogate + "\n"
				+ "  \n"
				+ "Fine resoconto \n"
				+ "===================================");
	}

	/* L’addetto alla manutenzione ha la possibilità di caricare la macchinetta indicando la macchinetta
	 * da caricare, la tipologia (caffe o te) e la quantità che inserisce nella macchinetta) */
	public static void caricaMacchinetta(MacchinettaErogatrice macchinettaDaCaricare, String tipoCialde,
			int quantitaDaCaricare) {
		// verifico se il tipo scelto è stato caffè
		if (tipoCialde.equals("caffe")){
			// nel caso sì, sommo la quantità da inserire alla quantità di cialde di caffè
			macchinettaDaCaricare.cialdeCaffe += quantitaDaCaricare;
		} else {
			// altrimenti aggiungo alla quantità di cialde di tè
			macchinettaDaCaricare.cialdeTe += quantitaDaCaricare;
		}
	}

	/* oppure di caricare aggiornando contestualmente anche il costo della bevanda*/
	public static void caricaMacchinettaAggiornandoCosto(MacchinettaErogatrice macchinettaDaCaricare, String tipoCialde,
			int quantitaDaCaricare, int nuovoCosto) {
		// verifico se il tipo scelto è stato caffè
		if (tipoCialde.equals("caffe")){
			// nel caso sì, sommo la quantità da inserire alla quantità di cialde di caffè
			macchinettaDaCaricare.cialdeCaffe += quantitaDaCaricare;
			// anche aggiorno il costo del caffè 
			macchinettaDaCaricare.costoCaffe = nuovoCosto;
		} else {
			// altrimenti aggiungo alla quantità di cialde di tè
			macchinettaDaCaricare.cialdeTe += quantitaDaCaricare;
			// anche aggiorno il costo del tè 
			macchinettaDaCaricare.costoTe = nuovoCosto;
		}

	}
}
