import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRMI extends Remote {
	public String helloWorld(String name) throws RemoteException;
	public int sum(int n1, int n2) throws RemoteException;
}
