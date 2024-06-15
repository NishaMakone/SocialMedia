package com.connect.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hashtag {

	@Id
	private int hashtagId;
	private String hashtagName;
	
	public Hashtag(int hashtagId, String hashtagName) {
		this.hashtagId = hashtagId;
		this.hashtagName = hashtagName;
	}

	public Hashtag() {
		
	}

	public int getHashtagId() {
		return hashtagId;
	}

	public void setHashtagId(int hashtagId) {
		this.hashtagId = hashtagId;
	}

	public String getHashtagName() {
		return hashtagName;
	}

	public void setHashtagName(String hashtagName) {
		this.hashtagName = hashtagName;
	}

	@Override
	public String toString() {
		return "Hashtag [hashtagId=" + hashtagId + ", hashtagName=" + hashtagName + "]";
	}
		
}
