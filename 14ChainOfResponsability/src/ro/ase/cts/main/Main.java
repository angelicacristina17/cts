package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.NotificatorEmail;
import ro.ase.cts.clase.NotificatorSMS;

public class Main {
	public static void main(String[] args) {
		Client client1=new Client("Ion", null, null);
		Client client2=new Client("Maria", "0712345678", null);
		Client client3=new Client("Cristi", null, "cristi@gmail.com");
		Client client4=new Client("Ana", "0712365478", "ana@gmail.com");
		
		NotificatorSMS notificatorSMS=new NotificatorSMS();
		NotificatorEmail notificatorEmail= new NotificatorEmail();
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client3, "mesaj1");
		notificatorSMS.trimiteNotificare(client2, "mesaj2");
		notificatorSMS.trimiteNotificare(client1, "mesaj");
		notificatorSMS.trimiteNotificare(client4, "mesaj3");
	}
}


















