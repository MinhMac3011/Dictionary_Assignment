package dictionary2;


/**
 *
 * @author nam
 */
public class Word {
    public String word_target;		//english
    public String word_explain;		//vietnamese
	
    Word(String eng, String vie) {	//constructor
        word_target=eng;
        word_explain=vie;
    }
}