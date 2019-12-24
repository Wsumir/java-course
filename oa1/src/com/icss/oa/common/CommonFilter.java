package com.icss.oa.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ����������
 */
@WebFilter("/*")
public class CommonFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		/**
		//ת���������Ӧ����Ϊ������
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		//������Ӧ��ͷ����������������ǰ��
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		//***********��¼��֤����************
		
		//��õ�ǰwebӦ������
		String context = request.getContextPath();
		System.out.println("��ǰwebӦ�õ������ǣ�"+context);
		//����û���ǰ�����URI
		String uri = request.getRequestURI();
		System.out.println("��ǰ���ʵ���Դ������"+uri);
		
		//�ж��Ƿ���Ҫ��¼
		if (!uri.equals(context + "/login.html")
				&& !uri.equals(context + "/emp/login")
				&& !uri.startsWith(context + "/js")
				&& !uri.startsWith(context + "/css")
				&& !uri.startsWith(context + "/images")) {
			
			//�ж�session�е��û����Ƿ����
			HttpSession session = request.getSession();
			String empLoginName = (String) session.getAttribute("empLoginName");
			
			//���δ��¼���ض��򵽵�½����
			if (empLoginName == null) {
				response.sendRedirect(context + "/login.html");
				return;
			}
		}
					
		//����ִ������
		chain.doFilter(request, response);
		**/
		chain.doFilter(req, resp);
		System.out.println("aaa");
		System.out.println("bbb");
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}