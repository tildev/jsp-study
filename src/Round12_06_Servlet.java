
/**
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tildev
 * @date 2018. 7. 12.
 */
public class Round12_06_Servlet extends HttpServlet {

	@Override
	public void init() {
		System.out.println("My06_서블릿 파일 초기화 부분!");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// MIME과 문자 세트를 지정.
		resp.setContentType("text/html;charset=utf-8");

		// 텍스트 출력 스트림을 획득.
		PrintWriter out = resp.getWriter();

		// MIME을 text/html 로 지정해서 HTML 형식으로 응답하게 된다.
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h2>요청에 응답합니다.</h2>");

		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		// 응답 버퍼에 남아있는 내용을 강제로 클라이언트에게 보낸다. 여기서는 필요없는 작업.
		resp.flushBuffer();
		// 출력 스트림 모두 종료.
		out.close();

	}

	@Override
	public void destroy() {
		System.out.println("My06_서블릿 파일 데이터 소멸 부분!");
		// 서블릿 로그 파일에 메시지를 남긴다.
		log("서블릿 관련 데이터 소멸!");
	}

}
