package ro.ase.cts.clase;

public class DecoratorLaMultiAni extends DecoratorAbstract {

	public DecoratorLaMultiAni(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}
	
	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}

}