package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Author;
import dmacc.beans.Book;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.BookRepository;

@SpringBootApplication
public class SpringBooksApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBooksApplication.class, args);
	}

	@Autowired
	BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//  Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Book b = appContext.getBean("book",Book.class);
		b.setTitle("Java");
		repo.save(b);
		
		Book c = new Book("Java For Everyone","non-fiction",306);
		Author a = new Author("Cay","Horstmann",20);
		c.setAuthor(a);
		repo.save(c);
		
		List<Book> allMyBooks = repo.findAll();
		for(Book book: allMyBooks) {
			System.out.println(book.toString());
		}
		
		((AbstractApplicationContext)appContext).close();
		
	}

}
