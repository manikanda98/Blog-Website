package com.blog.entity;

import java.util.Arrays;

public class UserData {
	private String profileImg;
	private String facebookLink;
	private String linkedInLink;
	private String twitterLink;
	private String youtubeLink;
	private String[] blogIds;
	private String[] intrestedTags;
	private String profileTitle;
	
	public UserData(String profileImg, String facebookLink, String linkedInLink, String twitterLink, String youtubeLink,
			String[] blogIds, String[] intrestedTags, String profileTitle) {
		this.profileImg = profileImg;
		this.facebookLink = facebookLink;
		this.linkedInLink = linkedInLink;
		this.twitterLink = twitterLink;
		this.youtubeLink = youtubeLink;
		this.blogIds = blogIds;
		this.intrestedTags = intrestedTags;
		this.profileTitle = profileTitle;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getLinkedInLink() {
		return linkedInLink;
	}

	public void setLinkedInLink(String linkedInLink) {
		this.linkedInLink = linkedInLink;
	}

	public String getTwitterLink() {
		return twitterLink;
	}

	public void setTwitterLink(String twitterLink) {
		this.twitterLink = twitterLink;
	}

	public String getYoutubeLink() {
		return youtubeLink;
	}

	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public String[] getBlogIds() {
		return blogIds;
	}

	public void setBlogIds(String[] blogIds) {
		this.blogIds = blogIds;
	}

	public String[] getIntrestedTags() {
		return intrestedTags;
	}

	public void setIntrestedTags(String[] intrestedTags) {
		this.intrestedTags = intrestedTags;
	}

	public String getProfileTitle() {
		return profileTitle;
	}

	public void setProfileTitle(String profileTitle) {
		this.profileTitle = profileTitle;
	}

	@Override
	public String toString() {
		return "UserData [profileImg=" + profileImg + ", facebookLink=" + facebookLink + ", linkedInLink="
				+ linkedInLink + ", twitterLink=" + twitterLink + ", youtubeLink=" + youtubeLink + ", blogIds="
				+ Arrays.toString(blogIds) + ", intrestedTags=" + Arrays.toString(intrestedTags) + ", profileTitle="
				+ profileTitle + "]";
	}
	
}
