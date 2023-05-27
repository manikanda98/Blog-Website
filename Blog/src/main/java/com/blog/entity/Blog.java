package com.blog.entity;

import java.io.InputStream;

public class Blog {

	private int id;
	private String Blog_Title;
	private String content_type;
	private InputStream B_image;
	private String Content;
	private String date;
	private String bid;

	public Blog(int id, String blog_Title, String content_type, InputStream b_image, String content, String date) {
		super();
		this.id = id;
		Blog_Title = blog_Title;
		this.content_type = content_type;
		B_image = b_image;
		Content = content;
		this.date = date;
	}
	public Blog(int id, String blog_Title, String content_type, InputStream b_image, String content, String date,String bid) {
		super();
		this.id = id;
		Blog_Title = blog_Title;
		this.content_type = content_type;
		B_image = b_image;
		Content = content;
		this.date = date;
		this.bid=bid;
	}


 String blogId(int id, String blog_title, String c_type,String date) {
		String bid = new String();

		String charset = id + blog_title + c_type+ date + "1234495678/*-+=!@#$%^&*";

		for (int i = 0; i < 13; i++) {
			bid += (int) charset.charAt(((int) (Math.random() * 100)) % charset.length());
		}

		return (bid.substring(0, 7));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBid() {
		return bid;
	}
	public void setBid(int i, String blog_title, String c_type,String date ) {
		this.bid = blogId(i, blog_title,c_type,date);
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getUId() {
		return id;
	}

	public void setUId(int id) {
		this.id = id;
	}

	public String getBlog_Title() {
		return Blog_Title;
	}

	public void setBlog_Title(String blog_Title) {
		Blog_Title = blog_Title;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public InputStream getB_image() {
		return B_image;
	}

	public void setB_image(InputStream b_image) {
		B_image = b_image;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", Blog_Title=" + Blog_Title + ", content_type=" + content_type + ", B_image="
				+ B_image + ", Content=" + Content + ", date=" + date + "]";
	}

}
