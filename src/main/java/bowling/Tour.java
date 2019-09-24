/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author florian mouly
 */
public class Tour {
    
    public int numTour;
    public int premierL;
    public int deuxiemeL;
    public int bouleLancee;
    public Tour tourSuivant;
    
    public Tour(int t){
        numTour = t;
    }
    
    /**
     * 
     * @return 
     **/
    public Tour goToNextTurn(){
        return tourSuivant;
    }
    
    /**
     * 
     * @return 
     **/
    public int numOfTour() {
        return numTour;
    }
    
    /**
     * 
     * @return 
     **/
    public int numBallThrow() {
        return bouleLancee;
    }

    /**
     * 
     * @return 
     **/
    public boolean strike() {
	return premierL == 10;
    }

    /**
     * 
     * @return 
     **/
    public boolean spare() {
	return (premierL + deuxiemeL) == 10;
    }
    
    /**
     * 
     * @return 
     **/
    public int pointOfStrike(){
        if (strike()) {
		return premierL;
	} else {
		return premierL + deuxiemeL;
	}
    }
    
    /**
     * 
     * @return 
     **/
    public int pointOfSpare() {
	return premierL;
    }
    
    /**
     * 
     * @return 
     **/
    public int score() {
		int ScoreJoueur = 0;
		if (strike()) {
			ScoreJoueur = 10 + tourSuivant.pointOfStrike();
		}
                else if (spare()) {
			ScoreJoueur = 10 + tourSuivant.pointOfSpare();
		} else {
			ScoreJoueur = premierL + deuxiemeL;
		}
	return ScoreJoueur + tourSuivant.score();
	}
    
    /**
     * 
     * @param NumeroLancee
     **/
    public void Lancer(int NumeroLancee) {
                bouleLancee=0;
                
                if (bouleLancee > 1) {
			throw new UnsupportedOperationException();
		}
                
		bouleLancee++;
		switch (bouleLancee) {
                    case 1:
			premierL = NumeroLancee;
			break;
                    case 2:
			deuxiemeL = NumeroLancee;
                        break;
		}
	}
}
