public class Tester {
//create a new WordGames object
//print in console the result of the addHelloWord method invocation
//print in console the result of the getFullName method invocation
//add Javadoc comments to:
//the 2 classes with a short description and the author
//the 3 methods with a short description, the parameters and the return


    /**
     * @Autore: Simone Li Causi.
     * Questa è la classe test dell'esercizio e si chiama @Tester.
     * All'interno troviamo due richiami ai precedenti metodi che abbiamo creato.
     * Grazie allo scanner, possiamo testare la funzionalità del nostro codice.
     */

    public static void main(String[] args) {
        WordGames testerObject = new WordGames();


        testerObject.addHelloWorld();
        testerObject.getFullName();


    }
}

