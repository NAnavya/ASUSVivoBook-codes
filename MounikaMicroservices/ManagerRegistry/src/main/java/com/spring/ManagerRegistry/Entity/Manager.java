

package com.spring.ManagerRegistry.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Manager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private long loanamount;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Manager() {
	}
	public Manager(long id, String username, String password, long loanamount) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.loanamount = loanamount;
		this.email=email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(long loanamount) {
		this.loanamount = loanamount;
	}

}

