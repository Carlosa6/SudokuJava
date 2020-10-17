/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildlogic;

import computationlogic.GameLogic;
import java.io.IOException;
import javasudoku.IStorage;
import javasudoku.SudokuGame;
import persistence.LocalStorageImpl;
import userinterface.IUserInterfaceContract;
import userinterface.logic.ControlLogic;

/**
 *
 * @author AARON
 */
public class SudokuBuildLogic {
    
    public static void build(IUserInterfaceContract.View userInterface) throws IOException{
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();
        
        try {
            initialState = storage.getGameData();
        } catch (IOException e) {
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }
        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
    
}
