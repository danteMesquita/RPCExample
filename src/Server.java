import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements InterfaceRMI {
	
	private static final long serialVersionUID = 1L;
	
	public Server() throws RemoteException {
		super();
	}
	
	@Override
	public String helloWorld(String name) throws RemoteException {
		System.err.println("Recebida requisição de: " + name);
		return "Hello World " + name;
	}
	
	@Override
	public int sum(int n1, int n2) throws RemoteException {
		return n1+n2;		
	}
	
	public static void main(String[] args) {
		try {
			Naming.rebind("MeuServer", new Server());
			System.err.println("Servidor está pronto!");
		}catch(Exception ex) {
			System.err.println("Erro: " + ex.toString());
			ex.printStackTrace();
		}
	}
}
