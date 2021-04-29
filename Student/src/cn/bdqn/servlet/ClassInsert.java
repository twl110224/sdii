package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.PrintUtil;

import cn.bdqn.entity.Class;
import cn.bdqn.service.ClassService;
import cn.bdqn.serviceimpl.ClassSerImpl;

@WebServlet("/ClassInsert")
public class ClassInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ClassInsert() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ClassService qs=new ClassSerImpl();
		/*
		 * String idd =request.getParameter("id"); Integer id=Integer.valueOf(idd);
		 */
       String name=request.getParameter("name");
       Class ys=new Class();
      // ys.setId(id);
       ys.setName(name);
       
       int num=-1;
       if (qs.insertcalss(ys)){
    	   num=1;
    	   System.out.println("dd"+num);
	}
      
       PrintUtil.write(num, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
				
	}
}
