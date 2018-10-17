package com.noticeboard.services.Implementation;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.noticeboard.model.Notice;
import com.noticeboard.model.Status;
import com.noticeboard.services.NoticeService;

@Path("noticecatalog")
public class NoticeServiceImpl implements NoticeService {

	@GET
	@Path("search/category/{category}")
	@Produces(MediaType.APPLICATION_JSON)
	public Notice[] searchByCategory(@PathParam("category") String category) {
		List notices = new ArrayList();
		for (Object n : noticeCatalog) {
			if (category != null && category.equalsIgnoreCase(((Notice) n).getCategoryId())) {
				notices.add(n);
			}
		}
		return (Notice[]) notices.toArray(new Notice[notices.size()]);
	}

	@GET
	@Path("search")
	@Produces(MediaType.APPLICATION_JSON)
	public Notice[] searchByDepartment(@QueryParam("department") String department) {
		List notices = new ArrayList();
		// Product tempProd = (Product)noticeCatalog;
		for (Object n : noticeCatalog) {
			if (department != null && department.equalsIgnoreCase(((Notice) n).getDepartmentId())) {
				notices.add(n);
			}
		}
		return (Notice[]) notices.toArray(new Notice[notices.size()]);
	}

	@Override
	public void insertNotice(Notice notice) {
		// TODO Auto-generated method stub

	}

	private static List noticeCatalog;

	public NoticeServiceImpl() {
		initializeNoticeCatalog();
	}
	/*
	 * @GET
	 * 
	 * @Path("search/category/{category}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Notice[]
	 * searchByCategory(@PathParam("category") String category) { List products =
	 * new ArrayList(); for (Object p : noticeCatalog) { if (category != null &&
	 * category.equalsIgnoreCase(((Product) p).getCategory())) { products.add(p); }
	 * } return (Product[]) products.toArray(new Product[products.size()]); }
	 */
	/*
	 * @GET
	 * 
	 * @Path("search")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Product[]
	 * searchByName(@QueryParam("name") String name) { List products = new
	 * ArrayList(); //Product tempProd = (Product)noticeCatalog; for (Object p :
	 * noticeCatalog) { if (name != null && name.toLowerCase().startsWith(((Product)
	 * p).getName().toLowerCase())) { products.add(p); } } return (Product[])
	 * products.toArray(new Product[products.size()]); }
	 */

	@POST
	@Path("insertNotice")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Status insert(Notice notice) {
		noticeCatalog.add(notice);
		return new Status("SUCCESS", "Inserted " + notice.getTitle());
	}

	private void initializeNoticeCatalog() {
		// if (noticeCatalog == null) {
		noticeCatalog = new ArrayList();
		Notice testNotice = new Notice();
		testNotice.setAddress("Graduate Hall 1");
		testNotice.setCategoryId("2");
		testNotice.setContactNumber("123456");
		testNotice.setDeadline("26-10-2018");
		testNotice.setDepartmentId("WKWSCI");
		testNotice.setDescription("This is a sample notice");
		noticeCatalog.add(testNotice);
		/*
		 * noticeCatalog.add(new Product(1, "Keyboard", "Electronics", 29.99D));
		 * noticeCatalog.add(new Product(2, "Mouse", "Electronics", 9.95D));
		 * noticeCatalog.add(new Product(3, "17\" Monitor", "Electronics", 159.49D));
		 * noticeCatalog.add(new Product(4, "Hammer", "Hardware", 9.95D));
		 * noticeCatalog.add(new Product(5, "Screwdriver", "Hardware", 7.95D));
		 * noticeCatalog.add(new Product(6, "English Dictionary", "Books", 11.39D));
		 * noticeCatalog.add(new Product(7, "A House in Bali", "Books", 15.99D));
		 * noticeCatalog.add(new Product(8, "An Alaskan Odyssey", "Books", 799.99D));
		 * noticeCatalog.add(new Product(9, "LCD Projector", "Electronics", 1199.19D));
		 * noticeCatalog.add(new Product(10, "Smart Thermostat", "Electronics",
		 * 1199.19D));
		 */

	}

}
