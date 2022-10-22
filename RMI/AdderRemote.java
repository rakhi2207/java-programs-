import java.rmi.*;
import java.rmi.server.*;
interface Adder extends Remote{
	public int add(int x,int y)throws RemoteException;
	public int sub(int x,int y)throws RemoteException;
	public int mul(int x,int y)throws RemoteException;
	public int div(int x,int y)throws RemoteException;
}
class AdderRemote extends UnicastRemoteObject implements Adder{
	AdderRemote()throws RemoteException{
		super();
	}
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public int div(int x,int y){
		return x/y;
	}
} 
