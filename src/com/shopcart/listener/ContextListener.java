package com.shopcart.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.atuldwivedi.fw.db.ddl.DdlDao;
import com.atuldwivedi.fw.db.dml.DmlDao;
import com.atuldwivedi.fw.db.util.InstanceFactory;
import com.atuldwivedi.fw.db.util.LoadProperty;

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
		String dropExistingTables = contxt
				.getInitParameter("DropExistingTables");
		String insertBaseData = contxt
				.getInitParameter("InsertBaseData");

		
		String dbPropPath = contxt
				.getRealPath("WEB-INF//db//properties//db.properties");
		LoadProperty.load(dbPropPath);

		String getPath = contxt.getRealPath("WEB-INF//db//ddl//create-tables.sql");
		String getDmlFilePath = contxt.getRealPath("WEB-INF//db//dml//insert.sql");

		DdlDao ddlDao = InstanceFactory.getDdlDao();
		DmlDao dmlDao = InstanceFactory.getDmlDao();

		if (dropExistingTables != null
				&& dropExistingTables.equalsIgnoreCase("yes"))
			ddlDao.dropTables(getPath);

		if (createSchema != null && createSchema.equalsIgnoreCase("yes"))
			ddlDao.createTables(getPath);
		
		if (insertBaseData != null && insertBaseData.equalsIgnoreCase("yes"))
			dmlDao.insertBaseData(getDmlFilePath);
	}

}
