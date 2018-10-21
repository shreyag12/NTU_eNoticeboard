package servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.noticeboard.DAO.NoticeDAO;
import com.noticeboard.model.Notice;

/**
 * Servlet implementation class noticeServlet
 */
@WebServlet("/noticeServlet")
@MultipartConfig
public class noticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public noticeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		String title = request.getParameter("title");
		String cnumber  = request.getParameter("contact number");
		String oname = request.getParameter("Organizer name");
		String url = request.getParameter("url");
		String startdate = request.getParameter("sdate");
		String starttime = request.getParameter("stime");
		String enddate = request.getParameter("edate");
		String endtime = request.getParameter("etime");
		String category = request.getParameter("category");
		String department = request.getParameter("department");
		String latitude = request.getParameter("lat");
		String longitude = request.getParameter("long");
		System.out.println(longitude);
		Part filePart = request.getPart("Image");
		InputStream inputStream = filePart.getInputStream();
		String realPath = getServletContext().getRealPath("Image");
		File imageFile = new File(realPath);
//		File imageFile = new File("/home/shreya/Downloads/IMG_20180520_184045.jpg");
		System.out.println(realPath);
		String description = request.getParameter("description");
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		Notice n = new Notice();
		n.setTitle(title);
		n.setCnumber(cnumber);
		n.setOname(oname);
		n.setUrl(url);
		n.setSdate(startdate);
		n.setStime(starttime);
		n.setEdate(enddate);
		n.setEtime(endtime);
		n.setDescription(description);
		n.setCategory(category);
		n.setDepartment(department);
		NoticeDAO noticeDAO = new NoticeDAO(mongoClient);
		noticeDAO.createNotice(n,imageFile);
//		List<Notice> titles = noticeDAO.readAllTitle();
//		for(Notice temp:titles) {
//			System.out.println(temp.getTitle());
//		}


}
}
