package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.PrintUtil;

import cn.bdqn.entity.Stu;
import cn.bdqn.service.StudentService;
import cn.bdqn.serviceimpl.StudentServiceImpl;


@WebServlet("/XiuGaiStudent")
public class XiuGaiStudent extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XiuGaiStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		StudentService qs=new StudentServiceImpl();
		String idd =request.getParameter("id"); 
		Integer id=Integer.valueOf(idd);
		String name=request.getParameter("name");
	       
	    String loginname=request.getParameter("loginname");
	    String pass=request.getParameter("pass");
	    String classids=request.getParameter("classid");
	    int classid=Integer.valueOf(classids);
	    String roleids=request.getParameter("roleid");
	    int roleid=Integer.valueOf(roleids);
        Stu ys=new Stu();
        ys.setId(id);
        ys.setName(name);
        ys.setLoginname(loginname);
        ys.setPass(pass);
        ys.setClassid(classid);
        ys.setRoleid(roleid);
        int num=-1;
        if (qs.updated(ys)){
    	   num=1;
    	   System.out.println("dd"+num);
	    }
         
         PrintUtil.write(num, response);
  
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
