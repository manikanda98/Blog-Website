package com.blog.entity;

import javax.persistence.*;
public class User {
	private int uid;
	private String userName;
	private String email;
	private String passHash;
	private String role;
	private boolean isEmailVerified;
		public User() {
		
	}
	
	public User(String userName, String email, String passHash, String role,int uid) {
		this.uid=uid;
		this.userName = userName;
		this.email = email;
		this.passHash = passHash;
		this.role =role;
		//this.isEmailVerified = isEmailVerified;
	}

	public User(String userName, String email, String passHash) {
		
		//this.uid =Integer.toString(this.generateUID(userName,email,passHash));
		this.userName = userName;
		this.email = email;
		this.passHash = passHash;
		this.role = "admin";
		//this.isEmailVerified = false;
	}

	private int generateUID(String userName, String email, String passHash) {
		String uid = new String();
		
		String charset = userName + email + passHash + "1234495678/*-+=!@#$%^&*";
		
		for(int i = 0; i < 13; i++) {
			uid += (int)charset.charAt(((int)(Math.random()*100))%charset.length());
		}
		
		return Integer.parseInt(uid.substring(0,7));
	}
	

	public int getUid() {
		return uid;
	}
	
	public void setUid(String userName,String email,String passHash) {
		this.uid =generateUID(userName, email, passHash);
	}
	public void setUid(int id) {
		this.uid =id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassHash() {
		return passHash;
	}
	
	public void setPassHash(String passHash) {
		this.passHash = passHash;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean isEmailVerified() {
		return isEmailVerified;
	}
	
	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", email=" + email + ", passHash=" + passHash + ", role="
				+ role + ", isEmailVerified=" + isEmailVerified + "]";
	}
	
	
	
}
