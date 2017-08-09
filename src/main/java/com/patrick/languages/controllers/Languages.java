package com.patrick.languages.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import com.patrick.languages.models.Language;
import com.patrick.languages.services.LanguageService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.*;

import javax.validation.Valid;

@Controller
public class Languages {

		private final LanguageService languageService;
		
		public Languages(LanguageService languageService) {
			this.languageService = languageService;
		}
		
		@RequestMapping("/languages")
		public String languages(@ModelAttribute("language") Language language, Model model) {
			List<Language> languages = languageService.allLanguages();
			model.addAttribute("languages", languages);
			return "index.jsp";
		}
		
	    @PostMapping("/languages/new")
	    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "redirect:/languages";
	        }else{
	        	languageService.addLanguage(language);
	            return "redirect:/languages";
	        }
	    }
	    
	    @RequestMapping("/languages/{index}")
	    public String findLanguageByIndex(Model model, @PathVariable("index") int index) {
	        Language language = languageService.findLanguageByIndex(index);
	        model.addAttribute("language", language);
	        return "showLanguage.jsp";
	    }
	    
	    @RequestMapping(value="/languages/delete/{id}")
	    public String destroyLanguage(@PathVariable("id") int id) {
	        languageService.destroyLanguage(id);
	        return "redirect:/languages";
	    }
		
}
