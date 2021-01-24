import java.util.List;
import java.util.ArrayList;
public class Garage {
    public static int identifiant;
    private List<Voiture> voiture = new ArrayList<Voiture>();
    private List<Piece> piece = new ArrayList<Piece>();
    
    //constructeur
    public Garage(){
        this.voiture.add(new Voiture());
        identifiant++;
    }
    
    
    //ajout d'une voiture
    public void addVoiture(Voiture voiture)
    {   if(voiture instanceof Voiture)
            this.voiture.add(voiture);
        else
             throw new IllegalArgumentException("voiture must be voiture type");
         
    }

    
    //liste des voiture que possede le joueur dans son garage
    public List<Voiture> getVoiture(){
		return this.voiture;
    }
    
    //ajout de piece
    public void addPiece(Piece piece)
    {  if( piece instanceof Piece)
         this.piece.add(piece);
       else
          throw new IllegalArgumentException("Capacite  must be piece type");
         
    }

    //liste des piece que possede le joueur dans son garage
    public List<Piece> getPiece()
    {
         return this.piece ;
    }
}
