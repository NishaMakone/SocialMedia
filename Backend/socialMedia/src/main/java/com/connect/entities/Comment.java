package com.connect.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
	
	@Id
	private int id;
	
	private String comment;

	public Comment(int id, String comment) {
		this.id = id;
		this.comment = comment;
	}

	public Comment() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + "]";
	}
	
}
