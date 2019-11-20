import java.rmi.Naming;

import javax.swing.JOptionPane;

public class Client {
	private static InterfaceRMI remoteObject;
	
	public static void main(String[] args) throws Exception {
		try {
			
			remoteObject = (InterfaceRMI) Naming.lookup("//localhost/MeuServidor");
			
			String name = JOptionPane.showInputDialog("Insira seu nome: ");
			String responseFromServer = remoteObject.helloWorld(name);
			
			System.out.println("Soma 5 + 6 = " + remoteObject.sum(5,6));
			
			JOptionPane.showMessageDialog(null, responseFromServer);
						
		}catch(Exception ex) {
			throw ex;
		}
	}
}
