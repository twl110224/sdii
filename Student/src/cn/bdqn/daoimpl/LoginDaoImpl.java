package cn.bdqn.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.bdqn.Dao.Basedao;
import cn.bdqn.Dao.LoginDao;
import cn.bdqn.entity.Stu;

public class LoginDaoImpl extends Basedao implements LoginDao{
	Connection conn=getConnection();
	PreparedStatement pre=null;
	ResultSet rs=null;
	@Override
	public Stu Login(String loginname, String pass) {
		Stu yo=new Stu();
		String sql="SELECT `id`,roleid,`loginname`,`pass` FROM `stu` WHERE `loginname`=? AND `pass`=?";
		try {
			pre=conn.prepareStatement(sql);
			pre.setString(1,loginname);
			pre.setString(2,pass);
			rs=pre.executeQuery();
			while(rs.next()){
				yo.setId(rs.getInt(1));
				yo.setRoleid(rs.getInt(2));
				yo.setLoginname(rs.getString(3));
				yo.setPass(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yo;
	}

}
