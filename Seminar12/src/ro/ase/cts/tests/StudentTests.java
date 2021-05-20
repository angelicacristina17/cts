package ro.ase.cts.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Cristian";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student=new Student();
		
		assertNotNull(student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test 
	public void testAdaugaNota() {
		Student student= new Student();
		
		int nota=5;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAdaugaNotaDimensiune() {
		Student student = new Student();
		
		student.adaugaNota(5);
		student.adaugaNota(8);
		assertEquals(2, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student= new Student();
		
		student.adaugaNota(6);
		student.adaugaNota(8);
		
		assertEquals(7, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testCalculeazaMedieCuONota() {
		Student student = new Student();
		student.adaugaNota(8);
		assertEquals(8, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testAreRestanteAdevarat() {
		Student student=new Student();
		student.adaugaNota(8);
		student.adaugaNota(3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testAreRestanteFalse() {
		Student student=new Student();
		student.adaugaNota(8);
		student.adaugaNota(9);
		assertFalse(student.areRestante());
	}
	
	
	
	
	
	
	
}
