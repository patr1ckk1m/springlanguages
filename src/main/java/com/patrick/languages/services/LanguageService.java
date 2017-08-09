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
    
    public Language findLanguageByIndex(int index) {
        if (index < languages.size()){
            return languages.get(index);
        }else{
            return null;
        }
    }
    
    public void updateLanguage(int id, Language language) {
        if (id < languages.size()){
            languages.set(id, language);
        }
    }
    
    public void destroyLanguage(int id) {
        if (id < languages.size()){
            languages.remove(id);
        }
    }
}
