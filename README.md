# Java-exercises-practicing-input-conditions-loops-and-arithmetic
Ex1:
# Java Seconds Converter
Ce programme lit un entier n et calcule la somme des nombres premiers compris entre 2 et n inclus.
- Méthode : itérative, avec des boucles for.
- Test : un nombre est premier s’il est supérieur à 1 et n’a aucun diviseur entre 2 et lui-même exclu.
- Exemple : pour n = 19, le programme affiche Somme = 77.
My first Java exercise: converting seconds into hours, minutes,
and seconds.
## Example
Input: 358890 seconds
Output: 99 hours, 41 minutes, 30 seconds
## What I learned
- Reading input with Scanner
- Integer division
- Using the remainder operator (%)

## How to run
Compile: javac Ex7.java
Run: java Ex7



Ex2:
## Objectif
Calculer la somme des chiffres d’un entier positif saisi au clavier.
## Fonctionnement
1. Lire l’entier.
2. Extraire son dernier chiffre avec `n % 10` et l’ajouter à la somme.
3. Supprimer ce chiffre avec la division entière `n / 10`.
4. Répéter tant que `n != 0`, puis afficher la somme.
## Exemple
Entrée : 189
Calcul : 1 + 8 + 9
Somme = 18


Ex3:
## Objectif
Lire une température en degrés Celsius et la convertir en degrés Fahrenheit.
## Formule
Fahrenheit = Celsius × 9 / 5 + 32
## Fonctionnement
1. Lire la température avec `Scanner.nextDouble()`.
2. Appliquer la formule de conversion.
3. Afficher la température en Fahrenheit.
## Exemple et remarque sur la capture
Pour **27 °C**, le résultat attendu est **80,6 °F**.
Pour effectuer toute l’opération avant l’affichage :
java
System.out.println("La temperature en Fahrenheit est : " + (Celsius * 9 / 5 + 32));


Ex4:
## Objectif
Remplir un tableau d’entiers et afficher uniquement ses valeurs strictement négatives.
## Fonctionnement
1. Demander une taille `n` strictement positive.
2. Créer un tableau de `n` entiers.
3. Saisir chaque élément du tableau.
4. Parcourir le tableau et afficher les éléments qui vérifient `tab[i] < 0`.
## Exemple illustratif
text
Taille : 5
Tableau : [4, -2, 0, -7, 3]
Valeurs affichées : -2 -7


Ex5:
## Objectif
Fusionner deux tableaux d’entiers déjà triés dans l’ordre croissant pour obtenir un troisième tableau trié.
## Données
- `t1` contient les 10 nombres pairs de 2 à 20.
- `t2` contient les 10 nombres impairs de 1 à 19.
- `t3` est un tableau de 20 éléments qui reçoit le résultat.
## Fonctionnement
1. Utiliser les indices `i` et `j` pour parcourir les tableaux sources, et `k` pour remplir `t3`.
2. Comparer les éléments courants et copier le plus petit dans `t3`.
3. Avancer l’indice du tableau choisi et celui du tableau résultat.
4. Lorsque l’un des tableaux est épuisé, copier les éléments restants de l’autre.
5. Afficher le tableau fusionné.
## Résultat
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

Ex6:
Ce programme lit deux entiers et calcule leur plus grand commun diviseur avec l’algorithme d’Euclide.
**Version itérative:
Utilise une boucle while. À chaque tour, on remplace le couple (a, b) par (b, a % b). Lorsque b vaut 0, le PGCD est a.
**Version récursive:
Utilise une fonction qui s’appelle avec les paramètres (b, a % b). Lorsque b vaut 0, la fonction retourne a.
##Example:
Donner un entier a : 48
Donner un entier b : 18
PGCD = 6



Ex7:
# Java Seconds Converter

My first Java exercise: converting seconds into hours, minutes,
and seconds.

## Example
Input: 358890 seconds
Output: 99 hours, 41 minutes, 30 seconds

## What I learned
- Reading input with Scanner
- Integer division
- Using the remainder operator (%)

## How to run
Compile: javac Ex7.java
Run: java 
E
