# Projet "Dice" - Gestion de lancés de dés avec Spring Boot

## Tamas PALOTAS - TD2 - M1 MIAGE - 2024-2025

## Description
Le projet "Dice" est une application construite avec Spring Boot permettant de simuler des lancés de dés et de gérer un historique des résultats en base de données. Ce projet met en œuvre les concepts fondamentaux de Spring Boot, notamment l'injection de dépendances, les services RESTful, les entités JPA et les repositories.


## Étapes réalisées
### 1. Création du projet Spring Boot
Le projet est crée avec [Spring Initializr](https://start.spring.io/) avec la version 3.4.0 de **Spring Boot**, **Maven**, **Spring Web**, **Spring Data JPA**, **H2 Database** .

### 2. Configuration du projet
Le port **8081**et le nom **dice** sont configurés dans le fichier **`application.properties`**.

### 3. Création de la classe `Dice`
La classe `Dice` est implémentée avec `roll()` pour effectuer un lancé.

### 4. Création de l'entité `DiceRollLog`
DiceRollLog est modélisée avec les champs **`id`**, **`diceCount`**, **`results`**, **`timestamp`**.

### 5. Création du `Repository`
L'interface `DiceRollLogRepository` hérite de `JpaRepository<DiceRollLog, Long>`.

### 6. Création du contrôleur REST pour lancer les dés
Le contrôleur `DiceController` contient les endpoints **`GET /rollDice`** et **`GET /rollDices/{X}`**.

### 7. Création du `Service`
Le service `DiceService` contient la méthode `rollDices(int diceCount)` pour lancer les dés et enregistrer les résultats.


