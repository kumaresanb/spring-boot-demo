package com.boot.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int stdId;
	private String name;

	private String className;
	@Autowired
	//By name search for bean object by use @Qualifier annotation 
	@Qualifier("book")
	private Book book;

	public Student() {
		System.out.println("Student object created...");
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", className=" + className + ", getStdId()=" + getStdId()
				+ ", getName()=" + getName() + ", getClassName()=" + getClassName() + "]";
	}

	public void studentShow() {
		System.out.println("Student Reference:" + this.toString());
		book.bookShow();
	}

}
