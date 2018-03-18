# Arbeidskrav - meter

dette programmet kjøres ved en main method som lager og legger til seks
forskjellige metere av de forskjellige typene.
Metoden henter også infoen/toString fra metodene.
Vi endrer også plasseringen og statusen til noen objekter samt sletter noen,
deretter henter de objektene som er blitt modifisert/endret.


## Hvordan kjøre programmet?
programmet er laget med intellij der man kjører main metoden i Main.java


###Gui -
Main vil kjøre selve gui/javaFX applikasjonen som oppretter en scene med flere knapper.
her kan du trykke på "legg til eksempler i liste" som vil poppulere listen med eksempeldata
fra en json fil. trykker du clear så vil listen og text feltet tømmes og en må derfor trykke
"legg til eksempler i liste" igjen. de andre knappene krever registreringsnummer og/eller
ny plassering. her kan du endre ett instrument basert på registreringsnummeret.

###Terminal -
kommenter ut linje 7 og fjern "//" foran linje 6 og da vil programmet kjøre client
classen som vil populere listen med data fra "DummyData" classen.

