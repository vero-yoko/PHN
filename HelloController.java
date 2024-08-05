package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HelloController {

    @FXML
    private void ajouterVehicule() {
        showAlert("Ajouter un véhicule");
    }

    @FXML
    private void supprimerVehicule() {
        showAlert("Supprimer un véhicule");
    }

    @FXML
    private void modifierVehicule() {
        showAlert("Modifier un véhicule par son identifiant");
    }

    @FXML
    private void rechercherVehicule() {
        showAlert("Rechercher un véhicule par nom");
    }

    @FXML
    private void listerVehicules() {
        showAlert("Lister les véhicules par lettre initiale");
    }

    @FXML
    private void afficherNombreVehicules() {
        showAlert("Afficher le nombre de véhicules en stock");
    }

    @FXML
    private void sauvegarderDonnees() {
        showAlert("Sauvegarder les données dans un fichier");
    }

    @FXML
    private void gererExceptions() {
        showAlert("Gérer les exceptions");
    }

    @FXML
    private void quitter() {
        showAlert("Quitter");
        System.exit(0);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Menu Action");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
