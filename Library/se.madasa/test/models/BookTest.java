package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1a = new Book(1, "Sunken Tivoli", "Anny Gardens", "ISBN123", "Branchy", 200);
		Book book1b = new Book(1, "Sunken Tivoli", "Anny Gardens", "ISBN123", "Branchy", 200);

		assertEquals(book1a, book1b);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Sunken Tivoli", "Anny Gardens", "ISBN123", "Branchy", 200);
		Book book2 = new Book(2, "Grand Pier Walkout", "Anny Gardens", "ISBN987", "Brunch", 300);

		assertNotEquals(book1, book2);
	}

}
