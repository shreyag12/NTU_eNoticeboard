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

@WebServlet("/deleteNotice")
public class RemoveNotice extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8789293164878565075L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		if (id == null || "".equals(id)) {
			throw new ServletException("id missing for delete operation");
		}
		MongoClient mongo = (MongoClient) request.getServletContext()
				.getAttribute("MONGO_CLIENT");
		NoticeDAO noticeDAO = new NoticeDAO(mongo);
		Notice notice = new Notice();
		notice.setId(id);
		noticeDAO.deleteNotice(notice);
		System.out.println("Notice deleted successfully with id=" + id);
		request.setAttribute("success", "Notice deleted successfully");
		List<Notice> notices = noticeDAO.readAllNotice();
		request.setAttribute("notices", notices);

		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				"/Notice.jsp");
		rd.forward(request, response);
	}

}
