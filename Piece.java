public class Piece {

    public char pieceCode;
    public int pieceType;
    public String pieceIcon;
    public int pieceVal;
    public String pieceName;

    // overloaded constructor
    public Piece(char pieceCode, int pieceType, String pieceIcon, int pieceVal, String pieceName) {

        this.pieceCode = pieceCode;
        this.pieceType = pieceType;
        this.pieceIcon = pieceIcon;
        this.pieceVal = pieceVal;
        this.pieceName = pieceName;

    }

    // getters and setters
     public int getPieceVal() {
        return this.pieceVal;
     }

    public String getPieceIcon() {
        return this.pieceIcon;
    }

    public String getPieceName() {
        return this.pieceName;
    }

    public char getPieceCode() {
        return this.pieceCode;
    }

}