package cn.bdqn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.PrintUtil;
import com.utils.ReturnResult;

import cn.bdqn.entity.Menu;
import cn.bdqn.entity.Stu;
import cn.bdqn.service.LoginService;
import cn.bdqn.serviceimpl.LoginServiceImpl;
import cn.bdqn.serviceimpl.MenuServiceImpl;

@WebServlet("/LeftServlet")
public class LeftServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LeftServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		LoginService qs = new LoginServiceImpl();
		String userName = request.getParameter("name");
		String password = request.getParameter("pwd");

		ReturnResult result = new ReturnResult();
		Stu lo = new LoginServiceImpl().Login(userName, password);
		if (lo != null) { // 验证用户名)
			if (lo.getLoginname().equals(userName) && lo.getPass().equals(password)) {// 验证密码
				List<Menu> list = new MenuServiceImpl().SelectAllMenu(Integer.valueOf(lo.getRoleid()));
				request.getSession().setAttribute("lo", lo);
				request.getSession().setAttribute("list", list);
				PrintUtil.write(true, response);

			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
