package com.blog.entity;

public class Likes {
     private int uid;
     private int bid;
     private int count;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Likes [uid=" + uid + ", bid=" + bid + ", count=" + count + "]";
	}
     
     
}
