
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

    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";
        
        
  
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
