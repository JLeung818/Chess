package chess;

public class Queen extends Piece{
	private PieceColour colour;
	private String symbol;

	public Queen(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♕";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♛";
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
		//move vertically
		if(i0==i1){
			for (int n = Math.min(j0,j1) + 1; n<Math.max(j0,j1);n++){
				if(Board.hasPiece(i1,n))
					return false;
			}
		}
		//move horizontally
		else if (j0 == j1){
			for (int n = Math.min(i0, i1) + 1; n<Math.max(i0,i1);n++){
				if (Board.hasPiece(n,j1))
					return false;
			}
		}
		//move diagonally
		else if(Math.abs(i1-i0) == Math.abs(j1-j0)){
			for (int n = 1; n<Math.abs(i1-i0);n++){
				if(Board.hasPiece((i1-i0 == j1-j0)? Math.min(i0,i1)+n:Math.max(i0,i1)-n, Math.min(j0, j1)+n))
					return false;
			}
		}
		else
			return false;
		return ! ( Board.hasPiece ( i1, j1 ) && Board.getPiece ( i0, j0 ) .getColour ( ) == Board.getPiece ( i1, j1 ) .getColour ( ) ) ;
	}
}
