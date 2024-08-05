# Système de Gestion de Parc de Véhicules

## Description
Le Système de Gestion de Parc de Véhicules est une application conçue pour gérer différents types de véhicules (Voiture, Camion, Moto) avec des attributs spécifiques pour chaque type. Cette application permet d'ajouter, de modifier, de supprimer et de rechercher des véhicules dans un parc, ainsi que de persister les données dans des fichiers ou une base de données.

## Fonctionnalités

### Gestion des Véhicules
- **Ajouter un véhicule** : Ajoute un véhicule au parc avec des attributs spécifiques selon le type (Voiture, Camion, Moto).
- **Supprimer un véhicule** : Supprime un véhicule du parc en utilisant son identifiant unique.
- **Modifier un véhicule** : Modifie les attributs d'un véhicule existant en utilisant son identifiant unique.
- **Rechercher un véhicule par nom** : Recherche un véhicule dans le parc par son nom.
- **Lister les véhicules par lettre alphabétique** : Liste les véhicules dont le nom commence par une lettre spécifique.
- **Afficher le nombre de véhicules en stock** : Affiche le nombre total de véhicules présents dans le parc.

### Fonctionnalités Supplémentaires
- **Trier les véhicules par type** : Trie et affiche les véhicules par type (Voiture, Camion, Moto).
- **Exporter les données au format CSV** : Exporte la liste des véhicules dans un fichier CSV.

### Optimisation et Gestion des Fichiers
- **Sauvegarde et Chargement des Données** : Sauvegarde et charge les données des véhicules dans des fichiers `.txt`, `.csv`, ou `.json` pour assurer la persistance des informations.
- **Gestion des Exceptions** : Gère toutes les exceptions possibles dans l'application, y compris une exception personnalisée pour les identifiants de véhicule déjà existants.

### Gestion de la Base de Données
- **Sauvegarde des Données dans une Base de Données** : Sauvegarde les données des véhicules dans un SGBDR (Système de Gestion de Base de Données Relationnelle) tout en maintenant la structure des classes Java.
- **Chargement des Données depuis une Base de Données** : Charge les données des véhicules depuis un SGBDR.

## Instructions pour Compiler et Exécuter le Projet

### Prérequis
- **Java** : Version 11 ou supérieure.
- **Maven** : Pour la gestion des dépendances et la compilation.
- **Base de Données** : MySQL, PostgreSQL ou tout autre SGBDR compatible (pour la gestion des données).

### Étapes pour Compiler le Projet
1. **Cloner le Référentiel**
    ```sh
    git clone https://github.com/username/gestion-parc-vehicules.git
    cd gestion-parc-vehicules
    ```

2. **Installer les Dépendances**
    ```sh
    mvn clean install
    ```

3. **Configurer la Base de Données**
    - Mettre à jour le fichier `application.properties` avec les informations de votre base de données.

4. **Compiler le Projet**
    ```sh
    mvn package
    ```

### Étapes pour Exécuter le Projet
1. **Démarrer l'Application**
    ```sh
    java -jar target/gestion-parc-vehicules-1.0.jar
    ```

2. **Accéder à l'Application**
    - L'application se lancera et sera accessible via la console ou l'interface utilisateur définie.

## Contribution
Les contributions sont les bienvenues ! Veuillez soumettre une pull request ou ouvrir une issue pour discuter des changements que vous souhaitez apporter.

## Licence
Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

