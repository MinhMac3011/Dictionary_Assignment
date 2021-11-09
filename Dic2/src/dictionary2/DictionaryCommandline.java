package dictionary2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

 class DictionaryCommandLine {
    public static void showAllWords() {
            System.out.println("No		|English			|Vietnamese");
            int i=1;
            for (Word a:Dictionary.lib) {		//duyet tat ca phan tu trong arrayList
                    System.out.println( i + "		|" + a.word_target + "				|" +a.word_explain);
                    i++;
            }
    }

    public static List<Word> dictionarySearcher() {		
        List <Word> words=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("type your character sequence: ");
        String temp=sc.nextLine();
        System.out.println("found word(s): ");
        for(Word a:Dictionary.lib) {
            if (a.word_target.substring(0,temp.length()).equals(temp)) {
                words.add(a);
                System.out.println(a.word_target);
            }
        }

        return words;
    }	
}