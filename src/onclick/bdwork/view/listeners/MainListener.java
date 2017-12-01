package onclick.bdwork.view.listeners;

import java.sql.Connection;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import onclick.bdwork.database.ConnectionDatabase;

/**
 * Application Lifecycle Listener implementation class MainListener
 *
 */
@WebListener
public class MainListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MainListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ConnectionDatabase.closeConnection();
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	
    	Connection connection = ConnectionDatabase.getConnection();
    	System.out.println(ConnectionDatabase.status);
    	
    }
	
}
