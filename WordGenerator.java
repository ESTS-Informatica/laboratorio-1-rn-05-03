import java.util.ArrayList;
import java.util.Random;
/**
 
Escreva uma descrição da classe WordGenerator aqui.
@author (seu nome)
@version (um número da versão ou uma data)
*/
public class WordGenerator{
    private ArrayList<String> words;
    private Random random;

    public WordGenerator(){
        words = new ArrayList<>();
        fillArrayList();
    }
    private void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    public ArrayList<String> getWords(){
        return words;
    }
    public String generateWord(){
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
    public void addWord(String userWord){
     if(userWord != null){
        words.add(userWord);
     } else {
         System.out.println("Não é possível adicionar uma palavra nula");
     }
    }
}
