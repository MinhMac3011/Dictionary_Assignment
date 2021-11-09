
package dictionary2;

import java.util.Scanner;
import java.io.*;
import java.util.Collections;

public class DictionaryManagement {
	/////////////////////////////////////////////////////////
	//nhap word tu file
	public static void insertFromFile () {
            Dictionary.lib.removeAll(Dictionary.lib);
            try{
                Scanner sc=new Scanner(new FileInputStream("dictionaries.txt"));
                while (sc.hasNext()) {
                    String eng=sc.next();
                    String vie=sc.next() + sc.nextLine();
                    Dictionary.newWord(eng,vie);
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
            Collections.sort(Dictionary.lib, new sortDict());
            //System.out.println("Finished inserting!");
	}
	

	
	/////////////////////////////////////////////////////////
	//xoa tu
	public static boolean deleteWord(String eng) {
            boolean noWord=true;

            for (Word a:Dictionary.lib) {	//tim tu can xoa trong tu dien
                if (a.word_target.contentEquals(eng)) {
                    Dictionary.lib.remove(a);
                    noWord=false;
                    break;
                }
            }
            return noWord;
	}
	
	/////////////////////////////////////////////////////////
	//update tu
	public static void updateWord() {
            System.out.print("type the word you want to update: ");
            Scanner sc=new Scanner(System.in);
            String eng=sc.nextLine();
            boolean noWord=true;

            for (Word a:Dictionary.lib) {	//tim tu can update trong tu dien
                if (a.word_target.contentEquals(eng)) {
                    System.out.print("update english word: ");
                    a.word_target=sc.nextLine();
                    System.out.print("update meaning: ");
                    a.word_explain=sc.nextLine();
                    noWord=false;
                    break;
                }
            }

            if (noWord) {
                System.out.println(eng+" does not exist in this dictionary");
            }
            else {
                System.out.println("Finished updating!");
                Collections.sort(Dictionary.lib, new sortDict());
            }
		
	}
	
	/////////////////////////////////////////////////////////
	//xuat tu dien ra file
	public static void dictionaryExportToFile()	{
            try{ 
                PrintWriter out = new PrintWriter(new FileWriter("dictionaries.txt"));
                for (Word a:Dictionary.lib) {
                    out.println(a.word_target +"	"+a.word_explain);
                }
                out.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
	}
}