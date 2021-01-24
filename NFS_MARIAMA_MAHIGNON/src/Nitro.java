public class Nitro implements Piece{
    @Override
    public String typePiece() {
        return "Nitro";
    }
 
    @Override
    public int getPrix() {
        return 100;
    }

    @Override
    public String toString() {
		return ("Type " + this.typePiece() +  "Cout " + this.getPrix() );
	}
    
}
