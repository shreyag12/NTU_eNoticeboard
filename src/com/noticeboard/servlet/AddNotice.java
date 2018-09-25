
package com.noticeboard.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noticeboard.DAO.*;
import com.noticeboard.model.Notice;
import com.mongodb.MongoClient;

@WebServlet("/addNotice")
public class AddNotice extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5702130901952388969L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		if ((title == null || title.equals(""))) {
			request.setAttribute("error", "Mandatory Parameters Missing");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Notice.jsp");
			rd.forward(request, response);
		} else {
			Notice notice = new Notice();
			notice.setTitle(title);
			MongoClient mongo = (MongoClient) request.getServletContext().getAttribute("MONGO_CLIENT");
			NoticeDAO noticeDAO = new NoticeDAO(mongo);
			noticeDAO.createNotice(notice);
			System.out.println("Notice created Successfully with id=" + notice.getId());
			request.setAttribute("success", "Notice created Successfully ");
			List<Notice> notices = noticeDAO.readAllNotice();
			request.setAttribute("notices", notices);

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Notice.jsp");
			rd.forward(request, response);
		}
	}

}
