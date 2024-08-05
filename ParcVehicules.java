package com.example.demo;

import java.util.HashMap;

public class ParcVehicules {
    private HashMap<String, Vehicule> vehicules;

    public <Vehicule> ParcVehicules() {
        vehicules = (HashMap<String, com.example.demo.Vehicule>) new HashMap<String, Vehicule>();
    }

    public void ajouterVehicule(Vehicule vehicule) {
        vehicules.put(vehicule.getId(), vehicule);
    }

    public void supprimerVehicule(String id) {
        vehicules.remove(id);
    }

    public void modifierVehicule(String id, Vehicule vehiculeModifie) {
        if (vehicules.containsKey(id)) {
            vehicules.put(id, vehiculeModifie);
        } else {
            System.out.println("Véhicule avec l'identifiant " + id + " non trouvé.");
        }
    }

    public Vehicule rechercherParNom(String nom) {
        for (Vehicule v : vehicules.values()) {
            if (v.getMarque().equalsIgnoreCase(nom)) {
                return v;
            }
        }
        return null;
    }

    public void listerVehiculesParLettreInitiale(char lettre) {
        for (Vehicule v : vehicules.values()) {
            if (Character.toUpperCase(v.getMarque().charAt(0)) == Character.toUpperCase(lettre)) {
                v.afficherDetails();
            }
        }
    }

    public int nombreVehiculesEnStock() {
        return vehicules.size();
    }
}

