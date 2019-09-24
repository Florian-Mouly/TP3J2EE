package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
    
        public int tour;
        public Boolean premierLancee;
        public Boolean deuxiemeLancee;
        public int tourTotal = 10;
        public int scoreTotal;
	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
            tour = 0;
            deuxiemeLancee = false;
        }

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            
            //Strinke
            //if (nombreDeQuillesAbattues == 10 && premierLancee == false){
            //    deuxiemeLancee = false;
            //    premierLancee = true;
            //    scoreTotal = score()+20; 
            //} else if (premierLancee = true){        
            //}
	}
        
	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
            
            throw new UnsupportedOperationException("Pas encore implémenté");
	}
        
        
}
