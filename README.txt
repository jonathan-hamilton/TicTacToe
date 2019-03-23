Project Title:
Tic Tac Toe

Motivation:
To complete ZenDesk assignment "Build a playable implementation of Tic Tac Toe".

Tech/Framework used:
Java 8, JavaFX, SceneBuilder

Installation:
This application is packaged as a .jar file which can be executed if you have a JRE installed.

Features:
-This program features a playable game of Tic Tac Toe where players can alternate turns.
-A red label will indicate the winner of the game.
-To start a game a button is provided on the title page labeled "Press to Play".
-A reset button is provided to restart the game. The game can be stopped and reset at any time.

Decisions:
-I chose to create this application using JavaFX/SceneBuilder because of the ease of use and integration with Java code.
-I utilized a pseudo-MVC architecture. There was no data to persist and thus no Model necessary but I did decide to
use a Service class for the implementation of the logic to separate that responsibility from the controller.
-The Controller classes control their respective XML view with ActionEvent listeners.

Author/Date:
Jonathan Hamilton 2019-03-22
