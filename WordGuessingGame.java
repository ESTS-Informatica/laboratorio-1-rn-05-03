import java.util.Scanner; 
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
  private String hiddenWord;
  private String guessedWord;
  private int numberOfTries;
  private InputReader reader;
    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";
        reader = new InputReader();
        this.numberOfTries = numberOfTries;
  
    }
    
    public void showWelcome(){
     System.out.println("Bem vindo ao Word Guesssing Game");
    }
    
    public boolean guess(char letter){
    
    for(int i=0;i<hiddenWord.length();i++){
     if( hiddenWord.charAt(i) == letter && guessedWord.charAt(i) == '_'){
         guessedWord = guessedWord.substring(0, i) + letter + guessedWord.substring(i + 1);   
        }
    }
  
    return guessedWord.equals(hiddenWord);

    }
    
    public void play(){
        char letter ;
        do{
         letter = reader.getChar("Coloque uma letra: ");
    }
    while(!guess(letter));
    showResult();
}
    public void showResult(){
        System.out.println("Parabens adivinhas-te a palavra " + hiddenWord + "em " + numberOfTries + "tentativas");
    }
    
     public String showGuessWord(){
     return guessedWord;
    }
    
    public String getHiddenWord() {
        return hiddenWord;
    }

    // Método seletor para obter a guessedWord
    public String getGuessedWord() {
        return guessedWord;
    }

    // Método seletor para obter o numberOfTries
    public int getNumberOfTries() {
        return numberOfTries;
    }

}
