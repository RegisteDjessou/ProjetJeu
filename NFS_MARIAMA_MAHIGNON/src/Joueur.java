public class Joueur extends Personnage{
	private String pseudo;
	private long coins;
	private Garage garage;
	
	//constructeurs
	public Joueur(String pseudo) {
		if(pseudo.length()<=5)
			throw new IllegalArgumentException("Le pseudo doit avoir au moins 6 lettres");
	    else if(pseudo.length() >12)
			throw new IllegalArgumentException("Le pseudo doit avoir au plus 12 lettres");
		try{
			this.pseudo = pseudo;
			this.coins = 150;
			this.garage = (new Garage());
		}catch(IllegalArgumentException e){
			e.printStackTrace();

		}

	}
	
	public Joueur() {
		this("Inconnu");
		
	}
	
	//modificateur
	public void setCoins(long coins) {
		
			this.coins = this.coins + coins;	
	}
	
	//accesseur
	public long getCoins(){
		return this.coins;
	}
	
	//accesseur
	public String getPseudo() {
		return this.pseudo;
		
	}
	
	//accesseur
	public Garage getGarage()
    {
        return this.garage;
         
    }
	

	//fonction pour afficher la position des joueurs
	public boolean afficherPositionJoueur(char grille[][], int x, int y ){
		int i;
		int j;
		boolean aPasPerdu=true;
		
		for(i=0 ;i<grille.length; i++){
			for(j=0 ;j<grille.length; j++){
				if(grille[i][j]!= 'P' && grille[i][j]!= 'C'){
					if(x==i && y==j)
						grille[i][j] = 'X';
					else
						grille[i][j] = 'J';
				}	
				if(x==i && y==j)
				{
				if(grille[i][j]== 'P'){
					System.out.print(" Perdu!! Vous vous etes fait prendre ");
					aPasPerdu =false;
				}
				else
					if(grille[i][j]== 'C'){
						this.coins+=500;
						grille[i][j] = 'X';
					}	
				}
				System.out.print(grille[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		return aPasPerdu;
	}
	
	//redefinition toString pour afficher un joueur
	public String toString() {
		return (this.pseudo +  " a gagne " + this.coins + " coins");
	}
	
	

	
	
	
}
