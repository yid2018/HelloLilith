package javaStuff;

import java.io.*;
import java.rmi.*;

import javax.naming.InsufficientResourcesException;

public class remoteExceptionTest {
	public void deposit(double amount) throws RemoteException, InsufficientFundsException{
		throw new RemoteException();
		
	}

}



