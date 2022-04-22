package chess.io;

import java.net.MalformedURLException;
import java.net.URL;

import chess.datamodel.Piece;
import javafx.scene.image.Image;

public class ImageIO {
    public ImageIO() {
    }
    public Image getImage(Piece p) {
        String imageFilePath = "";
        switch(p.getColor()) 
        {   
            case BLACK:
                switch(p.getType()) {
                    case PAWN:
                        imageFilePath = "BPawn.png";
                        break;
                    case ROOK:
                        imageFilePath = "BRook.png";
                        break;
                    case BISHOP:
                        imageFilePath = "BBishop.png";
                        break;
                    case KING:
                        imageFilePath = "BKing.png";
                        break;
                    case KNIGHT:
                        imageFilePath = "BKnight.png";
                        break;
                    case QUEEN:
                        imageFilePath = "BQueen.png";
                        break;
            }
            case WHITE:
                switch(p.getType()) {
                    case PAWN:
                        imageFilePath = "WPawn.png";
                        break;
                    case ROOK:
                        imageFilePath = "WRook.png";
                        break;
                    case BISHOP:
                        imageFilePath = "WBishop.png";
                        break;
                    case KING:
                        imageFilePath = "WKing.png";
                        break;
                    case KNIGHT:
                        imageFilePath = "WKnight.png";
                        break;
                    case QUEEN:
                        imageFilePath = "WQueen.png";
                        break;
            }
            System.out.println(new Image("/C:/src/objekt_project/target/classes/pics/WQueen.png"));
        }
        return null;
    }

    public static String getImageFilePath(String imageFilePath)
    {
        if (imageFilePath.isBlank()) throw new IllegalArgumentException("Can't find a file that is null");
        return ImageIO.class.getResource("/pics").getFile() + imageFilePath;
    }

    public static void main(String[] args) {
        System.out.println(getImageFilePath("WQueen.png"));
        ImageIO io = new ImageIO();
        io.getImage(Piece.createNewPiece("pa2"));
    }

}
