#Author: Sihem
Feature:Homepage xiaomi
Scenario: Selectionner un menu de la page d acceuil
Given L utilisateur dans la page d acceuil
When L utilisateur clique sur le menu "Smartphones"
Then L utilisateur est dirige vers la page "Smartphones"
