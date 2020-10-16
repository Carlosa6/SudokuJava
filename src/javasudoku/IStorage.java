/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasudoku;

import java.io.IOException;

/**
 *
 * @author AARON
 */
public interface IStorage {
    
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
    
}
