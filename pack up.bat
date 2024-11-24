dir /s /B moves\*.java > moves/sources.txt
javac -classpath lib/Pokemon.jar @moves/sources.txt
dir /s /B pokemons\*.java > pokemons/sources.txt
javac -classpath lib/Pokemon.jar;. @pokemons/sources.txt
javac -classpath lib/Pokemon.jar;. Main.java
jar -cmf MANIFEST.mf Lab2.jar Main.class lib/Pokemon.jar pokemons/*.class moves/*.class
pause