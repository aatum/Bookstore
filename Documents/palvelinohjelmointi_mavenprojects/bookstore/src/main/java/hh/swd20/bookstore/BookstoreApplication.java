package hh.swd20.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.bookstore.domain.Book;
import hh.swd20.bookstore.domain.BookRepository;
import hh.swd20.bookstore.domain.Category;
import hh.swd20.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner BookDemo(BookRepository brepository, CategoryRepository crepository) {
		return (args) -> {
			log.info("save new books");
			log.info("save new categories");

			crepository.save(new Category("Fantasy"));
			crepository.save(new Category("Thriller"));
			crepository.save(new Category("Dystopian"));
			crepository.save(new Category("Sci-Fi"));

			brepository.save(new Book("Nineteen Eighty-Four", "George Orwell", 1949, "30303030", 10.00,
					crepository.findByName("Dystopian").get(0)));
			brepository.save(new Book("Holes", "Louis Sachar", 1998, "40404040", 8.50,
					crepository.findByName("Dystopian").get(0)));
			brepository.save(new Book("The Hobbit", "J.R.R. Tolkien", 1937, "50505050", 5.50,
					crepository.findByName("Fantasy").get(0)));
			log.info("fetch all books");
			for (Book book : brepository.findAll()) {
				log.info(book.toString());
			}

		};

	}
}
