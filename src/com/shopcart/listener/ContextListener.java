package com.shopcart.listener;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.atuldwivedi.fw.db.util.DatabaseManager;

/**
 * Application Lifecycle Listener implementation class ContextListener
 * 
 */
@WebListener
public class ContextListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ContextListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext contxt = arg0.getServletContext();

		String createSchema = contxt.getInitParameter("CreateSchema");

		if (createSchema != null && createSchema.equalsIgnoreCase("yes")) {
			String dbPropPath = contxt.getRealPath("WEB-INF//db//properties//db.properties");
			String ddlFilPath = contxt.getRealPath("WEB-INF//db//ddl//create-tables.sql");
			String dmlFilePath = contxt.getRealPath("WEB-INF//db//dml//insert.sql");

			DatabaseManager.runSchemaScreator(dbPropPath, ddlFilPath, dmlFilePath, "");
		}
	}
}
