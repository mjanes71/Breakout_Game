# Breakout_Game
Command Line Menu Driven Breakout Game

The main method is in the Application class.

The Room class holds the logic for instantiating discoverable objects in the breakout as well as displaying information about their riddles and hints.

The sprites package contains an abstract class, MagicObjects, that is the archetype for all sprites in the room. Each room is designed to take 5 MagicObjects.

If other breakout themes were to be embraced, only new sprite classes that extend MagicObject would have to be written. The only place where the room objects
are hard-coded is in the construction of the Room object in the Application class and in the constants that relate to the menu display in the Application class.

Ideas for further functionality:
-Leaderboard
-Timer
-Differently themed rooms
