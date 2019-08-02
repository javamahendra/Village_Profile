package com.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
@Entity
@Table(name="user_likes")
public class UserLikes {
	
	@Id
	private Long id;
	
	private String likesid;
	private Long likes;
	private Long shares;
	
	//private List<String> userids;	
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date updateDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLikes() {
		return likes;
	}
	public void setLikes(Long likes) {
		this.likes = likes;
	}
	public Long getShares() {
		return shares;
	}
	public void setShares(Long shares) {
		this.shares = shares;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getLikesid() {
		return likesid;
	}
	public void setLikesid(String likesid) {
		this.likesid = likesid;
	}
	@Override
	public String toString() {
		return "UserLikes [id=" + id + ", likesid=" + likesid + ", likes=" + likes + ", shares=" + shares
				+ ", createdDate=" + createdDate + ", updateDate=" + updateDate + "]";
	}	
}
