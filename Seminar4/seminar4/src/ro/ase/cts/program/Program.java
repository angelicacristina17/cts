package ro.ase.cts.program;

import ro.ase.cts.clase.Cafenea;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {

	public static void main(String[] args) {
		
		Presedinte presedinte1=Presedinte.getInstance();
		Presedinte presedinte2=Presedinte.getInstance();
		
//		System.out.println(presedinte1.toString());
//		System.out.println(presedinte2.toString());
		
		presedinte1.setNume("Basescu");
		presedinte2.setMandat(3);
		
//		System.out.println(presedinte1.toString());
//		System.out.println(presedinte2.toString());
		
		PresedinteLazy presedinteLazy1=PresedinteLazy.getInstance();
		PresedinteLazy presedinteLazy2=PresedinteLazy.getInstance();
		
//		System.out.println(presedinteLazy1.toString());
//		System.out.println(presedinteLazy2.toString());
		
		Cafenea cafenea1=Cafenea.getInstance("Axa", 20, 30);
		Cafenea cafenea2=Cafenea.getInstance("Vista", 5, 14);
		
		System.out.println(cafenea1.toString());
		System.out.println(cafenea2.toString());
		
		cafenea1.setNrMese(12);
		cafenea2.setNrSortimente(2);
		
		System.out.println(cafenea1.toString());
		System.out.println(cafenea2.toString());
		
		
	}
	
}
