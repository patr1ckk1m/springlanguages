package com.patrick.languages.services;
import com.patrick.languages.models.*;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class LanguageService {
	private List<Language> languages = new ArrayList(Arrays.asList(
			new Language("Java", "James Gosling", "1.8")
			));
	
	public List<Language> allLanguages() {
		return languages;
	}
	
    public void addLanguage(Language language) {
        languages.add(language);
    }
}
