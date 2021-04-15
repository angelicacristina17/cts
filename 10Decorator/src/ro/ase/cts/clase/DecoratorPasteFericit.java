package ro.ase.cts.clase;

public class DecoratorPasteFericit extends DecoratorAbstract {

	public DecoratorPasteFericit(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: Paste fericit!");
		
	}

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		super.printeaza();
		System.out.println("Paste fericit!");
	}
}