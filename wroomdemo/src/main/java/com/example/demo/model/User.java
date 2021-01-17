package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_users")
public class User {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userid;
	@Column(name = "user_fname")
	private String userfname;
	@Column(name = "user_lname")
	private String userlname;
	@Column(name = "user_mobno")
	private String usermbno;
	@Column(name = "user_mail")
	private String usermail;
	@Column(name = "user_password")
	private String password;
	@Column(name = "user_address")
	private String useraddress;
	@Column(name = "user_dlno")
	private String userdlno;
	
	public User() {}
	
	

	public User(int userid, String userfname, String userlname, String usermbno, String usermail, String password,
			String useraddress, String userdlno) {
		super();
		this.userid = userid;
		this.userfname = userfname;
		this.userlname = userlname;
		this.usermbno = usermbno;
		this.usermail = usermail;
		this.password = password;
		this.useraddress = useraddress;
		this.userdlno = userdlno;
	}



	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserfname() {
		return userfname;
	}

	public void setUserfname(String userfname) {
		this.userfname = userfname;
	}



	public String getUserlname() {
		return userlname;
	}



	public void setUserlname(String userlname) {
		this.userlname = userlname;
	}



	public String getUsermbno() {
		return usermbno;
	}



	public void setUsermbno(String usermbno) {
		this.usermbno = usermbno;
	}



	public String getUsermail() {
		return usermail;
	}



	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUseraddress() {
		return useraddress;
	}



	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}



	public String getUserdlno() {
		return userdlno;
	}



	public void setUserdlno(String userdlno) {
		this.userdlno = userdlno;
	}
	
}
