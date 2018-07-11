
/**
 * 
 */

import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tildev
 * @date 2018. 7. 12.
 */
public class Round12_05_Servlet extends HttpServlet {

	@Override
	public void init() {
		System.out.println("My05_서블릿 파일 초기화 부분!");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자 인증을 사용하지 않아 Null 반환
		String auth_type = req.getAuthType();
		// 프로젝트의 이름 반환
		String context_path = req.getContextPath();
		// GET 방식의 요청이므로 GET 반환
		String method = req.getMethod();
		// URL의 웹 경로상 부가 정보가 없어서 Null 반환
		String path_info = req.getPathInfo();
		// path_info가 Null 이어서 실제 가상 머신의 경로상으로도 부가 정보가 없음.
		String path_translated = req.getPathTranslated();
		// 주소 표시줄의 ? 기호 다음 데이터인 값이 반환.
		String query_string = req.getQueryString();
		// 사용자 인증을 사용하지 않아서 Null 반환
		String remote_user = req.getRemoteUser();
		// 세션이 없으므로 Null 반환
		String requested_sessionid = req.getRequestedSessionId();
		// URI를 반환.
		String request_uri = req.getRequestURI();
		// URL을 반환
		StringBuffer request_url = req.getRequestURL();
		// web.xml 파일에 등록된 실제 서블릿 이름 반환
		String servlet_path = req.getServletPath();
		// 사용자 인증을 사용하지 않아서 Null 객체 생성
		Principal principal = req.getUserPrincipal();

		System.out.println();
		System.out.println("auth_type = " + auth_type);
		System.out.println("context_path = " + context_path);
		System.out.println("method = " + method);
		System.out.println("path_info = " + path_info);
		System.out.println("path_translated = " + path_translated);
		System.out.println("query_string = " + query_string);
		System.out.println("remote_user = " + remote_user);
		System.out.println("requested_sessionid = " + requested_sessionid);
		System.out.println("request_uri = " + request_uri);
		System.out.println("request_url = " + request_url);
		System.out.println("servlet_path = " + servlet_path);
		System.out.println("principal = " + principal);
		System.out.println();

		// 세션을 사용하지 않아서 False 반환
		boolean is_requested_sessionid_from_cookie = req.isRequestedSessionIdFromCookie();
		// 세션을 사용하지 않아서 False 반환
		boolean is_requested_sessionid_from_url = req.isRequestedSessionIdFromURL();
		// 세션을 사용하지 않아서 False 반환
		boolean is_requested_sessionid_valid = req.isRequestedSessionIdValid();
		// 사용자 인증을 사용하지 않아서 False 를 반환
		boolean is_user_in_role = req.isUserInRole("");

		System.out.println();
		System.out.println("is_requested_sessionid_from_cookie = " + is_requested_sessionid_from_cookie);
		System.out.println("is_requested_sessionid_from_url = " + is_requested_sessionid_from_url);
		System.out.println("is_requested_sessionid_valid = " + is_requested_sessionid_valid);
		System.out.println("is_user_in_role = " + is_user_in_role);
		System.out.println();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String auth_type = req.getAuthType();
		String context_path = req.getContextPath();
		String method = req.getMethod();
		String path_info = req.getPathInfo();
		String path_translated = req.getPathTranslated();
		String query_string = req.getQueryString();
		String remote_user = req.getRemoteUser();
		String requested_sessionid = req.getRequestedSessionId();
		String request_uri = req.getRequestURI();
		StringBuffer request_url = req.getRequestURL();
		String servlet_path = req.getServletPath();
		Principal principal = req.getUserPrincipal();

		System.out.println();
		System.out.println("auth_type = " + auth_type);
		System.out.println("context_path = " + context_path);
		System.out.println("method = " + method);
		System.out.println("path_info = " + path_info);
		System.out.println("path_translated = " + path_translated);
		System.out.println("query_string = " + query_string);
		System.out.println("remote_user = " + remote_user);
		System.out.println("requested_sessionid = " + requested_sessionid);
		System.out.println("request_uri = " + request_uri);
		System.out.println("request_url = " + request_url);
		System.out.println("servlet_path = " + servlet_path);
		System.out.println("principal = " + principal);
		System.out.println();

		boolean is_requested_sessionid_from_cookie = req.isRequestedSessionIdFromCookie();
		boolean is_requested_sessionid_from_url = req.isRequestedSessionIdFromURL();
		boolean is_requested_sessionid_valid = req.isRequestedSessionIdValid();
		boolean is_user_in_role = req.isUserInRole("");

		System.out.println();
		System.out.println("is_requested_sessionid_from_cookie = " + is_requested_sessionid_from_cookie);
		System.out.println("is_requested_sessionid_from_url = " + is_requested_sessionid_from_url);
		System.out.println("is_requested_sessionid_valid = " + is_requested_sessionid_valid);
		System.out.println("is_user_in_role = " + is_user_in_role);
		System.out.println();

	}

	@Override
	public void destroy() {
		System.out.println("My05_서블릿 파일 데이터 소멸 부분!");
		// 서블릿 로그 파일에 메시지를 남긴다.
		log("서블릿 관련 데이터 소멸!");
	}

}
