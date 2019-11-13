package com.sprinapp1.model;

public class TextEditor {
	
	private  SpellChecker spellChecker;

	
	 public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}

	public TextEditor() {
		}
	  
/*	 public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}*/

	public void  Write(){
		 
		 System.out.println("Writing starts");
		 spellChecker.checks();
	 }
}
