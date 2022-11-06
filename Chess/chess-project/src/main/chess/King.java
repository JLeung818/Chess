package chess;

public class King extends Piece{
	private PieceColour colour;
	private String symbol;

	public King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♔";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♚";
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
		// if(Math.abs((i1-i0)*(j1-j0))<=1){
		// 	return true;
		// }else{
		// 	return false;
		// }if (Board.hasPiece(i1, j1)&&Board.getPiece(i0, j0).getColour() == Board.getPiece(i1, j1).getColour()){
		// 	return false;
		// }else{
		// 	return true;
		return Math.abs (( i1 - i0 ) * ( j1 - j0 )) <= 1 && ! ( Board. hasPiece ( i1, j1 ) && Board. getPiece ( i0, j0 ) . getColour () == Board . getPiece ( i1, j1 ) . getColour ()) ;
		}
	}


// return Math.abs (( i1 - i0 ) * ( j1 - j0 )) <= 1 && ! ( Board. hasPiece ( i1, j1 ) && Board. getPiece ( i0, j0 ) . getColour () == Board . getPiece ( i1, j1 ) . getColour ()) ;