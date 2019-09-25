package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
        
        public int score=0;   
        public int spare=10;
        public int nombreLancee =0;
        public int strike=0;    
	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
            
        }

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            if (nombreLancee==2){
                nombreLancee=0;
            }
            nombreLancee+=1;
            
            //lancer sans strike
            if (nombreDeQuillesAbattues < 10){
                
                if (spare==0){
                    score+= nombreDeQuillesAbattues *2;
                } else if (strike > 0) {
                    strike-=1;                    
                    score+= nombreDeQuillesAbattues *2;
                } else {
                    spare-=nombreDeQuillesAbattues;
                    score+= nombreDeQuillesAbattues;
                }
                if (nombreLancee==2 && spare!=0){
                    nombreLancee=0;
                    spare=10;
                    }
                }
            
            //Strike
            if (nombreDeQuillesAbattues == 10 && nombreLancee==1 ){
                if (strike >0){
                    score+= nombreDeQuillesAbattues*3;
                } else {
                    score+= nombreDeQuillesAbattues;
                }
                strike=2;
            }
            if (nombreDeQuillesAbattues == 10 && nombreLancee==2){
                spare=0;
                score+= nombreDeQuillesAbattues;
            }
	}
        
	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
            return score;
        }      
}
