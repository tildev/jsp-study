
/**
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author tildev
 * @date 2018. 7. 8.
 */
public class Round12_02_Servlet extends GenericServlet {

	@Override
	public void init() {
		System.out.println("My02_서블릿 파일 초기화 부분!");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("My02_서블릿 내용 부분");

		String name = "noname";

		// 클라이언트의 화면에 출력하기 위해 응답 객체(response)를 가지고 텍스트 출력 스트림 획등
		PrintWriter out = response.getWriter();

		// 텍스트 출력 스트림을 가지고 HTML로 메시지를 전송
		out.println("<html>");
		out.println("<body>");
		out.println("HELLO SERVLET!<br>");
		out.println("My Name is " + name + "!");
		out.println("</body>");
		out.println("</html>");

		// 텍스트 출력 스트림을 닫는다.
		out.close();

	}

	@Override
	public void destroy() {
		System.out.println("My02_서블릿 파일 데이터 소멸 부분!");
		// 서블릿 로그 파일에 메시지를 남긴다.
		log("서블릿 관련 데이터 소멸!");
	}

}
