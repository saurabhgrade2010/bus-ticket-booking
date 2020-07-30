package com.incture.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Users")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="user_first_name")
	private String user_first_name;
	
	@Column(name="usre_last_name")
	private String user_last_name;
	
	@Column(name="user_email")
	private String user_email;
	
	@Column(name="user_mobile")
	private String user_mobile;
	
	
	public User(int user_id,String user_first_name,String user_last_name,String user_email,String user_mobile)
	{
		super();
		this.user_id = user_id;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
	}
	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_first_name=" + user_first_name + ", user_last_name="
				+ user_last_name + ", user_email=" + user_email + ", user_mobile=" + user_mobile + "]";
	}


	public User()
	{
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_first_name() {
		return user_first_name;
	}

	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}

	public String getUser_last_name() {
		return user_last_name;
	}

	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}
	
	
	
}
