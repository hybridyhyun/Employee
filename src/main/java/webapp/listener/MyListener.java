package webapp.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */

public class MyListener implements ServletContextListener {

	static Log Log = LogFactory.getLog(MyListener.class);
	
    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    		Log.info("#######################");
    		Log.info("contextDestroyed(..)");
    		Log.info("#######################");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
	    	Log.info("#######################");
			Log.info("contextInitialized(..)");
			Log.info("#######################");
			
			ServletContext application = sce.getServletContext();
			
			String className = application.getInitParameter("className");
			String url = application.getInitParameter("url");
			String user = application.getInitParameter("user");
			String password = application.getInitParameter("password");
			String location = application.getInitParameter("contextConfigLocation");
			
			Log.info("classNname=" + className);
			Log.info("url=" + url);
			Log.info("user=" + user);
			Log.info("password=" + password);
			Log.info("location=" + location);
    }
	
}
