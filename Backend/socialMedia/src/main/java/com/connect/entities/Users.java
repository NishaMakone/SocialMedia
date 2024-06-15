package com.connect.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(name = "email", columnNames = { "email" }),
		@UniqueConstraint(name = "mobileNo", columnNames = { "mobileNo" })} )
public class Users {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private long mobileNo;

	public Users(int id, String userName, String password, String email, long mobileNo) {
		
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public Users() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", mobileNo=" + mobileNo + "]";
	}

}
