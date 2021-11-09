package dictionary2;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author nam
 */
public class Dictionary {
    static List <Word> lib= new ArrayList<>();			//chua cac tu
	public static void newWord(String eng, String vie) {	//add them tu vao tu dien
            Word a=new Word(eng,vie);
            lib.add(a);
	}
}
