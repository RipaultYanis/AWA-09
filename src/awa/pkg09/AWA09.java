/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awa.pkg09;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import static javafx.scene.control.SelectionMode.MULTIPLE;
import static javafx.scene.control.SelectionMode.SINGLE;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class AWA09 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);
        
        hote unHote = new hote("Hote1","Ripault","Yanis","yanis.ripault.sio@gmail.com");
        specialite regional= new specialite("Regional");
        specialite oriental= new specialite("Oriental");
        specialite africain= new specialite("Africain");
        specialite autres= new specialite("Autres");
        
        Label labelID = new Label("Identifiant : ");
        TextField textID = new TextField();
        textID.setText(unHote.getId());
        textID.setEditable(false);
        
        Label labelNom = new Label("Nom :");
        TextField textNom = new TextField();
        textNom.setText(unHote.getNom());
        textNom.setEditable(false);
        
        Label labelPrenom = new Label("Prenom :");
        TextField textPrenom = new TextField();
        textPrenom.setText(unHote.getPrenom());
        textPrenom.setEditable(false);
        
        Label labelSpecialite = new Label("Specialite :");
        ListView<String> specialite = new ListView<>();
        ObservableList<String> items =FXCollections.observableArrayList (regional.toString(),oriental.toString(),africain.toString(),autres.toString());
        specialite.getSelectionModel().setSelectionMode(MULTIPLE);
        specialite.setItems(items);
        
         

        Button Valider = new Button("Valider");
        
        Valider.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Erreur");
                    dlgNok.setHeaderText("Hote Enregistrer");
                    dlgNok.setContentText("ID : "+unHote.getId()+"\nPrenom : "+unHote.getPrenom()+"\n Nom : "+unHote.getNom()+"\n Email : "+unHote.getEmail()+"\nSpecialite : "+specialite.getSelectionModel().getSelectedItems());
                    dlgNok.showAndWait();   
                
                
            }
                
               
        });
        Button Annuler = new Button("Annuler");
        Annuler.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                specialite.getSelectionModel().clearSelection();
                
                
            }
                
               
        });
        
        
        
        GridPane.setHalignment(labelID, HPos.RIGHT);
        root.add(labelID, 0, 0,2,1);
        root.add(textID, 2, 0);
        
        GridPane.setHalignment(labelNom, HPos.RIGHT);
        root.add(labelNom, 0, 1,2,1);
        root.add(textNom, 2, 1);
        
        GridPane.setHalignment(labelPrenom, HPos.RIGHT);
        root.add(labelPrenom, 0, 2,2,1);
        root.add(textPrenom, 2, 2);
        
        GridPane.setHalignment(labelSpecialite, HPos.RIGHT);
        root.add(labelSpecialite, 0, 3,2,1);
        root.add(specialite, 2, 3);
        
        GridPane.setHalignment(Valider, HPos.RIGHT);
        root.add(Valider, 0, 4);
        GridPane.setHalignment(Annuler, HPos.LEFT);
        root.add(Annuler, 3, 4);
        
        Scene scene = new Scene(root, 650, 350);
        primaryStage.setTitle("AWA_09");
        primaryStage.setScene(scene);
        primaryStage.show();
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
