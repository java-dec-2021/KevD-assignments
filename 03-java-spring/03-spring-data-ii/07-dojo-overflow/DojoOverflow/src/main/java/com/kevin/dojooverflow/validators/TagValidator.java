package com.kevin.dojooverflow.validators;



import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.kevin.dojooverflow.models.Question;

@Component
public class TagValidator  {

    public boolean supports(Class<?> clazz) {
        return Question.class.equals(clazz);
    }
    
    
    
    public void validate(Object target, Errors errors) {
        Question question = (Question) target;
        String [] tags = question.getFrontEndTags().split("' ");
        if(tags.length > 3) {
        	errors.rejectValue("frontEndTags", "Too Many", "Must have three tags or less!");
        }
        
        
    }
}
