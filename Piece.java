public class Piece {

    public String pieceCode;
    public String pieceIcon;
    public int pieceVal;
    public String pieceName;

    // overloaded constructor
    public Piece(String pieceCode, String pieceIcon, int pieceVal, String pieceName) {

        this.pieceCode = pieceCode;
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

    public String getPieceCode() {
        return this.pieceCode;
    }

}