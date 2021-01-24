public class Frein implements Piece {
    @Override
    public String typePiece() {
        return "Frein";
    }
 
    @Override
    public int getPrix() {
        return 200;
    }

    @Override
    public String toString() {
		return ("Type " + this.typePiece() +  "Cout " + this.getPrix() );
	}
}
