package dictionary2;
import java.util.Comparator;
/**
 *
 * @author nam
 */
class sortDict implements Comparator<Word> {		//sap xep cac tu theo thu tu tu dien
    @Override
    public int compare(Word a, Word b) {
	return a.word_target.compareTo(b.word_target);
    }	
}
