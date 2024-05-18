package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	void testDueDate() {
		Customer customer1 = new Customer("Alexander Romanov", "Alexander", "Romanov", "Himmelsway 2",
				"038176817", "Roman_Stroganoff@mail.com", 1, GenderType.MALE);
		Book book1 = new Book(1, "Sunken Tivoli", "Anny Gardens", "ISBN123", "Branchy", 200);
		Loan loan1 = new Loan(1, customer1, book1);

		LocalDate expectedDueDate = LocalDate.now().plusDays(14);
		LocalDate actualDueDate = loan1.getDueDate();

		assertEquals(expectedDueDate, actualDueDate);
   }
}