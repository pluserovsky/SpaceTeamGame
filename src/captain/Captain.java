/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captain;

import java.rmi.RMISecurityManager;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import server.ServerInterface;

/**
 *
 * @author Luk
 */
public class Captain {

    public Captain() throws NamingException{
        main(null);
    }
    public static void main(String[] args) throws NamingException {
        System.setSecurityManager(new RMISecurityManager());
        String url = "rmi://localhost/";
        try {
            Context context = new InitialContext();
            ServerInterface gameServer = (ServerInterface) context.lookup(url + "GameServer");
            String str = gameServer.getDescription("Captain connected.");
            System.out.println("Captain:" + str);
            //context.unbind("Luk");
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Gui().setVisible(true);
                }
            });
            
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
