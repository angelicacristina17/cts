package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> clienti;

	public FlyweightFactory() {
		this.clienti = new HashMap<>();
	}
	
	public Flyweight getFlyweight(String nrTelefon) {
		if(clienti.containsKey(nrTelefon)) {
			return clienti.get(nrTelefon); //aici se face shallow copy
		}else {
			Client client=new Client("-", nrTelefon, "-");
			clienti.put(nrTelefon, client);
			return client;
		}
	}
	
}
