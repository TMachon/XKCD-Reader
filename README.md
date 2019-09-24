
# XKCD Reader v1.1

## TODO
*- Mise en cache*
*- Refonte graphique*
*- Recherche par mot-clefs*
*- Options de tri*

## Présentation
XKCD Reader est une application Android codée en JAVA permettant d'afficher les web-comics [XKCD](https://xkcd.com/ "website_link"). Elle fait appel à l'API développée par l'auteur des web-comics lui-même.

## Fonctionnalités
- [x] Affichage de la liste de tous les web-comic XKCD
- [x] Sélection et affichage d'un web-comic parmi la liste
- [x] Affichage d'une erreur s'il n'y a pas d'accès internet

## Spécificités techniques
- Appels à l'[API REST XKCD](https://xkcd.com/json.html "api_link") avec Retrofit
- RecyclerView pour la liste
- Implémentation suivant l’architecture MVC

## GitFlow
```
* 0fce738 - Initial commit
|\
* | 8da86ac - README.md
| * 4b0c1da - Setting things up w/ MVC architecture
| |\
| | * cbe91fb - Working out Retrofit, still buggy
| |/
| *   5b309a8 - Merge remote-tracking branch 'origin/develop' into develop
| * a5dbf44 - Retrofit is working, everything so far is stable
| |\
| | * 87dfc76 - Showing a RecylclerView made of tests
| | * 2ac4e69 - Reworked text management (for the view), Troubleshot some warnings
| | * 0928bad - (origin/feature/MainLayout, feature/MainLayout) Commit before merge
| |/
| *   0b8a85a - (develop) Merge pull request #1 from TMachon/feature/MainLayout
| |\
| | * 0cfe846 - Creating everything needed
| | * d60dc42 - Set things up, Started implementing click
| | * 978b844 - Fixed crash on list
| | * b18ded5 - (origin/feature/ComicLayout, feature/ComicLayout) Image is showing up, at last !
| | |\
| |/ /
| * |   c64cfe6 - Merge pull request #2 from TMachon/feature/ComicLayout
| | * 3d8a84d - (origin/feature/ErrorLayout, feature/ErrorLayout) Created an activity for connexion errors, and Toats for other errors
| | |\
| |/ /
| * |   065f0f6 - Merge pull request #3 from TMachon/feature/ErrorLayout
| | * 65fd2e7 - (origin/feature/FinishingTouches, feature/FinishingTouches) Finishing touches
| |/
| *   999b1b0 - (origin/develop) Merge pull request #4 from TMachon/feature/FinishingTouches
|/
*   1abbd4b - (HEAD -> master, origin/master) Merge pull request #5 from TMachon/develop
```

## Screenshots
Liste de tous les web-comics, du plus récent au plus ancien : <br>
<img src="https://github.com/TMachon/XKCD-Reader/blob/master/1.jpg" width="350">

Affichage d'un web-comic :<br>
<img src="https://github.com/TMachon/XKCD-Reader/blob/master/2.jpg" width="350">

Affichage d'une erreur en cas d'absence d'internet :<br>
<img src="https://github.com/TMachon/XKCD-Reader/blob/master/3.jpg" width="350">

*Théo Machon 2018* <br>
*Projet réalisé dans le cadre du cours de Programmation Mobile 3A ESIEA* <br>
*Dernière mise à jour du <span>README.md</span> le 02/04/2019* <br># XKCD Reader v1.0

## Présentation
XKCD Reader est une application Android codée en JAVA permettant d'afficher les web-comics [XKCD](https://xkcd.com/ "website_link"). Elle fait appel à l'API développée par l'auteur des web-comics lui-même.

## Fonctionnalités
- [x] Affichage de la liste de tous les web-comic XKCD
- [x] Sélection et affichage d'un web-comic parmi la liste
- [x] Affichage d'une erreur s'il n'y a pas d'accès internet

## Spécificités techniques
- Appels à l'[API REST XKCD](https://xkcd.com/json.html "api_link") avec Retrofit
- RecyclerView pour la liste
- Implémentation suivant l’architecture MVC

## GitFlow
```
* 0fce738 - Initial commit
|\
* | 8da86ac - README.md
| * 4b0c1da - Setting things up w/ MVC architecture
| |\
| | * cbe91fb - Working out Retrofit, still buggy
| |/
| *   5b309a8 - Merge remote-tracking branch 'origin/develop' into develop
| * a5dbf44 - Retrofit is working, everything so far is stable
| |\
| | * 87dfc76 - Showing a RecylclerView made of tests
| | * 2ac4e69 - Reworked text management (for the view), Troubleshot some warnings
| | * 0928bad - (origin/feature/MainLayout, feature/MainLayout) Commit before merge
| |/
| *   0b8a85a - (develop) Merge pull request #1 from TMachon/feature/MainLayout
| |\
| | * 0cfe846 - Creating everything needed
| | * d60dc42 - Set things up, Started implementing click
| | * 978b844 - Fixed crash on list
| | * b18ded5 - (origin/feature/ComicLayout, feature/ComicLayout) Image is showing up, at last !
| | |\
| |/ /
| * |   c64cfe6 - Merge pull request #2 from TMachon/feature/ComicLayout
| | * 3d8a84d - (origin/feature/ErrorLayout, feature/ErrorLayout) Created an activity for connexion errors, and Toats for other errors
| | |\
| |/ /
| * |   065f0f6 - Merge pull request #3 from TMachon/feature/ErrorLayout
| | * 65fd2e7 - (origin/feature/FinishingTouches, feature/FinishingTouches) Finishing touches
| |/
| *   999b1b0 - (origin/develop) Merge pull request #4 from TMachon/feature/FinishingTouches
|/
*   1abbd4b - (HEAD -> master, origin/master) Merge pull request #5 from TMachon/develop
```

## Screenshots
Liste de tous les web-comics, du plus récent au plus ancien : <br>
<img src="https://github.com/TMachon/XKCD-Reader/blob/master/1.jpg" width="350">

Affichage d'un web-comic :<br>
<img src="https://github.com/TMachon/XKCD-Reader/blob/master/2.jpg" width="350">

Affichage d'une erreur en cas d'absence d'internet :<br>
<img src="https://github.com/TMachon/XKCD-Reader/blob/master/3.jpg" width="350">

*Théo Machon 2018-2019* <br>
*Projet réalisé dans le cadre des cours de Programmation Mobile 3A & 4A ESIEA* <br>
*Dernière mise à jour du <span>README.md</span> le 24/09/2019* <br>
