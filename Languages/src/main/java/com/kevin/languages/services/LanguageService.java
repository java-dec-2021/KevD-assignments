package com.kevin.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kevin.languages.repositories.LanguageRepository;
import com.kevin.languages.models.Language;
import org.springframework.validation.BindingResult;
@Service
public class LanguageService {
	 private final LanguageRepository langRepo;
	    
	    public LanguageService(LanguageRepository lRepo) {
	        this.langRepo = lRepo;
	    }
	    
	    public List<Language> allLanguages() {
	        return langRepo.findAll();
	    }
	    
	    public Language createLanguage(Language createdLang) {
	        return langRepo.save(createdLang);
	    }
	    
	    public Language findLanguage(Long id) {
	        return this.langRepo.findById(id).orElse(null);
	        }
	    
	    public Language updateLanguage(Language updatedLang) {
	    	return this.langRepo.save(updatedLang);
	    }
	    
	    public void deleteLanguage(Long id) {
	    	this.langRepo.deleteById(id);
	    }
	    
	    }

