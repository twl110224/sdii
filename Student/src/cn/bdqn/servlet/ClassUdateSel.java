package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.PrintUtil;

import cn.bdqn.service.ClassService;
import cn.bdqn.serviceimpl.ClassSerImpl;


@WebServlet("/ClassUdateSel")
public class ClassUdateSel extends HttpServlet{
	private static final long serialVersionUID = 1L;
    public ClassUdateSel() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
		 String idd =request.getParameter("id"); 
		 Integer id=Integer.valueOf(idd);
		 System.out.println("id"+id);
		 ClassService qs=new ClassSerImpl();
		PrintUtil.write(qs.updateid(id), response);
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
