public class Pneu implements Piece {
    @Override
    public String typePiece() {
        return "Pneu";
    }
 
    @Override
    public int getPrix() {
        return 50;
    }

    @Override
    public String toString() {
		return ("Type " + this.typePiece() +  "Cout " + this.getPrix() );
	}
    
}
