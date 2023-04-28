
# GrapheAlgo
## Bibliothèques Utilisées
Pour la rialisation de ce projet nous avons utulisees les Bibliothèques suivant:
1. [JGraphX](https://github.com/jgraph/jgraphx)
2. [JGrapht 1.5.1](https://github.com/jgrapht/jgrapht)
## Architecture
### Diagramme de Classe

### Algorithmes Implémentés
1. File des successeurs vers Matrice d’adjacence 
	```
	```
2.  Matrice d’adjacence vers  File des successeurs
	```
	```
3. Distance d'un sommet vers tous les sommets
4. Rang d'un sommet
5. Graphe fortement connexe avec Trajan

6. Ordonnancement
7. Dijkstra (Java)
8. Kruskal (Java)
9. Prufer (Codage et décodage)

### Type De Graphe
1.  `Graphe_Non_Orienter`
2.  `Graphe_Orienter_value`
3.  `Graphe_Orienter_non_value`
4. Arbre
### Classes
 1. La classe   `Graphe_orienter_value`
	Cette classe a comme responsabilité de gérée un graphe orienter value ou non value, a travers les structures `fs`,`aps`et `d`. 
	Par défaut le `d` est a `1` pour graphe non  value et `poid ` pour le graphe value.

 2. La classe    `Gestion_Graphe_Nom_Orienter`
	Cette classe a comme responsabilité de gérée un graphe non orienter value. La création de cette classe a pour but d'entrer pour *Kruskal Algorithm*
 3. La classe     `Arbre`
	Arbre est une structure de donner qui représente un graphe non orienter non value et sans circuit.
	Dans cette classe nous avons implémenter le codage de *[Prufer](https://fr.wikipedia.org/wiki/Codage_de_Pr%C3%BCfer)*. 
 4. La classe  `Tache`
	Pour Illustrer le problème d'*Ordonnancement*, la classe Tache est crée. Elle a comme particularité la table`d` qui suivent certain condition.
 5. La classe `Arete`
	Dans le cours d'*Graphe et Algo*, nous avons vu la structure idéal pour la implémentation d'*[Kruskal Algorithm](https://fr.wikipedia.org/wiki/Algorithme_de_Kruskal)* et pour ce la nous avons crée la classe `Arete`avec `s`et `t` deux extrémité d'une arête et `poid`.
 6. La classe `GrapheKruskal`
	`GrapheKruskal` est un graphe composer d'un tableau d'`Arete`avec nombre de sommet et nombre de arêtes.
 7. La classe `FpAppD`
	Pour le calcul de *File des prédécesseurs*, la classe `FpAppD` était crée. Elle est constituer des trois tableaux `fp`, `app`et`d`.
 8. La classe `JGraphXAdapterDemo`
	La classe *[JGraphXAdapterDemo](https://github.com/jgrapht/jgrapht/blob/master/jgrapht-demo/src/main/java/org/jgrapht/demo/JGraphXAdapterDemo.java)* a été récupérer dans un projet déjà existant avec les modification nécessaires pour l'affichage d'un graphe dans notre projet. 
###	Les fenêtres
####  Gestion_Graphe_Orienter
Pour faciliter la gestion des graphes, nous avons utiliser *[Windowbuilder](https://www.eclipse.org/windowbuilder/)* pour crée une interface utilisateur.
On trouve dans cette fenêtre 17 boutons:
| Non de bouton| Rôle  |
|--|--|
| Importer Matrice | importe une matrice sous forme fichier.txt |
| Importer FsAps/D | importe FsAps/D sous forme fichier.txt  |
|Afficher Matrice  | Affiche la matrice importé auparavant |
| Afficher FsApsD | Affiche FsAps/D importé auparavant |
| Afficher Graphe | Affiche graphe de la matrice importé  |
|Afficher Distance  | Affiche les entre sommets |
| Afficher Rang | Affiche rang |
| Afficher Matrice Dijkstra | Affiche la matrice de Dijkstra(graphe orienté valué) |
| Fortement Connexe | Fortement Connexe selon Tarjan |
| Ajouter Sommet | Au clic increment le nombre de sommet |
| Supprimer Sommet | après avoir choisir, supprime le sommet choisir |
| Ajouter Arc | Après avoir entrer source et destination ajoute l'arc  |
| Supprimer Arc | Supprimer Arc |
| Retour | Retour |
| Aide | Aide |
| Non Value | Interface des graphe orienté non valué |
| Value | Interface des graphe orienté valué |




#### Gestion_Graphe_Nom_Orienter

#### Gestion_Arbre




### Scénario d'exécution
1. `Run` le projet sous eclipse
2.  Choisir 2 pour `graphique`
3.  Choisir `Graphe_orienter_value` ou `Gestion_Graphe_Nom_Orienter`
4.  Importer ou créer une matrice
