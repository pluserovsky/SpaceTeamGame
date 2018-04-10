/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

/**
 *
 * @author Luk
 */
public class ServerImpl extends UnicastRemoteObject 
          implements ServerInterface{
    
    protected ServerImpl() throws RemoteException {
        super();
        System.setProperty("java.rmi.server.hostname","192.168.56.1");  
     }
    @Override
    public String getDescription(String text) throws RemoteException {
        System.out.println("Server:" + 
               text);
          return ": " + text;
    }
    
}
