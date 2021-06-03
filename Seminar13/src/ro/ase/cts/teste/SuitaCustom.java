package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.teste.categorii.ConstructorGrupaCategory;
import ro.ase.cts.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.teste.categorii.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({TesteGrupaMock.class, TesteGrupa.class, TesteUrgente.class})
//@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory({GetPromovabilitateCategory.class, ConstructorGrupaCategory.class})
public class SuitaCustom {

}
