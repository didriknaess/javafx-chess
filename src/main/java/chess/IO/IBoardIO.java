package chess.io;

import java.io.FileNotFoundException;

import chess.datamodel.GameState;

public interface IBoardIO 
{
    public void readFile(String filename) throws FileNotFoundException;

    public void saveFile(String filename, GameState game) throws FileNotFoundException;
}
