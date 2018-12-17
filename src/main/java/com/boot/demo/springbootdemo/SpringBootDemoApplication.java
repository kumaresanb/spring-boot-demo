package com.boot.demo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.boot.demo.domain.Book;
import com.boot.demo.domain.Student;

@SpringBootApplication
@ComponentScan("com.boot.demo")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		Student std=context.getBean(Student.class);
		Book book=context.getBean(Book.class);
		std.setStdId(2432);
		std.setName("kumaresan");
		std.setClassName("A");
		book.setBookNo(3423);
		book.setBookTitle("Java Core");
		book.setAuthor("Aniish");
		std.setBook(book);
		std.studentShow();
		
		Student std1=context.getBean(Student.class);
		Book book1=context.getBean(Book.class);
		std1.setStdId(2333);
		std1.setName("ravi");
		std1.setClassName("B");
		book1.setBookNo(2442);
		book1.setBookTitle("Spring");
		book1.setAuthor("Prashanth");
		std1.setBook(book1);
		std1.studentShow();
	}

}

