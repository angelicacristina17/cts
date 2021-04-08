package ro.ase.cts.clase;

public interface ISediu {
	public void afiseazaDescriere();
	public void addNod(ISediu sediu) throws Exception;
	public void deleteNod(ISediu sediu) throws Exception;
	public ISediu getNode(int pozitie) throws Exception;

}
