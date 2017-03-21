package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienDictionary {

	private Map<String, Word> parole;

	public AlienDictionary() {
		this.parole = new HashMap<>();
	}

	public void addWord(String alienWord, String translation) {

		Word w = new Word(alienWord, translation);
		parole.put(alienWord, w);

	}

	public String translateWord(String alienWord) {

		if (parole.containsKey(alienWord)) {
			return parole.get(alienWord).getTranslation();
		}

		return null;

	}
	
	public boolean containsNumbers(String daControllare){
		
		String pattern = "(.*)(\\d+)(.*)";
		Pattern p= Pattern.compile(pattern);
		Matcher mParola= p.matcher(daControllare);
		return mParola.find();
	}

}
