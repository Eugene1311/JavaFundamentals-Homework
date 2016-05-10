cd to-project-root-directory

javac -d bin src/javase01/t01/logic/Logic.java

javac -d bin -sourcepath src src/javase01/t01/main/Main.java

java -classpath ./bin javase01.t01.main.Main
