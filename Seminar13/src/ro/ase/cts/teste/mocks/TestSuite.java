package ro.ase.cts.teste.mocks;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.teste.TesteGrupa;
import ro.ase.cts.teste.TesteGrupaFixture;
import ro.ase.cts.teste.TesteGrupaMock;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TesteGrupa.class,
	TesteGrupaFixture.class,
	TesteGrupaMock.class
})
public class TestSuite {

}
