/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasudoku;

import buildlogic.SudokuBuildLogic;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import userinterface.IUserInterfaceContract;
import userinterface.UserInterfaceImpl;

/**
 *
 * @author AARON
 */
public class JavaSUDOKU extends Application {
    private IUserInterfaceContract.View uiImpl;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
