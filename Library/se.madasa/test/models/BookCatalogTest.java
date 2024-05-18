package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	@BeforeEach
	public void setUp() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	void testAddABook() {
		assertEquals(1, bc.getNumberOfBooks());
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException{
		assertEquals(book1, bc.findBook("learning java"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException{
		assertEquals(book1, bc.findBook("   Learning Java   "));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		try {
			bc.findBook("The Book that Never Was");
			fail("The Book that Never Was, was never found, throwing exception");
		}
		catch (BookNotFoundException bnfe) {
			System.err.println("The book was never found, so an exception was thrown");
		}
	}

}
