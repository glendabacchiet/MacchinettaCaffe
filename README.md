<h1> Macchinetta Erogatrice (Caffè e tè) </h1>

  <p>
    <strong> Un software per la gestione dell'erogazione di caffè e tè da una macchinetta automatica, che è stato fatto utilizzando il linguaggio Java. Vi spiego come funziona ogni pezzo. </strong>
  </p>
  
<div>
  <p> La classe Macchinetta Erogatrice è costituita dalle seguenti proprietà: </p>
  <ul>
    <li> Identificativo macchina: attributo di tipo string che serve per individualizzare e identificare ogni macchinetta (univoco); </li>
    <li> Cialde caffè e cialde tè: attributi di tipo int, servono per allocare quante cialde di ogni tipo ci sono disponibili; </li>
    <li> Costo caffè e costo tè: attributi di tipo int, servono per individuare il costo per erogazione di ogni bevanda; </li>
    <li> Bevande erogate: attributo di tipo int, utilizzato come contatore della summa di bevande erogate; </li>
  </ul>
</div>

  <p> 
    In fase di installazione iniziale le macchinette hanno tutte la stessa configurazione, è pertanto possibile crearne nuove partendo da una prima iniziale come modello, tenendo conto che il codice 
    identificativo è univoco per ogni macchinetta, quindi anche se è possibile fare un clone, il codice identificativo sarà diverso. </strong>
  </p>

<div>
  <p> Sono disponibili i seguenti metodi: </p>
  <ul>
    <li> Eroga caffè ed eroga tè → accetta in ingresso un oggetto di tipo 'Chiavetta' e ritorna vero o falso a seconda che sia riuscita o meno a erogare la bevanda in questione. La erogazione della bevanda è 
      fatta con successo se vi sono cialde disponibili nella macchinetta e se esiste credito sufficiente nella chiavetta inserita in ingresso. Al termine dell'operazione è stampato un messaggio secondo
    lo status della erogazione:
      <ul>
        <li>"Bevanda erogata!": è stato verificato che c'erano cialde disponibile nella macchinetta e pure credito sufficiente nella chiavetta, quindi la bevanda è stata erogata con successo; </li>
        <li>"Bevanda NON disponibile!": esiste credito disponibile nella chiavetta inserita, ma non ci sono cialde disponibili nella macchinetta, pertanto non è possibile erogare la bevanda; </li>
        <li>"Credito NON sufficiente – Disponibile: <creditoDisponibile> - Costo: <costoBevanda>": in questo caso esistono cialde disponibili ma non esiste credito sufficiente nella chiavetta, il messaggio 
          restituito informa quanto esiste di credito disponibile e in confronto il costo della bevanda che è stata scelta. </li>
      </ul>
    </li>
    <li> Stampa resoconto → stampa un riassunto dello status della macchinetta in un formato standard, informando il identificativo macchina, la quantità di cialde di ogni tipo residue, il costo di ogni bevanda 
      e il totale di bevande che sono state erogate; </li>
  </ul>
  <p> L'addetto alla manutenzione al caricare la macchinetta ha la possibilità di scegliere tra due opzione per caricarla: </p>
    <ul>
      <li> Carica macchinetta → effettua il caricamento di cialde nella macchinetta, accetta in ingresso un oggetto di tipo Macchinetta Erogatrice, la tipologia di bevande da caricare (caffè o tè) e la quantità
        di cialde da caricare; </li>
      <li> Carica macchinetta aggiornando costo → oltre effettuare il caricamento di cialde nella macchinetta, è anche possibile aggiornare il costo della bevanda caricata, accetta in ingresso un oggetto di 
        tipo Macchinetta Erogatrice, la tipologia di bevande da caricare (caffè o tè), la quantità di cialde da caricare e il nuovo costo della bevanda che è stata scelta; </li>
    </ul>
</div>

<div>
  <p> Le operazioni di erogazione o meno, avvengono attraverso una Chiavetta. La classe Chiavetta è costituita dalle seguenti proprietà:</p>
  <ul>
    <li> Nome proprietario: attributo di tipo string che identifica il nome del proprietario della chiavetta; </li>
    <li> Codice identificativo: attributo di tipo string che serve per individualizzare e identificare ogni chiavetta (univoco); </li>
    <li> Credito residuo: attributo di tipo int che alloca il credito residuo nella chiavetta; </li>
    <li> Bevande acquistate: attributo di tipo int, utilizzato come contatore della summa di bevande acquistate. </li>
  </ul>
  <p> Sono disponibili i seguenti metodi: </p>
  <ul>
    <li> Acquista bevanda → è chiamato per la macchinetta erogatrice dentro il metodo "Eroga caffè" o "Eroga tè", accetta in ingresso il costo della bevanda scelta da erogare e fa la verifica se esiste credito
    sufficiente per erogarla. Controlla se c'è credito disponibile e se è superiore al costo della bevanda scelta, nel caso sì sottrai il costo della bevanda del credito residuo nella chiavetta, incrementa 
    la variabile bevande acquistate e ritorna true. Nel caso contrario, ritorna false; </li>
    <li> Aggiungi credito → effettua il caricamento di credito nella macchinetta, accetta in ingresso il credito da caricare; </li>
    <li> Stampa resoconto → stampa un riassunto dello status della chiavetta in un formato standard, informando il codice identificativo, il nome del proprietario, quante bevande sono state erogate e quanto
      esiste di credito residuo. </li>
  </ul>
</div>
