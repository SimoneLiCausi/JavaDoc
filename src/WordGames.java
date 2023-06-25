import java.util.Scanner;

public class WordGames {

    //Create a class called WordGames that has two methods:
    //addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
    //getFullName method that takes two parameters as input called name and surname and returns their concatenation
    //create a class called Tester that has the main method where you:



    /**
     * @Autore: Simone Li Causi.
     * Questa è la classe principale dell'esercizio WordGames.
     * All'interno troviamo due metodi: @addHelloWorld e @getFullName.
     * Il primo metodo aggiunge "Hello" all'inizio di una stringa
     * Il secondo metodo prende nome e cognome e li stampa concatenandoli.
     * Inoltre ho giocato un po' con il nostro codice, aggiungendo uno switch per rendere
     * il nostro @input più interattivo.
     * Lascio ugualmene la soluzione orginale dell'esercizio come commento all'interno del nostro
     * metodo @addHelloWorld.
     */

    Scanner input = new Scanner(System.in);

    void addHelloWorld(){
        System.out.println("Do you want to proceed? - Digit Yes or No: ");
        String word = input.nextLine();
        //System.out.println("Hello " + word);
        switch (word) {
            case "yes" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "Yes" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "yEs" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "yeS" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "yES" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "YEs" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "YES" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "YeS" -> System.out.println("Thank you for accepting, you can proceed with entering your data.");
            case "no"  -> System.out.println("We thank you anyway, enter your data to confirm your identity and exit the page.");
            case "No" -> System.out.println("We thank you anyway, enter your data to confirm your identity and exit the page.");
            case "NO" -> System.out.println("We thank you anyway, enter your data to confirm your identity and exit the page.");
            case "nO" -> System.out.println("We thank you anyway, enter your data to confirm your identity and exit the page.");
            default -> System.out.println("Invalid answer, enter your details and try again.");
        }
    }


    void getFullName(){
        System.out.println("Digit your name: ");
        String name = input.nextLine();
        System.out.println("Digit your surname: ");
        String surname = input.nextLine();
        System.out.println(name.concat(" ").concat(surname).concat(" "));

    }
}
