package com.noticeboard.listener;

import java.net.UnknownHostException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mongodb.MongoClient;
import com.noticeboard.DAO.DAOConnection;

@WebListener
public class NoticeboardContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		MongoClient mongo = (MongoClient) sce.getServletContext().getAttribute("MONGO_CLIENT");
		mongo.close();
		System.out.println("MongoClient closed successfully");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext ctx;
		MongoClient mongo;
		try {
			ctx = sce.getServletContext();
			mongo = DAOConnection.getMongoClient();
			System.out.println("MongoClient initialized successfully");
			ctx.setAttribute("MONGO_CLIENT", mongo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
