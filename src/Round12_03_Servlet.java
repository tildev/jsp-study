
/**
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tildev
 * @date 2018. 7. 8.
 */
public class Round12_03_Servlet extends HttpServlet {

	@Override
	public void init() {
		System.out.println("My03_서블릿 파일 초기화 부분!");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("My03_Head Request.");
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("My03_Get Request.");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("My03_Post Request.");
		out.close();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("My03_Put Request.");
		out.close();
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("My03_Delete Request.");
		out.close();
	}

	@Override
	public void destroy() {
		System.out.println("My03_서블릿 파일 데이터 소멸 부분!");
		// 서블릿 로그 파일에 메시지를 남긴다.
		log("서블릿 관련 데이터 소멸!");
	}

}
