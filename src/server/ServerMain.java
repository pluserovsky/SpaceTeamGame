/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Luk
 */
import captain.Captain;
import java.rmi.RemoteException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
 
public class ServerMain {
    static ServerImpl GameServer;
    static Context context;
     public static void main(String[] args) {
          try {
               GameServer = new ServerImpl();
               context = new InitialContext();
               context.bind("rmi:GameServer", GameServer);
               System.out.println("GameServer started.");  
          } catch (RemoteException | NamingException e) {
               e.printStackTrace();
          }
     }

}
