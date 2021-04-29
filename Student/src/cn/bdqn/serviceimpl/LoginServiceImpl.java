package cn.bdqn.serviceimpl;
import cn.bdqn.Dao.LoginDao;
import cn.bdqn.daoimpl.LoginDaoImpl;
import cn.bdqn.entity.Stu;
import cn.bdqn.service.LoginService;
public class LoginServiceImpl implements LoginService{
	
	LoginDao qu=new LoginDaoImpl();
		
	@Override
	public Stu Login(String loginname, String pass) {
		// TODO Auto-generated method stub
		return qu.Login(loginname, pass);
	}

}
