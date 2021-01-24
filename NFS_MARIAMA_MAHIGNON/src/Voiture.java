public class Voiture {
    private Model model;
    private Couleur couleur;

    //Constructeurs
    public Voiture(Model model,Couleur couleur ){
        try {
            this.model= model;
            this.couleur=couleur;  
        } catch (Exception e) {
            e.printStackTrace();
        } 
          
    }
    
    public Voiture(){
        this(Model.VolkswagenGolfGTI,Couleur.Blanche);
    }

    //accesseurs


    public Model getModel(){
        return this.model;
    }

    public Couleur getCouleur(){
        return this.couleur;
    }

    //redefinition toString pour afficher une voiture
    public String toString() {
		return ("Model " + this.model +  " couleur " + this.couleur );
    }


    //redefinition equals pour comparer deux voitures
    public boolean equals(Object o) {
		if(o instanceof Voiture){
            boolean res = false;
            if(this.model == ((Voiture)o).model && this.couleur == ((Voiture)o).couleur)
                res = true;
            return res;
        }
        else
            throw new IllegalArgumentException("Object type is not Voiture");
    }
    

}
