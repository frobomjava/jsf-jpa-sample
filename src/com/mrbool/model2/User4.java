package com.mrbool.model2;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User4 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	@Column(name="nameUser", nullable=false, unique=false)
	private String nameUser; 
	@Column(name="password", nullable=false, unique=false)
	private String password; 
	
	
	public User4 (){
		super();
	}
	
	public User4(int id, String nameUser,String password) {
	      super( );
	      this.id = id;
	      this.nameUser = nameUser;
	      this.password = password;
	      
	   }
	
	public String getNameUser() { 
		return nameUser; 
	} 
	
	public void setNameUser(String nameUser) { 
		this.nameUser = nameUser; 
	} 
	
	public String getPassword() { 
		return password; 
		
	} 
	public void setPassword(String password) { 
		this.password = password; 
	} 
	
}
