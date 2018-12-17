package com.boot.demo.domain;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {

	private int bookNo;
	private String bookTitle;
	private String author;

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}
	
	public void bookShow() {
		System.out.println("Book reference "+this.toString());
	}

}
