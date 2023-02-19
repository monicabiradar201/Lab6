package com.greatlearning.studentmgmtsys.model;


import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import antlr.collections.List;

import javax.persistence.JoinColumn;



@Entity 
@Table(name="users")

public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="user_id")
		private int id; 
		@ManyToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
		@JoinTable(name="user_roles",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="role_id"))

		private String userName;
		private String password;

}
