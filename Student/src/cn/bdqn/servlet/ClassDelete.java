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

@WebServlet("/ClassDelete")
public class ClassDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ClassDelete() {
        super();
       
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				request.setCharacterEncoding("UTF-8");
				ClassService qs=new ClassSerImpl();
				String uname=request.getParameter("id");
				int idd=Integer.parseInt(uname);
				PrintUtil.write(qs.deleteclass(idd), response);
				
	}

}
