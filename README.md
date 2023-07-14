# Coworking Space

> Ziel ist es, einen minimalen Prototyp für ein Coworking Space zu erstellen, womit Mitglieder über eine Webapplikation Buchungen tätigen können.


**Projekt aufsetzen**  
Das Projekt benötigt Java (Version 17), Maven, Springboot, MariaDB Driver - alle weitere dependencies im pom.xml beschrieben. Je nach dem welche Datenquelle Sie verwenden möchten müssen `application.properties` bzw. `docker-compose.yaml` noch anpassen.

**Projekt starten**  
Um das Projekt zu starten, muss die `main` Klasse, sowie Docker (je nach Datenquelle) laufen gelassen werden. 

**Testdaten**  
Ein Abschnitt beschreibt, wie Testdaten geladen werden können. Die Testdaten werden durch das Aufrufen von der `main` Klasse geladen. Falls sie diese Daten nicht mehr benötigen können die paar Zeilen für das Erstellen der Testdaten einfach ausgeklammert werden.