package chess;

public class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		int c = Board.getPiece ( i0, j0 ) .getColour ( ) == PieceColour.BLACK ? 1 : -1 ;
        if ( i0 == ( c + 7 ) % 7 && i1 == i0 + c * 2 && j1 == j0 ) {  
            return ! Board.hasPiece ( i0 + c, j0 ) && ! Board.hasPiece ( i1, j1 ) ;
        }
        else if ( i1 == i0 + c && j1 == j0 ) {   
            return ! Board.hasPiece ( i1, j1 ) ;
        }
        else if ( i1 == i0 + c && Math. abs ( j1 - j0 ) == 1 ) {   
            return Board.hasPiece ( i1, j1 ) && Board.getPiece ( i0, j0 ) .getColour () != Board.getPiece ( i1, j1 ) .getColour ( ) ;
        }
        else
            return false; 
		//return true;
	}
}
