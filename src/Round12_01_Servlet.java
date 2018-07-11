/**
 * 
 */


import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author tildev
 * @date 2018. 7. 8.
 */
public class Round12_01_Servlet extends GenericServlet{

	@Override
	public void init() {
		System.out.println("My01_서블릿 파일 초기화 부분!");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("My01_서블릿 내용 부분");
	}

	@Override
	public void destroy() {
		System.out.println("My01_서블릿 파일 데이터 소멸 부분!");
	}
	
}
