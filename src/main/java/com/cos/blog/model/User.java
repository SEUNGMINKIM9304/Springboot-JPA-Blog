package com.cos.blog.model;

import java.security.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity //테이블 자동생성
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//자동생성 
	private long id;//sequence
	
	@Column(nullable = false, length=30)
	private String username;
	
	@Column(nullable = false, length=100)
	private String password;
	
	@Column(nullable = false, length=50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp createDate;
	
}
