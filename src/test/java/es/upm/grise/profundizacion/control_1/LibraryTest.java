package es.upm.grise.profundizacion.control_1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class LibraryTest {



	@Test
	public void aniadirLibros() {
		Book libro1 = new Book("Los tres cerditos");
		ArrayList<Book> libros = new ArrayList<Book>();
		libros.add(libro1);


		Assert.assertEquals("Los tres cerditos", libros.get(0).getTitle());
	}

/*
	@Test
	public void excepcionLibros() {

		Book libro1 = new Book("El principito");
		Book libro2 = new Book("El principito");
		ArrayList<Book> libros = new ArrayList<Book>();
		libros.add(libro1);

		//Assert.assertThrows(DuplicatedBookException.class , () -> libros.add(libro2));
	}*/


	/*
	@Test
	public void borrarLibros() {

		Book libro1 = new Book("Los tres cerditos");
		ArrayList<Book> libros = new ArrayList<Book>();
		Library libreria = new Library();


		libros.add(libro1);

		Assert.assertEquals(0, libros.size());
	}*/


}
