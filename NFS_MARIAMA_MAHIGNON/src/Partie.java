import java.util.Random;
public class Partie {
    public static int identifiant;
    private Joueur joueur;
    private Policier policier;

    //constructeur 
    public Partie(Joueur joueur){
        if(joueur instanceof Joueur){
        this.joueur = joueur;
        identifiant++;
        }else
            throw new IllegalArgumentException("Joueur must be Joueur type.");

    }


    //fonction pour placer des obstacles dans le jeu
    public void genererObstacle(char grille[][]){
        int i;
		int j;
		Random random = new Random();
		for(i=0 ;i<grille.length; i++){
            int x = random.nextInt(19);
            int y = random.nextInt(19);
			for(j=0 ;j<grille.length; j++){
                if(x==j)
                    grille[i][j] = 'P';
                if(y==j) 
                    grille[i][j] = 'C';
                        
            
            }
        }
    }

    //fonction pour determiner si un joueur a gagner la course 

    public boolean aGagne(char grille[][],int x ){

        boolean aGagne=false;
        if(grille.length==x)
            aGagne = true;
        return aGagne;
    }

    public String toString() {
        return ("Partie no " + identifiant +  " du pseudo " + this.joueur.getPseudo() 
        +  " terminé avec: " + this.joueur.getCoins());
	}
}
