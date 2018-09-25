package com.noticeboard.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noticeboard.DAO.NoticeDAO;
import com.noticeboard.model.Notice;
import com.mongodb.MongoClient;

@WebServlet("/editNotice")
public class UpdateNotice extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6257268115491191996L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		if (id == null || "".equals(id)) {
			throw new ServletException("id missing for edit operation");
		}
		System.out.println("Notice edit requested with id=" + id);
		MongoClient mongo = (MongoClient) request.getServletContext().getAttribute("MONGO_CLIENT");
		NoticeDAO noticeDAO = new NoticeDAO(mongo);
		Notice notice = new Notice();
		notice.setId(id);
		notice = noticeDAO.readNotice(notice);
		request.setAttribute("notice", notice);
		List<Notice> notices = noticeDAO.readAllNotice();
		request.setAttribute("persons", notices);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Notice.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id"); // keep it non-editable in UI
		if (id == null || "".equals(id)) {
			throw new ServletException("id missing for edit operation");
		}

		String title = request.getParameter("title");

		if ((title == null || title.equals(""))) {
			request.setAttribute("error", "Title Can't be empty");
			MongoClient mongo = (MongoClient) request.getServletContext().getAttribute("MONGO_CLIENT");
			NoticeDAO noticeDAO = new NoticeDAO(mongo);
			Notice notice = new Notice();
			notice.setId(id);
			notice.setTitle(title);
			request.setAttribute("notice", notice);
			List<Notice> notices = noticeDAO.readAllNotice();
			request.setAttribute("notices", notices);

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Notice.jsp");
			rd.forward(request, response);
		} else {
			MongoClient mongo = (MongoClient) request.getServletContext().getAttribute("MONGO_CLIENT");
			NoticeDAO noticeDAO = new NoticeDAO(mongo);
			Notice notice = new Notice();
			notice.setId(id);
			notice.setTitle(title);
			noticeDAO.updateNotice(notice);
			System.out.println("Notice edited successfully with id=" + id);
			request.setAttribute("success", "Notice edited successfully");
			List<Notice> notices = noticeDAO.readAllNotice();
			request.setAttribute("notices", notices);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Notice.jsp");
			rd.forward(request, response);
		}
	}

}
