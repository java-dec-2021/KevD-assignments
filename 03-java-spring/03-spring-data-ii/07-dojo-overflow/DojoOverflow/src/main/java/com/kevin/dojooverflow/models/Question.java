package com.kevin.dojooverflow.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="questions")
public class Question {
	public Question() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min=1, max=255)
	private String questionText;
	@Transient
	private String frontEndTags;
	
	@OneToMany(mappedBy="quest", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Answer> answers;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="question_tag",
			joinColumns=@JoinColumn(name="question_id"),
			inverseJoinColumns=@JoinColumn(name="tag_id")
			)
	private List<Tag> questionTags;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getFrontEndTags() {
		return frontEndTags;
	}

	public void setFrontEndTags(String frontEndTags) {
		this.frontEndTags = frontEndTags;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Tag> getQuestionTags() {
		return questionTags;
	}

	public void setQuestionTags(List<Tag> questionTags) {
		this.questionTags = questionTags;
	}
	
	
	


}
