package it.polito.tdp.alien;

public class Word {

	private String alienWord;
	private String translation;

	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}

	// public String compare(String alienWord) {
	// return null;

	// }

	public String getTranslation() {
		return translation;
	}

}
