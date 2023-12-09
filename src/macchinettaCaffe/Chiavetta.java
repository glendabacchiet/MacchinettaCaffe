package macchinettaCaffe;

public class Chiavetta {

	private String nomeProprietario, identificativoChiavetta;
	
	private int creditoResiduo, bevandeAcquistate; // bevandeAcquistate = contatore delle bevande acquistate (caffe e te)
	
	public Chiavetta(String nomeProprietario, String identificativoChiavetta, int creditoResiduo) {
		this.nomeProprietario = nomeProprietario;
		this.identificativoChiavetta = identificativoChiavetta;
		this.creditoResiduo = creditoResiduo;
		this.bevandeAcquistate = 0;
	}

	public int getCreditoResiduo() {
		return creditoResiduo;
	}

	/* acquistaBevanda -> metodo che accetta in ingresso il costo della bevanda da acquistare. 
	 * Se esiste credito sufficiente ritorna true (modificando le variabili interne in modo opportuno). Altrimenti ritorna false */
	public boolean acquistaBevanda(int costoBevanda) {
		boolean acquisto = false;
		//verifica se la chiavetta ha credito sufficiente
		if(creditoResiduo >= costoBevanda) {
			// nel caso sì, sottrai del creditoResiduo il costo della bevanda
			creditoResiduo -= costoBevanda;
			// incrementa la variabile di bevande acquistate
			bevandeAcquistate++;
			// e cambia la variabile confermando l'acquisto
			acquisto = true;
		}
		return acquisto;
	}
	
	/* aggiungiCredito -> in ingresso accetta il credito da caricare nella chiavetta */
	public void aggiungiCredito(int creditoDaAggiungere) {
		creditoResiduo += creditoDaAggiungere;
	}
	
	/* stampaResoconto → permette la stampa del resoconto della chiavetta con i suoi dati */
	public void stampaResoconto() {
		System.out.println("=================================== \n"
				+ "Resoconto chiavetta: " + identificativoChiavetta + "\n"
				+ " \n"
				+ "Proprietaria/o: " + nomeProprietario + "\n"
				+ "Bevande acquistate: " + bevandeAcquistate + "\n"
				+ "Credito residuo: " + creditoResiduo + "\n"
				+ "  \n"
				+ "Fine resoconto \n"
				+ "===================================");
	}
}
