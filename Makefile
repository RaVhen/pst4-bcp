JFLAGS = -cp
JC = javac
JAVA = java
LIBS = twitter4j-core-4.0.2.jar
SRC = src/
LFOLDER = lib/
BIN = bin/
MAIN = Main

.SUFFIXES: .java .class
.java.class:
	$(JC) -d $(BIN) $(JFLAGS) $(LFOLDER)$(LIBS):./ $(SRC)*.java

CLASSES = \
	$(SRC)Main.java 

default: classes

classes: $(CLASSES:.java=.class)

run:
	$(JAVA) $(JFLAGS) $(LFOLDER)$(LIBS):./$(BIN) $(MAIN)

clean:
	$(RM) $(BIN)*.class
