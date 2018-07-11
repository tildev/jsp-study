
/**
 * 
 */

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tildev
 * @date 2018. 7. 12.
 */
public class Round12_04_Servlet extends HttpServlet {

	@Override
	public void init() {
		System.out.println("My04_서블릿 파일 초기화 부분!");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 받는 서버의 IP 주소 획득
		String local_addr = req.getLocalAddr();
		// 요청 받는 서버의 이름 획득
		String local_name = req.getLocalName();
		// 요청 받는 서버에서 Listen 상태로 있는 포트 번호 획득. 톰캣 기본 포트 = 8080
		int local_port = req.getLocalPort();

		System.out.println();
		System.out.println("local_addr = " + local_addr);
		System.out.println("local_name = " + local_name);
		System.out.println("local_port = " + local_port);
		System.out.println();

		// 요청을 하는 클라이언트의 IP주소를 획득
		String remote_addr = req.getRemoteAddr();
		// 요청을 하는 클라이언트의 이름 획득. 이름이 없으면 클라이언트의 IP 주소가 출력
		String remote_host = req.getRemoteHost();
		// 클라이언트가 서버와 통신하기 위해 열어 둔 포트 번호 획득
		int remote_port = req.getRemotePort();

		System.out.println();
		System.out.println("remote_addr = " + remote_addr);
		System.out.println("remote_host = " + remote_host);
		System.out.println("remote_port = " + remote_port);
		System.out.println();

		// 요청에 있는 내용부의 길이를 획득
		int content_length = req.getContentLength();
		// 요청에 있는 내용부의 MIME을 획득
		String content_type = req.getContentType();

		System.out.println();
		System.out.println("content_length = " + content_length);
		System.out.println("content_type = " + content_type);
		System.out.println();

		// 요청을 인식하기에 적절한 지역(Locale)을 획득.
		Locale locale = req.getLocale();
		// 요청을 인식하기에 적절한 지역 모두를 획득.
		Enumeration locales = req.getLocales();

		System.out.println();
		System.out.println("locale = " + locale);

		while (locales.hasMoreElements()) {
			System.out.println("locales = " + (Locale) locales.nextElement());
		}
		System.out.println();

		// 요청에 사용된 프로토콜을 획득.
		String protocol = req.getProtocol();
		// 요청에 사용된 스킴을 획득.
		String scheme = req.getScheme();
		// 요청을 받는 서버의 이름을 획득.
		String server_name = req.getServerName();
		// 요청을 받는 서버의 포트 번호 획득.
		int server_port = req.getServerPort();
		// 보안 요청인지의 여부를 획득. ex) HTTPS
		boolean secure = req.isSecure();

		System.out.println();
		System.out.println("protocol = " + protocol);
		System.out.println("scheme = " + scheme);
		System.out.println("server_name = " + server_name);
		System.out.println("server_port = " + server_port);
		System.out.println("secure = " + secure);
		System.out.println();

	}

	@Override
	public void destroy() {
		System.out.println("My04_서블릿 파일 데이터 소멸 부분!");
		// 서블릿 로그 파일에 메시지를 남긴다.
		log("서블릿 관련 데이터 소멸!");
	}

}
