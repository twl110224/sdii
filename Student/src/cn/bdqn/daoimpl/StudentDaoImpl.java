package cn.bdqn.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bdqn.Dao.Basedao;
import cn.bdqn.Dao.StudentDao;
import cn.bdqn.entity.Menu;
import cn.bdqn.entity.Stu;

public class StudentDaoImpl extends Basedao implements StudentDao{
	Connection conn = null;
	PreparedStatement pre = null;
	ResultSet rs = null;
	Stu yo = new Stu();

	@Override
	public List<Stu> selectLimt(String uname, int startIndex, int maxlength) {
		List<Stu> list = new ArrayList<Stu>();
		List<Object> param = new ArrayList<Object>();
		// 获得Connection数据库连接
		conn = getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT s.id,s.name,s.loginname,s.pass,c.name,r.name FROM `stu` s,`class` c,`role` r WHERE s.classid=c.id AND s.roleid=r.id");
		try {
			pre = conn.prepareStatement(sb.toString());
			
			rs = pre.executeQuery();
			while (rs.next()) {
				Stu yo = new Stu();
				yo.setId(rs.getInt(1));
				yo.setName(rs.getString(2));
				yo.setLoginname(rs.getString(3));
				yo.setPass(rs.getString(4));
				yo.setClassString(rs.getString(5));
				yo.setRoleString(rs.getString(6));
				list.add(yo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(conn, pre, rs);
		}

		return list;
	}

	@Override
	public int countLimt(String uname) {
		int count = 0;
		List<Object> param = new ArrayList<Object>();
		// 1.获得Connection数据库连接
		conn = this.getConnection();
		// 2. 编写sql语句
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT COUNT(1) FROM `stu` WHERE 1=1\n");
		if (uname != null && uname.length() > 0) {
			sb.append(" AND name LIKE CONCAT('%',?,'%')\n");
			param.add(uname);
		}
		try {
			// 3. 创建PreparedStatement执行对象
			pre = conn.prepareStatement(sb.toString());
			if (param.size() > 0) {
				for (int i = 0; i < param.size(); i++) {
					pre.setObject(i + 1, param.get(i));
				}
			}
			// 5. 执行查询，并获得ResultSet对象
			rs = pre.executeQuery();// 是无参方法
			// 6. 解析ResultSet对象，把每行记录转为FinancingProduct对象
			while (rs.next()) {// 每调用一次next()，数据库的游标会读取一行记录
				// 把每行记录转为FinancingProduct对象
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(conn, pre, rs);
		}
		return count;
	}

	@Override
	public int deleted(int id) {
		conn = this.getConnection();
		String sql = "DELETE FROM `stu` WHERE id=?";
		// 2.提供替换?的object[]
		Object[] obj = { id };
		// 执行新增操作
		return this.getSIDU(sql, obj);
	}

	@Override
	public int updated(Stu ys) {
		String sql = "UPDATE stu SET `name`=?,loginname=?,pass=? WHERE id=?";
		// 2.提供替换?的object[]
		Object[] obj = { ys.getName(), ys.getLoginname(), ys.getPass(), ys.getId() };
		return this.getSIDU(sql, obj);
	}

	@Override
	public Stu updateid(int id) {
		conn = this.getConnection();
		Stu ys = new Stu();
		String sql = "SELECT * FROM stu WHERE id=?";
		try {
			pre = conn.prepareStatement(sql);
			pre.setObject(1, id);
			rs = pre.executeQuery();// 无惨方法
			while (rs.next()) {
				ys.setId(rs.getInt(1));
				ys.setName(rs.getString(2));
				ys.setLoginname(rs.getString(3));
				ys.setPass(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ys;
	}

	@Override
	public int insertd(Stu ys) {
		conn = this.getConnection();
		String sql = "INSERT INTO stu(`name`,loginname,pass,classid,roleid) VALUES(?,?,?,?,?)";
		// 2.提供替换?的object[]
		Object[] obj = { ys.getName(), ys.getLoginname(), ys.getPass(), ys.getClassid(), ys.getRoleid() };
		// 执行新增操作
		return this.getSIDU(sql, obj);
	}

}
