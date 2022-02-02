package com.kevin.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.dojooverflow.models.Answer;
import com.kevin.dojooverflow.models.Question;
import com.kevin.dojooverflow.models.Tag;
import com.kevin.dojooverflow.repositories.AnswerRepository;
import com.kevin.dojooverflow.repositories.QuestionRepository;
import com.kevin.dojooverflow.repositories.TagRepository;

@Service
public class doService {
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;
	
	public Tag getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQuestion = new ArrayList<Tag>();
		String[] tagsToProcess=tags.split(", ");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getOneTag(s);
				tagsForQuestion.add(tagToAdd);
			} else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQuestion.add(this.getOneTag(s));
			}
	}
		return tagsForQuestion;
}
	
	public Question createQuestion(Question question) {
		question.setQuestionTags(this.splitTags(question.getFrontEndTags()));
		return this.qRepo.save(question);
	}
	
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
		
	}
	
	public List<Question> getAllQuestions() {
		return this.qRepo.findAll();
	}
	
	public Question findOneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
}
