public class Armortisseur implements Piece {
    @Override
    public String typePiece() {
        return "Armotisseur";
    }
 
    @Override
    public int getPrix() {
        return 150;
    }

    @Override
    public String toString() {
		return ("Type " + this.typePiece() +  "Cout " + this.getPrix() );
	}
}
