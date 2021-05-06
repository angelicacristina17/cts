package ro.ase.cts.clase;

public class NotificatorSMS extends Notificator{

	@Override
	public void trimiteNotificare(Client client, String text) {
		if(client.getNrTelefon()!=null) {
			System.out.println("Se trimite SMS catre "+client.getNume()+" Mesaj: "+text);
		}
		else {
			if(super.getNotificator()!=null) {
			this.getNotificator().trimiteNotificare(client, text);
			}else {
				System.out.println("Domnule Manager, nu exista date de contact pentru clientul "+client.getNume());
			}
		}
		
	}

}
