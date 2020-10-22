package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Author;
import dmacc.beans.Book;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book();
		bean.setGenre("Non-Fiction");
		return bean;
	}
	
	@Bean
	public Author author() {
		Author bean = new Author("first","last",10);
		return bean;
	}
}
